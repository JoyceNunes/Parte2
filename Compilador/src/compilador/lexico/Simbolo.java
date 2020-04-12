/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.lexico;

/**
 *
 * @author Hélio
 */
public class Simbolo {
    private String lexema;
    private String categoria;
    private String tipo;
    private int endereco;

    public Simbolo(String lexema) {
        this.lexema = lexema;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Simbolo)) {
            return false;
        }
        final Simbolo other = (Simbolo) obj;
        return this.getLexema().equals(other.getLexema());
    }

    public String getLexema() {
        return lexema;
    }
    
    public void setLexema(String lex) {
        this.lexema = lex;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }
}
