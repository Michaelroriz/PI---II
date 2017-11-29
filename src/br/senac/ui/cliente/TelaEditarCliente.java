package br.senac.ui.cliente;

import br.senac.sp.classes.Cliente;
import br.senac.sp.servicos.ServicoCliente;
import br.senac.sp.ui.Menu;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author WolfDevelloper
 */
/**
 * Tela de Edição de dados de cliente
 */
public class TelaEditarCliente extends javax.swing.JInternalFrame {

    // Armazena o cliente em edição
    Cliente cli = new Cliente();

    //Contrutor e inialização em edição
    public TelaEditarCliente() {
        initComponents();
    }
    
    public void setCliente(Cliente cli) {
        this.cli = cli;
    }
    
    public Cliente getCliente() {
        return cli;
    }

    //Cogigo Gerado pelo Gui Builder
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        data_nasc = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_genero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_Rua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Cliente");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Alterar Cliente");

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("CPF");

        data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel5.setText("Data Nasc");

        combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        jLabel6.setText("Gênero");

        txt_Rua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setText("Endereço");

        jLabel8.setText("Bairro");

        jLabel9.setText("CEP");

        jLabel10.setText("Cidade");

        jLabel11.setText("Complemento");

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));

        jLabel12.setText("Estado");

        buttonCancelar.setText("Voltar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Confirmar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jButton1.setText("Setar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(48, 48, 48)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoEditar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Rua)
                                .addComponent(combo_genero, 0, 447, Short.MAX_VALUE)
                                .addComponent(txt_bairro)
                                .addComponent(txt_cep)
                                .addComponent(txt_cidade)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(botaoEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Listener do Botão Cancelar
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed
//Listener do botão editar
    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
//Configura os novos valores dos campos de edição da tela
        cli.setNome(txt_nome.getText());
        cli.setSobrenome(txt_sobrenome.getText());
        cli.setDataNascimento((Date) data_nasc.getValue());
        cli.setGenero((String) combo_genero.getSelectedItem());
        cli.setRua(txt_Rua.getText());
        cli.setCidade(txt_cidade.getText());
        cli.setEstado((String) combo_estado.getSelectedItem());
        cli.setBairro(txt_bairro.getText());
        cli.setComplemento(txt_complemento.getText());
        cli.setCep(txt_cep.getText());
        cli.setCpf(txt_cpf.getText());
        
        try {
            //Chama o serviço para realizar as alterações necessárias 
            ServicoCliente.atualizarCadastro(cli);
        } catch (Exception e) {
            //Exibe alguma mensagem de erro que pode ter vindo do serviço
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        JOptionPane.showMessageDialog(rootPane, "Cliente atualizado com sucesso",
                "Cadastro atualizado", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formFrameOpened();
    }//GEN-LAST:event_jButton1ActionPerformed
//Listener de abertura de janela. Aproveita o evento para obter os valores do cliente em edição e passa-os para os campos de edição de tela 

    private void formFrameOpened() {
        txt_nome.setText(cli.getNome());
        txt_sobrenome.setText(cli.getSobrenome());
        txt_cpf.setText(cli.getCpf());
        combo_genero.setSelectedItem(cli.getGenero());
        txt_Rua.setText(cli.getRua());
        txt_bairro.setText(cli.getBairro());
        txt_cidade.setText(cli.getCidade());
        combo_estado.setSelectedItem(cli.getEstado());
        txt_cep.setText(cli.getCep());
        data_nasc.setValue(cli.getDataNascimento());
        txt_complemento.setText(cli.getComplemento());
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_genero;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables
}
