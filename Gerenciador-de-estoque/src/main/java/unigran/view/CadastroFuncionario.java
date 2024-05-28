/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package unigran.view;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jhonatan-OM
 */
public class CadastroFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form Cadastro
     */
    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formatarCamp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelDataNasc = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        dateChooserDataNascimento = new com.toedter.calendar.JDateChooser();
        labelEmail = new javax.swing.JLabel();
        labelAdmissao = new javax.swing.JLabel();
        dateChooserAdmissao = new com.toedter.calendar.JDateChooser();
        labelCargo = new javax.swing.JLabel();
        comboBoxCargo = new javax.swing.JComboBox<>();
        labelSalario = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        textFieldNome = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JFormattedTextField();
        textFieldCpf = new javax.swing.JFormattedTextField();
        textFieldSalario = new javax.swing.JFormattedTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();

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

        comboBoxCargo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        comboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estoquista", "Vendedor", "Tecnico", "Supervisor" }));

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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("Cadastro de funcionário");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Sexo:");

        rbMasculino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbMasculino.setText("Masculino");

        rbFeminino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbFeminino.setText("Feminino");

        textFieldNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        textFieldTelefone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        textFieldSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        textFieldSalario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        textFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        textFieldEndereco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        labelEndereco.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco.setText("Endereco:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldNome)
                                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                    .addComponent(dateChooserAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAdmissao)
                                    .addComponent(labelCpf)
                                    .addComponent(labelTelefone)
                                    .addComponent(dateChooserDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDataNasc)
                                    .addComponent(labelEmail)
                                    .addComponent(labelNome)
                                    .addComponent(labelCargo)
                                    .addComponent(textFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSalario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbFeminino))
                                    .addComponent(comboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelEndereco))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooserDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEndereco)
                .addGap(5, 5, 5)
                .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAdmissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooserAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
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
            String nome = textFieldNome.getText();
            String Email = textFieldEmail.getText();
            String telefone = textFieldTelefone.getText() ;
            String cpf = textFieldCpf.getText();
            String salario = textFieldSalario.getText();
            String endereco = textFieldEndereco.getText();
            //String cargo = comboBoxCargo.getSelectedItem();
            Date nascimento = dateChooserDataNascimento.getDate();
            Date admissao =  dateChooserAdmissao.getDate();
            if(rbMasculino.isSelected()){
                String sexo ="MASCULINO" ;
            }else{
                String sexo = "FEMININO";
            }
            
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formatarCamp(){
        try{
            MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
            maskCpf.install(textFieldCpf);
        }catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"CPF invalido! Formato Invalido", "ERRO", JOptionPane.ERROR);
        }
                try{
            MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");
            maskTelefone.install(textFieldTelefone);
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
    private javax.swing.JComboBox<String> comboBoxCargo;
    private com.toedter.calendar.JDateChooser dateChooserAdmissao;
    private com.toedter.calendar.JDateChooser dateChooserDataNascimento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JLabel labelAdmissao;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JFormattedTextField textFieldCpf;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JFormattedTextField textFieldSalario;
    private javax.swing.JFormattedTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
