package unigran.view;
import DTO.CidadeDTO;
import DTO.DTO;
import DTO.FuncionarioDTO;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import unigran.controllers.CidadeController;
import unigran.controllers.FuncionarioController;


public class CadastroFuncionario extends javax.swing.JDialog {
    FuncionarioDTO r;
    FuncionarioController controller;
     CidadeController cidadeController;

    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        cidadeController = new CidadeController();
        initComponents();
        formatarCamp();
        carregarCidadesNoComboBox();
    }
    private void carregarCidadesNoComboBox() {
        List<CidadeDTO> cidades = cidadeController.getCidades() ;
        for (CidadeDTO cidade : cidades) {
            jComboBoxCidade.addItem(cidade.toString());
        }
    }


    public DTO salvar() {
            r= new FuncionarioDTO();
            r.builder().setNome(jNomeField.getText());
            r.builder().setEmail(jEmailField.getText());
            Date dateNascimento = jDateNascimento.getDate();
            LocalDate localDate2 = dateNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            r.builder().setNascimento(localDate2);
            r.builder().setTelefone(jTelefoneField.getText());
            r.builder().setCpf(jCpfField.getText());
            r.endereco.setRua(jEnderecoField.getText());
            r.endereco.setCep(jCepField.getText());
            Date dateAdmissao = jDateAdmissao.getDate();
            LocalDate localDate = dateAdmissao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            r.builder().setAdmissao(localDate);
            CidadeDTO cidadeSelecionada = (CidadeDTO) jComboBoxCidade.getSelectedItem();
            r.endereco.setCidade(cidadeSelecionada.builder());        
            r.builder().setCargo(jComboBoxCargo.getSelectedItem().toString());
            r.builder().setSalario(jSalarioField.getText());
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
        labelEndereco1 = new javax.swing.JLabel();
        labelEndereco2 = new javax.swing.JLabel();
        jCepField = new javax.swing.JFormattedTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();

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

        labelEndereco1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco1.setText("CEP:");

        labelEndereco2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelEndereco2.setText("Cidade:");

        try {
            jCepField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxCidade.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estoquista", "Vendedor", "Tecnico", "Supervisor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(jEnderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone)
                            .addComponent(jTelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCpf)
                            .addComponent(jCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFeminino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addGap(89, 89, 89))
                            .addComponent(jEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataNasc)
                            .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco2)
                            .addComponent(labelCargo)
                            .addComponent(labelSalario)
                            .addComponent(labelAdmissao)
                            .addComponent(jCepField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEndereco1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateAdmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSalarioField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelEndereco))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEnderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addGap(3, 3, 3)
                        .addComponent(jEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(labelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMasculino)
                            .addComponent(rbFeminino)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEndereco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEndereco2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAdmissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            controller.salvar(r);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JFormattedTextField jCepField;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JFormattedTextField jCpfField;
    private com.toedter.calendar.JDateChooser jDateAdmissao;
    private com.toedter.calendar.JDateChooser jDateNascimento;
    private javax.swing.JTextField jEmailField;
    private javax.swing.JTextField jEnderecoField;
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
