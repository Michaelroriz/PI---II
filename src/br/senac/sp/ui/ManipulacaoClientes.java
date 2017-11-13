/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.ui;

import br.senac.sp.classes.Cliente;
import br.senac.sp.classes.Endereco;
import br.senac.sp.dados.MockCliente;
import br.senac.sp.exceptions.ClienteException;
import br.senac.sp.exceptions.DataSourceException;
import br.senac.sp.servicos.ServicoCliente;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael
 */
public class ManipulacaoClientes extends javax.swing.JFrame {

    /**
     * Tela de manupulação de Clientes
     */
    String ultimaPesquisa = null;

    public ManipulacaoClientes() {
        initComponents();
    }

    // Código Gerado do GuiBuilder
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Cli = new javax.swing.JPanel();
        Cadastrar_Cli = new javax.swing.JPanel();
        txt_Rua = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JTextField();
        buttonIncluirCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        combo_genero = new javax.swing.JComboBox<>();
        voltarTelaUm = new javax.swing.JButton();
        txt_cep = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        combo_estado = new javax.swing.JComboBox<>();
        txt_sobrenome = new javax.swing.JTextField();
        data_nasc = new javax.swing.JFormattedTextField();
        txt_complemento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Consultar_Cli = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultado = new javax.swing.JTable();
        excluir_Cli = new javax.swing.JButton();
        alterar_Cli = new javax.swing.JButton();
        button_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Rua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RuaActionPerformed(evt);
            }
        });

        txt_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bairroActionPerformed(evt);
            }
        });

        buttonIncluirCliente.setText("Incluir ");
        buttonIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluirClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cadastro De Cliente");

        txt_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nomeMouseClicked(evt);
            }
        });
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        voltarTelaUm.setText("Voltar");
        voltarTelaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaUmActionPerformed(evt);
            }
        });

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));
        combo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadoActionPerformed(evt);
            }
        });

        data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        data_nasc.setText("Data de Nascimento");

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("CPF");

        jLabel5.setText("Data de Nascimento");

        jLabel6.setText("Gênero");

        jLabel7.setText("Endero");

        jLabel8.setText("Bairro");

        jLabel9.setText("CEP");

        jLabel10.setText("Cidade");

        jLabel11.setText("Complemento");

        jLabel12.setText("Estado");

        javax.swing.GroupLayout Cadastrar_CliLayout = new javax.swing.GroupLayout(Cadastrar_Cli);
        Cadastrar_Cli.setLayout(Cadastrar_CliLayout);
        Cadastrar_CliLayout.setHorizontalGroup(
            Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_CliLayout.createSequentialGroup()
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastrar_CliLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel4))
                    .addGroup(Cadastrar_CliLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_bairro)
                            .addComponent(txt_Rua)
                            .addComponent(txt_nome)
                            .addComponent(txt_cpf)
                            .addComponent(combo_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_sobrenome)
                            .addComponent(data_nasc)
                            .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cadastrar_CliLayout.createSequentialGroup()
                                .addComponent(voltarTelaUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonIncluirCliente))
                            .addComponent(txt_cidade)
                            .addComponent(txt_cep)
                            .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        Cadastrar_CliLayout.setVerticalGroup(
            Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_CliLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Cadastrar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarTelaUm)
                    .addComponent(buttonIncluirCliente))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout Panel_CliLayout = new javax.swing.GroupLayout(Panel_Cli);
        Panel_Cli.setLayout(Panel_CliLayout);
        Panel_CliLayout.setHorizontalGroup(
            Panel_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastrar_Cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_CliLayout.setVerticalGroup(
            Panel_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastrar_Cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", Panel_Cli);

        jLabel13.setText("Cliente:");

        jLabel14.setText("(insira o nome, código  ou cpf do cliente a ser pesquisado)");

        tabelaResultado.setAutoCreateRowSorter(true);
        tabelaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Data de Nascimento", "Genero", "Endereco", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tabelaResultado);
        if (tabelaResultado.getColumnModel().getColumnCount() > 0) {
            tabelaResultado.getColumnModel().getColumn(1).setResizable(false);
        }

        excluir_Cli.setText("Excluir");

        alterar_Cli.setText("Alterar");

        button_buscar.setText("Buscar");
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consultar_CliLayout = new javax.swing.GroupLayout(Consultar_Cli);
        Consultar_Cli.setLayout(Consultar_CliLayout);
        Consultar_CliLayout.setHorizontalGroup(
            Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_CliLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(Consultar_CliLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Consultar_CliLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Consultar_CliLayout.createSequentialGroup()
                                .addGap(10, 458, Short.MAX_VALUE)
                                .addComponent(button_buscar))
                            .addComponent(txt_pesquisa))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consultar_CliLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(alterar_Cli)
                .addGap(119, 119, 119)
                .addComponent(excluir_Cli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Consultar_CliLayout.setVerticalGroup(
            Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_CliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addGroup(Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir_Cli)
                    .addComponent(alterar_Cli))
                .addGap(64, 64, 64))
        );

        jTabbedPane1.addTab("Consultar", Consultar_Cli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_estadoActionPerformed

    private void voltarTelaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaUmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarTelaUmActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeMouseClicked

    private void buttonIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirClienteActionPerformed
        // TODO add your handling code here:

        Cliente cliente = new Cliente();
        Endereco end = new Endereco(txt_Rua.getText(), txt_bairro.getText(), txt_cidade.getText(), combo_estado.getName(), txt_complemento.getText(), txt_cep.getText());
        cliente.setNome(txt_nome.getText());
        cliente.setSobrenome(txt_sobrenome.getText());
        cliente.setDataNascimento((Date) data_nasc.getValue());
        cliente.setGenero(combo_genero.getName());
        cliente.setEndereco(end);
        try {
            MockCliente.inserir(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Caso tenha chegado até aqui, o produto foi inserido com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_buttonIncluirClienteActionPerformed

    private void txt_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bairroActionPerformed

    private void txt_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RuaActionPerformed

    public boolean ehInteiro(String s) {
        // cria um array de char
        char[] c = s.toCharArray();
        boolean d = true;
        for (int i = 0; i < c.length; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(c[i])) {
                d = false;
                break;

            }
        }
        return d;
    }


    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed
        // Inicializa a pesquisa com valor negativo indicando que a pesquisa não obteve resutados (Situação Padrão)
        boolean resultadoPesquisa = false;

        //Grava o campo de pesquisa como a ultima pesquisa válida. O mesmo é utilizado  na atualização da lista
        ultimaPesquisa = txt_pesquisa.getText();
        try {
            // Solicita a atualização da lista com o novo critério de pesquisa (Ultima Pesquisa)
        } catch (Exception e) {
            // Exibe mensagens de erro na fonter de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Exibe menssagem de erro caso a pesquisa não tenha resultados
        if (!resultadoPesquisa) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);

        }
    }

    // Atualiza a lista de clientes. Pode ser chamado por outras telas
    public boolean refreshList() throws ClienteException, Exception {
        // Reakuza a pesquisa de clientes com o último valor de pesquisa para atualizar a lista
        List<Cliente> resultado = ServicoCliente.procurarCliente(ultimaPesquisa);
        // Obtem o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
        // Indica que a tabela deve excluir todos os seus elementos isso limpara a lista mesmo que a pesquisa não tenha sucesso
        if (resultado == null || resultado.size() <= 00) {
            return false;
        }
        
        //  Percorre a lista de resultados e os adiciona na tabela
        for(int i = 0; i < resultado.size(); i++){
        
        Cliente cli = resultado.get(i);
        if (cli !=null){
        Object [] row = new Object[7];
            row[0] = cli.getNome();
            row[1] = cli.getSobrenome();
            row[2] = cli.getDataNascimento();
            row[3] = cli.getGenero();
            row[4] = cli.getEndereco();
            row[5] = cli.getCpf();
            model.addRow(row);
        }
        
        }
        // Se chegamos até aqui, a pesquisa teve sucsso , então retrornamos true
return true;

    }//GEN-LAST:event_button_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastrar_Cli;
    private javax.swing.JPanel Consultar_Cli;
    private javax.swing.JPanel Panel_Cli;
    private javax.swing.JButton alterar_Cli;
    private javax.swing.JButton buttonIncluirCliente;
    private javax.swing.JButton button_buscar;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_genero;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JButton excluir_Cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaResultado;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisa;
    private javax.swing.JTextField txt_sobrenome;
    private javax.swing.JButton voltarTelaUm;
    // End of variables declaration//GEN-END:variables
}
