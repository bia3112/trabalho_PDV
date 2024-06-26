/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.unipar.trabalhoPDV.Panel;

import br.unipar.trabalhoPDV.model.ItemVenda;
import br.unipar.trabalhoPDV.model.Venda;
import javax.swing.JOptionPane;

/**
 *
 * @author vinid
 */
public class CadastroItemVendaPanel extends javax.swing.JPanel {

    private Venda venda;
    /**
     * Creates new form CadastroItemVendaPanel
     */
    public CadastroItemVendaPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQTD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelVlTo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnsalvar = new javax.swing.JButton();
        txtVlUn = new javax.swing.JTextField();

        txtQTD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTD.setText("0"); // NOI18N
        txtQTD.setToolTipText("");
        txtQTD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtQTD.setName(""); // NOI18N
        txtQTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Quantidae");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Desconto unitario");

        txtDesconto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDesconto.setText("0%"); // NOI18N
        txtDesconto.setToolTipText("");
        txtDesconto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDesconto.setName(""); // NOI18N
        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Valor total");

        labelVlTo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelVlTo.setText("0,00");
        labelVlTo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelVlTo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setText("Item Venda");

        jLabel10.setText("Nome do produto");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Produto");

        jButton1.setText("Calcular valor total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Valor unitario");

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        txtVlUn.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVlUn.setText("0,00"); // NOI18N
        txtVlUn.setToolTipText("");
        txtVlUn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtVlUn.setName(""); // NOI18N
        txtVlUn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVlUnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsalvar)))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txtQTD, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtVlUn)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(labelVlTo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVlUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelVlTo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTDActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescontoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    try {
          double valorUnitario = Double.parseDouble(txtVlUn.getText().replace(",", ".")); // Substitui vírgulas por pontos
          System.out.println("Valor Unitário: " + valorUnitario);
          if (valorUnitario <= 0) {
              throw new NumberFormatException();
          }

          int qtd = Integer.parseInt(txtQTD.getText());
          System.out.println("Quantidade: " + qtd);
          if (qtd <= 0) {
              throw new NumberFormatException();
          }

          double desconto = Double.parseDouble(txtDesconto.getText().replace(",", "."));
          System.out.println("Desconto: " + desconto);
          if (desconto < 0) {
              throw new NumberFormatException();
          }

          double valorTotal = calcularValorTotal(valorUnitario, qtd, desconto);

          String valorTotalFormatado = String.format("%.2f", valorTotal);

          labelVlTo.setText(valorTotalFormatado);
          labelVlTo.repaint();
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(this, "Certifique-se de preencher os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        try {
            ItemVenda item = new ItemVenda();

            if (venda == null) {
                venda = new Venda();
            }
            venda.adicionarItem(item);
        
            JOptionPane.showMessageDialog(this, "Item de venda salvo com sucesso!");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Certifique-se de preencher os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void txtVlUnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVlUnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVlUnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelVlTo;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtQTD;
    private javax.swing.JTextField txtVlUn;
    // End of variables declaration//GEN-END:variables
public void atualizarDescricaoProdutoSelecionado(String descricaoProduto) {
       
        jLabel10.setText(descricaoProduto);
    }

private double calcularValorTotal(double valorUnitario, int qtd, double desconto) {
    double valorTotal = valorUnitario * qtd;
    double taxaDesconto = desconto / 100.0;
    valorTotal -= valorTotal * taxaDesconto;
    return valorTotal;
}



}


