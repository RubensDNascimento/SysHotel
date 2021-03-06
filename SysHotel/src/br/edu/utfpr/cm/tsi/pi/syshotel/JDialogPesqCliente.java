/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.dao.DaoCliente;
import br.edu.utfpr.cm.pi.modal.Cliente;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogPesqCliente extends javax.swing.JDialog {

    private DefaultTableModel model;
    private String dadosClientes[] = new String[]{"Cod", "Nome", "Cpf", "Telefone", "Tipo Logradouro", "Logradouro", "Número", "Bairro", "Municipio", "Estado"};
    private List<Cliente> clientes;

    /**
     * Creates new form JDialogPesqCliente
     */
    public JDialogPesqCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        novo();
        iniciarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFechar = new javax.swing.JButton();
        jButtonCadCliente = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabelPesProdCodigo = new javax.swing.JLabel();
        jLabelPesProdDescr = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtualizar1 = new javax.swing.JButton();
        ftfCpf = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        setTitle("Pesquisar Clientes");
        setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 50, -1));

        jButtonCadCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/cadClientePesCliente.png"))); // NOI18N
        jButtonCadCliente.setToolTipText("Cadastrar Cliente");
        jButtonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 60, -1));

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 65, 41));

        tfNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 30));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PesquisarPadrao.png"))); // NOI18N
        btPesquisar.setMaximumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setMinimumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setPreferredSize(new java.awt.Dimension(28, 25));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 30));

        jLabelPesProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdCodigo.setText("CPF:");
        getContentPane().add(jLabelPesProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabelPesProdDescr.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdDescr.setText("Nome:");
        getContentPane().add(jLabelPesProdDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jSeparator1.setMaximumSize(new java.awt.Dimension(620, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(620, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 800, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/name/PesquisarCliente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 320, 40));

        jButtonAtualizar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonAtualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/update.png"))); // NOI18N
        jButtonAtualizar1.setToolTipText("Atualizar");
        jButtonAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ftfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, 25));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Cpf", "Telefone", "Tipo Logradouro", "Logradouro", "Número", "Bairro", "Municipio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 740, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Fechar?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClienteActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastrarCliente(null, true));
        novo();
    }//GEN-LAST:event_jButtonCadClienteActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        novo();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizar1ActionPerformed
        atualizar();
    }//GEN-LAST:event_jButtonAtualizar1ActionPerformed

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
        obterPorNome();
    }//GEN-LAST:event_tfNomeKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JButton jButtonAtualizar1;
    private javax.swing.JButton jButtonCadCliente;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPesProdCodigo;
    private javax.swing.JLabel jLabelPesProdDescr;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void obterPorCpf() {
        if (!"   .   .   -  ".equals(ftfCpf.getText())) {

            clientes.clear();
            Cliente cli = new DaoCliente().obterCpf(ftfCpf.getText());
            if (cli != null) {
                clientes.add(cli);
            }
            prencherTabela();
            ftfCpf.setText("   .   .   -  ");

        } else {
            Util.dispayMsg("Forneça um CPF!");
        }
    }

    private void obterPorNome() {

        try {
            clientes.clear();
            clientes = new DaoCliente().obterNome(tfNome.getText());
            prencherTabela();
        } catch (Exception e) {
            Logger.getLogger(JDialogCadastrarCliente.class.getName()).log(Level.SEVERE, null, e);//erro
            Util.dispayMsg("Erro ao Pesquisar Por Nome!");

        }
    }

    private void novo() {
        ftfCpf.setText(null);
        tfNome.setText(null);
        popularTabela();
    }

    private void popularTabela() {
        clientes = new DaoCliente().listar();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(dadosClientes);
        prencherTabela();

    }

    private void prencherTabela() {
//        DefaultTableModel 
        model = new DefaultTableModel();

        model.setColumnIdentifiers(dadosClientes);


        if (clientes != null || clientes.isEmpty()) {
            for (Cliente cli : clientes) {
                model.addRow(new Object[]{cli.getId(),
                    cli.getNome(),
                    cli.getCpf(),
                    cli.getEndereco().getTipoLogradouro(),
                    cli.getEndereco().getLogradouro(),
                    cli.getEndereco().getNumero(),
                    cli.getEndereco().getBairro(),
                    cli.getEndereco().getMunicipio().getNome(),
                    cli.getEndereco().getMunicipio().getEstado().getNome()});
            }
            tbClientes.setModel(model);
        } else {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(dadosClientes);
            tbClientes.setModel(model);
        }
    }

    private void atualizar() {
        if (tbClientes.getSelectedRow() != -1) {
            if (Util.imprimirConfirmacao("Carregar Dados?")) {
                int linha = tbClientes.getSelectedRow();
                if (linha == -1) {
                    return;
                }
                Data.hash.put("cliente", clientes.get(linha));
            }
        }

        dispose();
    }

    private void iniciarTabela() {
        clientes = new DaoCliente().listar();
        if (clientes != null) {
            prencherTabela();
        }
    }

    private void pesquisar() {
        if (!ftfCpf.getText().equals("   .   .   -  ")) {
            obterPorCpf();
        } else {
            obterPorNome();
            tfNome.setText("");
        }
    }
}
