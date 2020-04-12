/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import compilador.lexico.Token;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hélio
 */
public class TokenTableModel extends AbstractTableModel {

    private ArrayList<Token> tokens = new ArrayList<>();
    private String[] colunas = { "Lexema", "Classe", "Linha", "Coluna", "Endereço" };
    
    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    @Override
    public int getRowCount() {
        return tokens.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0:
                return tokens.get(linha).getLexema();
            case 1:
                return tokens.get(linha).getClasse();
            case 2:
                return tokens.get(linha).getLinha();
            case 3:
                return tokens.get(linha).getColuna();
            case 4: 
                return tokens.get(linha).getEndereco();
        }
        return null;
    }
    
    public void addRow(Token token) {
        tokens.add(token);
        this.fireTableDataChanged();
    }
    
    public void clear() {
        tokens.clear();
    }
    
}
