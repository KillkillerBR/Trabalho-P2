package unigran.view;
import DTO.FuncionarioDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unigran.controllers.FuncionarioController;


public class Funcionarios extends javax.swing.JFrame {
    private FuncionarioController funcionarioController;
    private FuncionarioDTO funcionarioSelecionado;   

    
    public Funcionarios() {
        funcionarioController = new FuncionarioController();
        funcionarioSelecionado = new FuncionarioDTO();
        initComponents();
        atualizaTabela();

    }
    private void atualizaTabela() {
        List<FuncionarioDTO> dados = funcionarioController.getListaDados();
        String[] colunas = {"ID", "Nome", "E-mail", "Cargo","Salario", "CPF"};
        Object[][] data = new Object[dados.size()][colunas.length];
        
        for (int i = 0; i < dados.size(); i++) {
            FuncionarioDTO funcionario = dados.get(i);
            data[i][0] = funcionario.builder().getId();
            data[i][1] = funcionario.builder().getNome();
            data[i][2] = funcionario.builder().getEmail();
            data[i][3] = funcionario.builder().getCargo();
            data[i][4] = funcionario.builder().getSalario();
            data[i][5] = funcionario.builder().getCpf();
        }

        DefaultTableModel model = new DefaultTableModel(data, colunas);
        jTable1.setModel(model);
        jTable1.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                funcionarioSelecionado = dados.get(selectedRow);
            }
        }
    });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSaidas = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnSaidas.setText("Saidas");
        btnSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidasActionPerformed(evt);
            }
        });

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Funcionarios");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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

        btnEntrada.setText("Entradas");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addGap(7, 7, 7)
                .addComponent(btnRemover)
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrada)
                .addGap(12, 12, 12)
                .addComponent(btnSaidas)
                .addGap(11, 11, 11))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos)
                    .addComponent(btnEntrada)
                    .addComponent(btnSaidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(null, true);
        cadastroFuncionario.setVisible(true);
        atualizaTabela();
        cadastroFuncionario.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                atualizaTabela();
            }
        });
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (funcionarioSelecionado != null) {
            AlterarFuncionario alterarFuncionario = new AlterarFuncionario(funcionarioSelecionado);
            alterarFuncionario.setVisible(true);
            alterarFuncionario.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    atualizaTabela();
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um funcionario na tabela.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        EntradaV entrada = new EntradaV();
        entrada.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidasActionPerformed
        SaidaV saida = new SaidaV();
        saida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSaidasActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSaidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
