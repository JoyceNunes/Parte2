/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import compilador.lexico.Analizador;
import compilador.lexico.Simbolo;
import compilador.lexico.Token;
import compilador.sintatico.AnalizadorSintatico;
import java.util.ArrayList;
import model.SimboloTableModel;
import model.TokenTableModel;

/**
 *
 * @author Joyce
 */
public class TelaInicial extends javax.swing.JFrame {

    Analizador analizador;
    SimboloTableModel simboloTableModel = new SimboloTableModel();
    TokenTableModel tokenTableModel = new TokenTableModel();

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        jTable1.setModel(simboloTableModel);
        jTable2.setModel(tokenTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemFechar = new javax.swing.JMenuItem();
        jMenuItemSalvar = new javax.swing.JMenuItem();
        jMenuItemSalvarComo = new javax.swing.JMenuItem();
        jMenuItemImprimir = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemRecortar = new javax.swing.JMenuItem();
        jMenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemColar = new javax.swing.JMenuItem();
        jMenuItemLimpar = new javax.swing.JMenuItem();
        jMenuItemSelecionarTudo = new javax.swing.JMenuItem();
        jMenuItemLocalizar = new javax.swing.JMenuItem();
        jMenuItemSubstituir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCompilar = new javax.swing.JMenuItem();
        jMenuItemExecutar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCascata = new javax.swing.JMenuItem();
        jMenuItemLadoaLado = new javax.swing.JMenuItem();
        jMenuItemOrganizarTudo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fonte", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lexema", "Classe", "Linha", "Coluna", "Endereço"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Itens Léxicos", jPanel3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Categoria", "Tipo", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Tabela de Símbolos", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Código Objeto", jPanel5);

        jSeparator1.setToolTipText("");

        jLabel1.setText("Mensagens");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("Arquivo");

        jMenuItemNovo.setText("Novo");
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNovo);

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAbrir);

        jMenuItemFechar.setText("Fechar");
        jMenu1.add(jMenuItemFechar);

        jMenuItemSalvar.setText("Salvar");
        jMenu1.add(jMenuItemSalvar);

        jMenuItemSalvarComo.setText("Salvar Como");
        jMenu1.add(jMenuItemSalvarComo);

        jMenuItemImprimir.setText("Imprimir");
        jMenuItemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemImprimir);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItemRecortar.setText("Recortar");
        jMenu2.add(jMenuItemRecortar);

        jMenuItemCopiar.setText("Copiar");
        jMenuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCopiar);

        jMenuItemColar.setText("Colar");
        jMenuItemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemColar);

        jMenuItemLimpar.setText("Limpar");
        jMenuItemLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLimparActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLimpar);

        jMenuItemSelecionarTudo.setText("Selecionar Tudo");
        jMenuItemSelecionarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSelecionarTudoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSelecionarTudo);

        jMenuItemLocalizar.setText("Localizar");
        jMenuItemLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocalizarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLocalizar);

        jMenuItemSubstituir.setText("Substituir");
        jMenuItemSubstituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSubstituirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSubstituir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Executar");

        jMenuItemCompilar.setText("Compilar");
        jMenuItemCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCompilarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCompilar);

        jMenuItemExecutar.setText("Executar");
        jMenu3.add(jMenuItemExecutar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Janela");

        jMenuItemCascata.setText("Cascata");
        jMenu4.add(jMenuItemCascata);

        jMenuItemLadoaLado.setText("Lado a Lado");
        jMenu4.add(jMenuItemLadoaLado);

        jMenuItemOrganizarTudo.setText("Organizar Tudo");
        jMenu4.add(jMenuItemOrganizarTudo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenu5.add(jMenuItemSobre);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2)
                .addContainerGap())
            .addComponent(jTabbedPane1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemImprimirActionPerformed

    private void jMenuItemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemColarActionPerformed

    private void jMenuItemLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLocalizarActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItemSelecionarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSelecionarTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSelecionarTudoActionPerformed

    private void jMenuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCopiarActionPerformed

    private void jMenuItemLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLimparActionPerformed

    private void jMenuItemSubstituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSubstituirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSubstituirActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCompilarActionPerformed
//        simboloTableModel.clear();
//        analizador = new Analizador(jTextArea2.getText());
//        for(Simbolo simbolo : analizador.getSimbolos()) {
//            simboloTableModel.addRow(simbolo);
//        }
//        for(Token token : analizador.getTokens()) {
//            tokenTableModel.addRow(token);
//        }

        if (!jTextArea2.getText().isEmpty()) {
            jTextArea1.setText("");
            Analizador analisador = new Analizador(jTextArea2.getText() + "\n");
            ArrayList<Token> tokens = new ArrayList<>(analisador.getTokens());
            ArrayList<Simbolo> simbolos = analisador.getSimbolos();
            jTextArea1.setText(analisador.getError());
            for (Token token : tokens) {
                tokenTableModel.addRow(token);
            }

            AnalizadorSintatico sintatico = new AnalizadorSintatico(tokens, simbolos, analisador.getError());
            jTextArea1.setText(sintatico.getMensagem());
            for (Simbolo simbolo : simbolos) {
                simboloTableModel.addRow(simbolo);
            }
        } else {
            jTextArea1.setText("Código vazio, por favor adicione um arquivo .txt através do menu ou digite o código desejado");

        }
    }//GEN-LAST:event_jMenuItemCompilarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemCascata;
    private javax.swing.JMenuItem jMenuItemColar;
    private javax.swing.JMenuItem jMenuItemCompilar;
    private javax.swing.JMenuItem jMenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemExecutar;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemImprimir;
    private javax.swing.JMenuItem jMenuItemLadoaLado;
    private javax.swing.JMenuItem jMenuItemLimpar;
    private javax.swing.JMenuItem jMenuItemLocalizar;
    private javax.swing.JMenuItem jMenuItemNovo;
    private javax.swing.JMenuItem jMenuItemOrganizarTudo;
    private javax.swing.JMenuItem jMenuItemRecortar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvar;
    private javax.swing.JMenuItem jMenuItemSalvarComo;
    private javax.swing.JMenuItem jMenuItemSelecionarTudo;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemSubstituir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}