/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.lexico;

import java.util.ArrayList;

/**
 *
 * @author Hélio
 */
public class Analizador {

    private final ArrayList<Token> tokens = new ArrayList<>();
    private final ArrayList<Simbolo> simbolos = new ArrayList<>();
    private String error = "";
    private int coluna = 0;
    private int linha = 1;
    private String lexema = "";
    private int estado = 0;
    private char caracter;

    public ArrayList<Token> getTokens() {
        return new ArrayList<>(tokens);
    }

    public String getError() {
        return this.error;
    }

    public ArrayList<Simbolo> getSimbolos() {
        return new ArrayList<>(simbolos);
    }

    
    public Analizador(String texto) {
        String[] linhas;
        linhas = separar(texto);
        
        //Chamar a função analizar para cada
        //linha do código inserido
        for (String it : linhas) {
            this.coluna = 0;
            this.analizar(it + " ");
            this.linha++;
        }
    }

    private String[] separar(String texto) {
        String[] linhas = texto.split("\n");
        return linhas;
    }

    private void analizar(String linha) {

        for (int i = 0; i < linha.length(); i++) {
            caracter = linha.charAt(i);
            switch (estado) {
                case 0: {
                    analizarNovaPalavra();
                    break;
                }
                
                //Iniciou o lexema com uma letra
                case 1: {
                    //Não terminou de ler o lexema
                    if ((Character.isLetter(caracter) || Character.isDigit(caracter)) && !Character.isWhitespace(caracter)) {
                        lexema += caracter;

                        //Já terminou de ler o lexema
                    } else {
                        //TODO chamar o analizador sintatico para adicionar os simbolos
                        //e fazer todo esse bloco de código
                        Simbolo id = new Simbolo(lexema.toLowerCase());
                        int endereco = 0;
                        //É uma palavra reservada
                        if (!simbolos.contains(id) && !PalavrasReservadas.contains(id.getLexema().toLowerCase())) {
                            endereco = simbolos.size();
                            id.setEndereco(endereco);
                            simbolos.add(id);
                        } else if (simbolos.contains(id) && !PalavrasReservadas.contains(id.getLexema().toLowerCase())) {
                            endereco = simbolos.indexOf(id);
                        }
                        if (PalavrasReservadas.contains(lexema.toLowerCase())) {
                             adicionarNovoToken("Palavra Reservada");
                        } else {
                            Token token = new Token("cID", this.lexema, this.linha, this.coluna, endereco);
                            tokens.add(token);
                        }
                        i--;
                        this.coluna--;
                        estado = 0;
                    }
                    break;
                }
                
                //O lexema é um numero
                case 2: {
                    //Não terminou de ler a parte inteira do numero
                    if ((Character.isDigit(caracter)) && !Character.isWhitespace(caracter)) {
                        lexema += caracter;
                    //Numero tem parte decimal
                    } else if (caracter == '.') {
                        lexema += caracter;
                        estado = 3;
                    //O lexema é um numero inteiro
                    } else {
                        adicionarNovoToken("cInt");
                        i--;
                        this.coluna--;
                        estado = 0;
                    }
                    break;
                }
                //O lexema é um numero decimal
                case 3: {
                    if ((Character.isDigit(caracter))) {
                        lexema += caracter;
                        estado = 4;
                    } else {
                        error += "Erro" + "(" + this.linha + "," + i + ")" + " , necessário digito após ponto flutuante \n";
                        i--;
                        this.coluna--;

                        estado = 0;
                    }
                    break;
                }
                //O lexema é um numero decimal
                case 4: {
                    if ((Character.isDigit(caracter)) && !Character.isWhitespace(caracter)) {
                        lexema += caracter;
                    } else {
                        adicionarNovoToken("cReal");
                        i--;
                        this.coluna--;
                        estado = 0;
                    }
                    break;
                }
                case 5: {
                    if (caracter == '=') {
                        lexema += caracter;
                        adicionarNovoToken("cAtr");
                        estado = 0;
                    } else {
                        adicionarNovoToken("cDPto");
                        i--;
                        this.coluna--;
                        estado = 0;
                    }
                    break;
                }
                case 6: {

                    switch (caracter) {
                        case '=': {
                            lexema += caracter;
                            adicionarNovoToken("cLE");
                            break;
                        }
                        case '>': {
                            lexema += caracter;
                            adicionarNovoToken("cNE");
                            break;
                        }
                        default: {
                            adicionarNovoToken("cLT");
                            i--;
                            this.coluna--;
                            break;
                        }
                    }
                    estado = 0;
                    break;
                }
                case 7: {
                    if (caracter == '=') {
                        lexema += caracter;
                        adicionarNovoToken("cGE");
                    } else {
                        adicionarNovoToken("cGT");
                        i--;
                        this.coluna--;

                    }
                    estado = 0;
                    break;
                }
                case 8: {
                    if ((Character.isLetter(caracter) || Character.isDigit(caracter)) && !Character.isWhitespace(caracter)) {
                        lexema += caracter;
                        estado = 8;
                    } else if (caracter == '"') {
                        lexema += caracter;
                        adicionarNovoToken("cStr");
                        estado = 0;
                    } else {
                        lexema += '"';
                        this.error += ("Atenção" + "(" + this.linha + "," + i + ")" + " , Cadeia de caracteres terminando sem aspas \n");
                        adicionarNovoToken("cStr");
                        i--;
                        this.coluna--;
                        estado = 0;
                    }
                    break;
                }
                default:
                    break;
            }
            
            this.coluna++;
        }
    }

    private void adicionarNovoToken(String tipo) {
        int colunaDoPrimeiroCaracterDoLexema = coluna - lexema.length();
        Token token = new Token(tipo, lexema, linha, colunaDoPrimeiroCaracterDoLexema, tokens.size());
        tokens.add(token);
    }

    private void analizarNovaPalavra() {
        lexema = "";

        // Se iniciar com letra -> Identificador
        if ((Character.isLetter(caracter))) {
            lexema += caracter;
            estado = 1;

            // Se iniciar com número -> Número
        } else if ((Character.isDigit(caracter))) {
            lexema += caracter;
            estado = 2;

            //é algum simbolo
        } else {
            switch (caracter) {
                // Se iniciar com aspas -> Cadeira de caracteres
                case '"':
                    lexema += caracter;
                    estado = 8;
                    break;
                case ':':
                    lexema += caracter;
                    estado = 5;
                    break;
                case '(':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cLPar");
                    break;
                case ')':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cDPar");
                    break;
                case '[':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cLCha");
                    break;
                case ']':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cRCha");
                    break;
                case '+':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cAdd");
                    break;
                case '-':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cSub");
                    break;
                case '*':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cMul");
                    break;
                case '/':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cDiv");
                    break;
                case '=':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cEQ");
                    break;
                case '<':
                    lexema += caracter;
                    estado = 6;
                    break;
                case '>':
                    lexema += caracter;
                    estado = 7;
                    break;
                case ';':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cPVir");
                    break;
                case ',':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cVir");
                    break;
                case '.':
                    lexema = Character.toString(caracter);
                    adicionarNovoToken("cPto");
                    break;
            }
        }
    }
}
