package br.senac.ui.cliente;

import br.senac.sp.classes.Cliente;
import br.senac.sp.exceptions.ClienteException;
import br.senac.sp.servicos.ServicoCliente;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WolfDevelloper
 */
public class ManipulacaoCliente extends javax.swing.JFrame {

    //Instanca do form de edição de clientes
    TelaEditarCliente formEditarCliente = new TelaEditarCliente();

    //Armazena a ultima pesquisa realizada
    String ultimaPesquisa = null;

    /**
     * Tela de manupulação de Clientes
     */
    public ManipulacaoCliente() {
        initComponents();
    }

    // Código gerado pelo GuiBuilder
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
        voltar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Rua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        buttonIncluirCliente.setText("Incluir ");
        buttonIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncluirClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cadastro De Cliente");

        combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        voltarTelaUm.setText("Voltar");
        voltarTelaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaUmActionPerformed(evt);
            }
        });

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));

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

            },
            new String [] {
                "Nome", "Sobrenome", "Data de Nascimento", "Genero", "Endereco", "CPF"
            }
        ));
        tabelaResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaResultado);
        if (tabelaResultado.getColumnModel().getColumnCount() > 0) {
            tabelaResultado.getColumnModel().getColumn(1).setResizable(false);
        }

        excluir_Cli.setText("Excluir");
        excluir_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_CliActionPerformed(evt);
            }
        });

        alterar_Cli.setText("Alterar");
        alterar_Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_CliActionPerformed(evt);
            }
        });

        button_buscar.setText("Buscar");
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });

        voltar_button.setText("Voltar");
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consultar_CliLayout = new javax.swing.GroupLayout(Consultar_Cli);
        Consultar_Cli.setLayout(Consultar_CliLayout);
        Consultar_CliLayout.setHorizontalGroup(
            Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_CliLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Consultar_CliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_CliLayout.createSequentialGroup()
                        .addComponent(voltar_button)
                        .addGap(89, 89, 89)
                        .addComponent(alterar_Cli)
                        .addGap(119, 119, 119)
                        .addComponent(excluir_Cli)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(alterar_Cli)
                    .addComponent(voltar_button))
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

    private void voltarTelaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaUmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarTelaUmActionPerformed

    private void buttonIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncluirClienteActionPerformed

        Cliente cliente = new Cliente();
        cliente.setNome(txt_nome.getText());
        cliente.setSobrenome(txt_sobrenome.getText());
        cliente.setDataNascimento((Date) data_nasc.getValue());
        cliente.setGenero((String) combo_genero.getSelectedItem());
        cliente.setRua(txt_Rua.getText());
        cliente.setBairro(txt_bairro.getText());
        cliente.setCidade(txt_cidade.getText());
        cliente.setEstado((String) combo_estado.getSelectedItem());
        cliente.setComplemento(txt_complemento.getText());
        cliente.setCep(txt_cep.getText());
        cliente.setCpf(txt_cpf.getText());

        try {
            //Chama o serviço para cadastro do produto
            ServicoCliente.cadastrarCliente(cliente);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
//            j++;
        //Caso tenha chegado até aqui, o produto foi inserido com sucesso
        //Então exibe uma mensagem de sucesso para o usuário
        JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos da tela após realizar a inserção
        
        txt_nome.setText("");
        txt_sobrenome.setText("");
        combo_genero.setSelectedIndex(0);
        data_nasc.setText("");
        txt_cpf.setText("");
        txt_Rua.setText("");
        txt_bairro.setText("");
        txt_cidade.setText("");
        txt_complemento.setText("");
        txt_cep.setText("");
        combo_estado.setSelectedIndex(0);

    }//GEN-LAST:event_buttonIncluirClienteActionPerformed

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
            resultadoPesquisa = refreshList();
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
        // Realiza a pesquisa de clientes com o último valor de pesquisa para atualizar a lista
        List<Cliente> resultado = ServicoCliente.procurarCliente(ultimaPesquisa);
        // Obtem o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
        // Indica que a tabela deve excluir todos os seus elementos isso limpara a lista mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);
        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 00) {
            return false;
        }

        //  Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Cliente cli = resultado.get(i);
            if (cli != null) {
                Object[] row = new Object[6];
                row[0] = cli.getNome();
                row[1] = cli.getSobrenome();
                row[2] = cli.getDataNascimento();
                row[3] = cli.getGenero();
                row[4] = cli.getRua();
                row[5] = cli.getCpf();
                model.addRow(row);
            }

        }
        // Se chegamos até aqui, a pesquisa teve sucsso , então retrornamos true
        return true;


    }//GEN-LAST:event_button_buscarActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void tabelaResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadoMouseClicked
        //Verifica se o clique é um clique duplo
        if (evt.getClickCount() == 2) {
            try {
                // Obtém a linha selecionada da tabela de resultados
                final int row = tabelaResultado.getSelectedRow();
                // Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer id = (Integer) tabelaResultado.getValueAt(row, 0);
                //Com o ID da coluna, chama o serviço de cliente para obter o cliente com dados atualizados do banco
                Cliente cliente = ServicoCliente.obterCliente(id);

                //Cria uma nova instancia da tela de edição, cofigura o cliente selecionado como elemento a ser editado e mostra a tela de edição.
                // para exibir a tela énecessário adiciona-lá ao componente de desktop, o "PAI" da janela corrente
                formEditarCliente.dispose();
                formEditarCliente = new TelaEditarCliente();
                formEditarCliente.setCliente(cliente);
                formEditarCliente.setTitle(cliente.getNome() + " " + cliente.getSobrenome()+ " " + cliente.getBairro()+ " " + cliente.getCep()+ " " + cliente.getCidade()+ " " + cliente.getComplemento()+ " " + cliente.getCpf()+ " " + cliente.getEstado()+ " " + cliente.getGenero()+ " " + cliente.getRua()+ " " + cliente.getDataNascimento());                
                this.getParent().add(formEditarCliente);
                formEditarCliente.toFront();
            } catch (Exception e) {
                // Se ocorrer algum erro técnico, mostra-o no console, mas esconde do usuário
                e.printStackTrace();
                //Exibe uma menssagem de erro genérica ao usuário
                JOptionPane.showInternalMessageDialog(rootPane, "Não é possivel" + "Exibir os detalhes deste cliente.", "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_tabelaResultadoMouseClicked

    private void alterar_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_CliActionPerformed
        try {
            //Obtém a linha selecionada na tabela de resultados
            final int row = tabelaResultado.getSelectedRow();
            //Verifica se há linha selecionada na tabela
            if (row >= 0) {
                //Obtém a linha selecionada na tabela
                Integer id = (Integer) tabelaResultado.getValueAt(row, 0);

                //Solicita ao serviço a obtenção do cliente a partir do
                //ID selecionado na tabela
                Cliente cliente = ServicoCliente.obterCliente(id);

                //Cria uma nova instância da tela de edição,
                //configura o cliente selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarCliente.dispose();
                formEditarCliente = new TelaEditarCliente();
                formEditarCliente.setCliente(cliente);
                formEditarCliente.setName(cliente.getNome() + " " + cliente.getSobrenome()+ " " + cliente.getBairro()+ " " + cliente.getCep()+ " " + cliente.getCidade()+ " " + cliente.getComplemento()+ " " + cliente.getCpf()+ " " + cliente.getEstado()+ " " + cliente.getGenero()+ " " + cliente.getRua()+ " " + cliente.getDataNascimento());
                formEditarCliente.setVisible(true);
                
                this.setLocationRelativeTo(formEditarCliente);
                //this.openFrameInCenter(formEditarProduto);
                formEditarCliente.toFront();
            }
        } catch (Exception e) {
            //Se ocorrer algum erro técnico, mostra-o no console,
            //mas esconde-o do usuário
            e.printStackTrace();
            //Exibe uma mensagem de erro genérica ao usuário
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste cliente.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alterar_CliActionPerformed

    private void excluir_CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_CliActionPerformed
        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tabelaResultado.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tabelaResultado.getSelectedRow();
            //Obtém o nome do cliente da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu nome
            String nome = (String) tabelaResultado.getValueAt(row, 1);
            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o cliente \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do cliente
                    Integer id = (Integer) tabelaResultado.getValueAt(row, 0);
                    //Solicita ao serviço a inativação do cliente com o ID
                    ServicoCliente.excluirCliente(id);
                    //Atualiza a lista após a "exclusão"
                    this.refreshList();
                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();
                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_excluir_CliActionPerformed
    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
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
    private javax.swing.JButton voltar_button;
    // End of variables declaration//GEN-END:variables
}
