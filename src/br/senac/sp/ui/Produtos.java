package br.senac.sp.ui;

import br.senac.sp.classes.Produto;
import br.senac.sp.exceptions.ProdutoException;
import br.senac.sp.servicos.ServiceProduto;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Produtos extends javax.swing.JFrame {

    Produto prod = new Produto();
    //Instância do form de edição de produtos
    AlterarProduto formEditarProduto = new AlterarProduto();
    //Armazena a última pesquisa realizada
    String ultimaPesquisa = null;

    public Produtos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelConsultar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        buttonVoltar = new javax.swing.JButton();
        fieldPesquisa = new javax.swing.JTextField();
        jPanelAdicionar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fieldNomeAdd = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fieldDescricaoAdd = new javax.swing.JTextField();
        fieldComposicaoAdd = new javax.swing.JTextField();
        comboCategoriaAdd = new javax.swing.JComboBox<>();
        fieldMarcaAdd = new javax.swing.JTextField();
        fieldTamanhoAdd = new javax.swing.JTextField();
        fieldValorAdd = new javax.swing.JTextField();
        fieldQuantidadeAdd = new javax.swing.JTextField();
        buttonConfirmarAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Pesquisar");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição", "Categoria", "Composição", "Marca", "Tamanho", "Valor", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(tabelaResultados);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarLayout.createSequentialGroup()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBuscar))
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                                .addComponent(buttonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVoltar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Consultar", jPanelConsultar);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Adicionar Produto");

        jLabel14.setText("Nome *");

        jLabel15.setText("Descrição *");

        jLabel16.setText("Categoria *");

        jLabel17.setText("Composição *");

        jLabel18.setText("Marca *");

        jLabel19.setText("Tamanho/ Medidas *");

        jLabel20.setText("Valor *");

        jLabel21.setText("Quantidade *");

        comboCategoriaAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cama", "Mesa", "Banho" }));

        buttonConfirmarAdd.setText("Confirmar");
        buttonConfirmarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdicionarLayout = new javax.swing.GroupLayout(jPanelAdicionar);
        jPanelAdicionar.setLayout(jPanelAdicionarLayout);
        jPanelAdicionarLayout.setHorizontalGroup(
            jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                        .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldComposicaoAdd)
                            .addComponent(fieldDescricaoAdd)
                            .addComponent(fieldNomeAdd)
                            .addComponent(comboCategoriaAdd, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(36, 36, 36)
                        .addComponent(fieldMarcaAdd))
                    .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldTamanhoAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicionarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonConfirmarAdd))
                    .addComponent(jLabel13)
                    .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(40, 40, 40)
                        .addComponent(fieldValorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldQuantidadeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAdicionarLayout.setVerticalGroup(
            jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldNomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fieldDescricaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboCategoriaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(fieldComposicaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fieldMarcaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(fieldTamanhoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(fieldValorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldQuantidadeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(buttonConfirmarAdd)
                .addContainerGap())
        );

        jTabbedPane.addTab("Adicionar", jPanelAdicionar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Manusear");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConfirmarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarAddActionPerformed
        
        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de produtos não obteve resultados (situação padrão)
        boolean resultSearch = false;

        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaPesquisa = fieldPesquisa.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "ERRROOOO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso o produto já esteja cadastrado no sistema
        //e aumenta a quantidade em estoque de acordo com a quantidade inserida no cadastro
        if (resultSearch) {

            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Produdo já cadastrado no sistema. Deseja aumentar o estoque do produto cadastrado?",
                    "", JOptionPane.YES_NO_OPTION);
            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {

                try {
                    //****************************************************************************
                    int quant = Integer.parseInt(fieldQuantidadeAdd.getText());
                    final int i = prod.getCodigo();
                    Integer id = (Integer) prod.getValueAt(i, 0);
                    Produto produto = ServiceProduto.obterProduto(0);
                    //****************************************************************************
                    formEditarProduto = new AlterarProduto();
                    formEditarProduto.setProduto(produto);
                    produto.setQuantidade(quant + produto.getQuantidade());
                    formEditarProduto.setName(produto.getNome() + " " + produto.getDescricao() + " " + produto.getCategoria() + " " + produto.getComposicao() + " " + produto.getMarca() + " " + produto.getTamanho() + " " + produto.getValor() + " " + produto.getQuantidade());
                    //this.getParent().add(formEditarProduto);
                    //prod.setQuantidade(quant);
                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();
                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, "Não é possível "
                            + "aumentar o estoque deste produto.",
                            "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if(!resultSearch){
            //****************************************************************************

            //Cria uma instância do produto e obtém
            //seus valores dos campos da tela
            Produto produto = new Produto();
            produto.setNome(fieldNomeAdd.getText());
            int quant = Integer.parseInt(fieldQuantidadeAdd.getText());
            produto.setQuantidade(quant);
            float val = Float.parseFloat(fieldValorAdd.getText());
            produto.setValor(val);
            produto.setCategoria((String) comboCategoriaAdd.getSelectedItem());
            produto.setDescricao(fieldDescricaoAdd.getText());
            produto.setComposicao(fieldComposicaoAdd.getText());
            produto.setMarca(fieldMarcaAdd.getText());
            produto.setTamanho(fieldTamanhoAdd.getText());
            try {
                //Chama o serviço para cadastro do produto
                ServiceProduto.cadastrarProduto(produto);
            } catch (Exception e) {
                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Caso tenha chegado até aqui, o produto foi inserido com sucesso
            //Então exibe uma mensagem de sucesso para o usuário
            JOptionPane.showMessageDialog(rootPane, "Produto inserido com sucesso",
                    "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);
        }
        //Limpa os campos da tela após realizar a inserção
        fieldNomeAdd.setText("");
        fieldDescricaoAdd.setText("");
        comboCategoriaAdd.setSelectedIndex(0);
        fieldComposicaoAdd.setText("");
        fieldMarcaAdd.setText("");
        fieldTamanhoAdd.setText("");
        fieldValorAdd.setText("");
        fieldQuantidadeAdd.setText("");
    }//GEN-LAST:event_buttonConfirmarAddActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de produtos não obteve resultados (situação padrão)
        boolean resultSearch = false;

        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaPesquisa = fieldPesquisa.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed
    //Atualiza a lista de produtos. Pode ser chamado por outras telas
    public boolean refreshList() throws ProdutoException, Exception {
        //Realiza a pesquisa de produtos com o último valor de pesquisa
        //para atualizar a lista
        List<Produto> resultado = ServiceProduto.
                procurarProduto(ultimaPesquisa);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        //Indica que a tabela deve excluir todos seus elementos
        //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Produto pro = resultado.get(i);
            if (pro != null) {
                Object[] row = new Object[9];
                row[0] = pro.getCodigo();
                row[1] = pro.getNome();
                row[2] = pro.getDescricao();
                row[3] = pro.getCategoria();
                row[4] = pro.getComposicao();
                row[5] = pro.getMarca();
                row[6] = pro.getTamanho();
                row[7] = pro.getValor();
                row[8] = pro.getQuantidade();
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {
        //Verifica se o clique é um clique duplo       
        if (evt.getClickCount() == 2) {
            try {
                //Obtém a linha selecionada da tabela de resultados
                final int row = tabelaResultados.getSelectedRow();
                //Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

                //Com o ID da coluna, chama o serviço de produto para
                //obter o produto com dados atualizados do mock
                Produto produto = ServiceProduto.obterProduto(id);

                //Cria uma nova instância da tela de edição,
                //configura o produto selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarProduto.dispose();
                formEditarProduto = new AlterarProduto();
                formEditarProduto.setProduto(produto);
                formEditarProduto.setTitle(produto.getNome() + " " + produto.getDescricao() + " " + produto.getCategoria() + " " + produto.getComposicao() + " " + produto.getMarca() + " " + produto.getTamanho() + " " + produto.getValor() + " " + produto.getQuantidade());
                this.getParent().add(formEditarProduto);
                formEditarProduto.toFront();
            } catch (Exception e) {
                //Se ocorrer algum erro técnico, mostra-o no console,
                //mas esconde-o do usuário
                e.printStackTrace();
                //Exibe uma mensagem de erro genérica ao usuário
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste produto.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        try {
            //Obtém a linha selecionada na tabela de resultados
            final int row = tabelaResultados.getSelectedRow();
            //Verifica se há linha selecionada na tabela
            if (row >= 0) {
                //Obtém a linha selecionada na tabela
                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

                //Solicita ao serviço a obtenção do cliente a partir do
                //ID selecionado na tabela
                Produto produto = ServiceProduto.obterProduto(id);

                //Cria uma nova instância da tela de edição,
                //configura o cliente selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarProduto.dispose();
                formEditarProduto = new AlterarProduto();
                formEditarProduto.setProduto(produto);
                formEditarProduto.setName(produto.getNome() + " " + produto.getDescricao() + " " + produto.getCategoria() + " " + produto.getComposicao() + " " + produto.getMarca() + " " + produto.getTamanho() + " " + produto.getValor() + " " + produto.getQuantidade());
                formEditarProduto.setVisible(true);
                AlterarProduto al = new AlterarProduto();
                //this.getParent().add(formEditarProduto);
                this.setLocationRelativeTo(formEditarProduto);
                //this.openFrameInCenter(formEditarProduto);
                formEditarProduto.toFront();
            }
        } catch (Exception e) {
            //Se ocorrer algum erro técnico, mostra-o no console,
            //mas esconde-o do usuário
            e.printStackTrace();
            //Exibe uma mensagem de erro genérica ao usuário
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste produto.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (tabelaResultados.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = tabelaResultados.getSelectedRow();
            //Obtém o nome do cliente da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu nome
            String nome = (String) tabelaResultados.getValueAt(row, 1);
            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do cliente
                    Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                    //Solicita ao serviço a inativação do cliente com o ID
                    ServiceProduto.excluirProduto(id);
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
    }//GEN-LAST:event_buttonExcluirActionPerformed
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
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonConfirmarAdd;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboCategoriaAdd;
    private javax.swing.JTextField fieldComposicaoAdd;
    private javax.swing.JTextField fieldDescricaoAdd;
    private javax.swing.JTextField fieldMarcaAdd;
    private javax.swing.JTextField fieldNomeAdd;
    private javax.swing.JTextField fieldPesquisa;
    private javax.swing.JTextField fieldQuantidadeAdd;
    private javax.swing.JTextField fieldTamanhoAdd;
    private javax.swing.JTextField fieldValorAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables

    private void openFrameInCenter(AlterarProduto formEditarProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
