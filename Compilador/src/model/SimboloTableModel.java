/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import compilador.lexico.Simbolo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hélio
 */
public class SimboloTableModel extends AbstractTableModel {
    
    private ArrayList<Simbolo> simbolos = new ArrayList<>();
    private String[] colunas = { "Lexema", "Categoria", "Tipo", "Endereço" };

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    @Override
    public int getRowCount() {
        return simbolos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0:
                return simbolos.get(linha).getLexema();
            case 1:
                return simbolos.get(linha).getCategoria();
            case 2:
                return simbolos.get(linha).getTipo();
            case 3:
                return simbolos.get(linha).getEndereco();
        }
        return null;
    }
    
    public void addRow(Simbolo simbolo) {
        simbolos.add(simbolo);
        this.fireTableDataChanged();
    }
    
    public void clear() {
        simbolos.clear();
    }
    
}
