package unigran.view;
import DTO.DTO;
import DTO.FuncionarioDTO;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import unigran.controllers.FuncionarioController;


public class CadastroFuncionario extends javax.swing.JDialog {
    FuncionarioDTO r;
    FuncionarioController controller;

    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formatarCamp();
    }


    public DTO salvar() {
            if(r==null)
            r= new FuncionarioDTO();
            r.builder().setNome(jNomeField.getText());
            r.builder().setEmail(jEmailField.getText());
            Date dateNascimento = jDateNascimento.getDate();
            LocalDate localDate2 = dateNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            r.builder().setNascimento(localDate2);
            r.builder().setTelefone(jTelefoneField.getText());
            r.builder().setCpf(jCpfField.getText());
            //r.endereco.setRua();
            Date dateAdmissao = jDateAdmissao.getDate();
            LocalDate localDate = dateAdmissao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            r.builder().setAdmissao(localDate);
            
            
            float precoCusto = ((Number) jPrecoCustoField.getValue()).floatValue();//falta tratar caso o usuario digite um valor invalido
            float precoVenda = ((Number) jPrecoVendaField.getValue()).floatValue();
            r.builder().setPrecoCusto(precoCusto);
            r.builder().setPrecoVenda(precoVenda);
            r.builder().setNome(jNomeField.getText());
            r.builder().setNome(jNomeField.getText());
            
            
        
            return r;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelDataNasc = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        jDateNascimento = new com.toedter.calendar.JDateChooser();
        labelEmail = new javax.swing.JLabel();
        labelAdmissao = new javax.swing.JLabel();
        jDateAdmissao = new com.toedter.calendar.JDateChooser();
        labelCargo = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        labelSalario = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jNomeField = new javax.swing.JTextField();
        jTelefoneField = new javax.swing.JFormattedTextField();
        jCpfField = new javax.swing.JFormattedTextField();
        jSalarioField = new javax.swing.JFormattedTextField();
        jEmailField = new javax.swing.JTextField();
        jEnderecoField = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        jEnderecoField1 = new javax.swing.JTextField();
        labelEndereco1 = new javax.swing.JLabel();
        labelEndereco2 = new javax.swing.JLabel();
        jCpfField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelNome.setText("Nome:");

        labelCpf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelCpf.setText("CPF:");

        labelDataNasc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelDataNasc.setText("Data de Nascimento:");

        labelTelefone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelTelefone.setText("Telefone:");

        labelEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEmail.setText("Email:");

        labelAdmissao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelAdmissao.setText("Admissão:");

        labelCargo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelCargo.setText("Cargo:");

        jComboBoxCargo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estoquista", "Vendedor", "Tecnico", "Supervisor" }));

        labelSalario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelSalario.setText("Salário:");

        btnConfirmar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("Cadastro de funcionário");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Sexo:");

        rbMasculino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbMasculino.setText("Masculino");

        rbFeminino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbFeminino.setText("Feminino");

        jNomeField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTelefoneField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jSalarioField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        jSalarioField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jEmailField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jEnderecoField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelEndereco.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco.setText("Rua:");

        jEnderecoField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelEndereco1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco1.setText("CEP:");

        labelEndereco2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco2.setText("Numero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome)
                            .addComponent(labelEndereco))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco2)
                            .addComponent(labelEmail)
                            .addComponent(jEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jSalarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(labelCpf))
                            .addComponent(labelDataNasc)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabel10))
                            .addComponent(labelTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFeminino))
                            .addComponent(jTelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jEnderecoField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jEnderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCpfField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEndereco1)
                            .addComponent(labelAdmissao))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSalario)
                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCargo))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelEmail))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNasc)
                    .addComponent(labelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(jLabel10))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelEndereco2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEnderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEnderecoField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEndereco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCpfField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAdmissao)
                    .addComponent(labelSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //implement
            
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formatarCamp(){
        try{
            MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
            maskCpf.install(jCpfField);
        }catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"CPF invalido! Formato Invalido", "ERRO", JOptionPane.ERROR);
        }
                try{
            MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");
            maskTelefone.install(jTelefoneField);
        }catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Telefone invalido ou em formato incorreto, informe da seguinte maneira (67)00000-0000", "ERRO", JOptionPane.ERROR);
        }     
    }
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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFuncionario dialog = new CadastroFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JFormattedTextField jCpfField;
    private javax.swing.JFormattedTextField jCpfField1;
    private com.toedter.calendar.JDateChooser jDateAdmissao;
    private com.toedter.calendar.JDateChooser jDateNascimento;
    private javax.swing.JTextField jEmailField;
    private javax.swing.JTextField jEnderecoField;
    private javax.swing.JTextField jEnderecoField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JFormattedTextField jSalarioField;
    private javax.swing.JFormattedTextField jTelefoneField;
    private javax.swing.JLabel labelAdmissao;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEndereco1;
    private javax.swing.JLabel labelEndereco2;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    // End of variables declaration//GEN-END:variables
}
