/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogPesquisarProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisarProduto
     */
    public JDialogPesquisarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DefaultTableModel tmProduto = new DefaultTableModel(null, new String[]{"Código", "Nome", "Descrição"});
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelPesProdImagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPesProdCod = new javax.swing.JTextField();
        jTextFieldPesProdDesc = new javax.swing.JTextField();
        jLabelPesProdDescr = new javax.swing.JLabel();
        jLabelPesProdCodigo = new javax.swing.JLabel();
        btCadastrarProduto = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 4500));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesProdImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesProdImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Pesquisar produto.png"))); // NOI18N
        jLabelPesProdImagem.setToolTipText("");
        getContentPane().add(jLabelPesProdImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, 50));

        jSeparator1.setMaximumSize(new java.awt.Dimension(620, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(620, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 800, 0));

        jTextFieldPesProdCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldPesProdCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, 30));

        jTextFieldPesProdDesc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldPesProdDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 30));

        jLabelPesProdDescr.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdDescr.setText("Descrição:");
        getContentPane().add(jLabelPesProdDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelPesProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdCodigo.setText("Código:");
        getContentPane().add(jLabelPesProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        btCadastrarProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/searchProd.png"))); // NOI18N
        btCadastrarProduto.setToolTipText("Cadastrar Produto");
        getContentPane().add(btCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PesquisarPadrao.png"))); // NOI18N
        btPesquisar.setMaximumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setMinimumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setPreferredSize(new java.awt.Dimension(28, 25));
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 30, 30));

        btFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        btLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        btAtualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/update.png"))); // NOI18N
        btAtualizar.setToolTipText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jSeparator2.setPreferredSize(new java.awt.Dimension(620, 1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, -1));

        tbProduto.setModel(tmProduto);
        tbProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbProduto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 740, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrarProduto;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPesProdCodigo;
    private javax.swing.JLabel jLabelPesProdDescr;
    private javax.swing.JLabel jLabelPesProdImagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldPesProdCod;
    private javax.swing.JTextField jTextFieldPesProdDesc;
    private javax.swing.JTable tbProduto;
    // End of variables declaration//GEN-END:variables
}
