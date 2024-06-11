
package unigran.view;

import DTO.EntradaDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unigran.controllers.EntradaController;


public class EntradaV extends javax.swing.JFrame {
    private EntradaController entradaController;
    private EntradaDTO entradaSelecionada;
    public EntradaV() {
        initComponents();
        entradaSelecionada = new EntradaDTO();
        entradaController = new EntradaController(); 
        entradaSelecionada = null;
        atualizaTabela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnProdutos1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSaidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Entradas");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnProdutos1.setText("Produtos");
        btnProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        btnSaidas.setText("Saidas");
        btnSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addGap(7, 7, 7)
                .addComponent(btnRemover)
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaidas)
                .addGap(9, 9, 9)
                .addComponent(btnProdutos1)
                .addGap(11, 11, 11))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos)
                    .addComponent(btnProdutos1)
                    .addComponent(btnSaidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void atualizaTabela() {
        List<EntradaDTO> dados = entradaController.getListaDados();
        String[] colunas = {"ID", "Empresa", "Data", "CNPJ"};
        Object[][] data = new Object[dados.size()][colunas.length];
        
        for (int i = 0; i < dados.size(); i++) {
            EntradaDTO entrada = dados.get(i);
            data[i][0] = entrada.builder().getId();
            data[i][1] = entrada.builder().getNotaFiscal().getEmpresa();
            data[i][2] = entrada.builder().getData();
            data[i][3] = entrada.builder().getNotaFiscal().getCnpj();

        }

        DefaultTableModel model = new DefaultTableModel(data, colunas);
        jTable1.setModel(model);
        jTable1.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                entradaSelecionada = dados.get(selectedRow);
            }
        }
    });
    }
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        CadastroProduto produto = new CadastroProduto();
        produto.setVisible(true);
        atualizaTabela();
        produto.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                atualizaTabela();
            }
        });
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (entradaSelecionada != null) {
            AlterarEntrada alterarEntrada = new AlterarEntrada(entradaSelecionada);
            alterarEntrada.setVisible(true);
            alterarEntrada.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    atualizaTabela();
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma entrada na tabela.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutos1ActionPerformed

    private void btnSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidasActionPerformed
        SaidaV saida = new SaidaV();
        saida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSaidasActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnProdutos1;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSaidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
