/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ui.vendas;

import br.senac.sp.classes.Cliente;
import br.senac.sp.classes.Produto;
import br.senac.sp.classes.Venda;
import br.senac.sp.exceptions.ClienteException;
import br.senac.sp.exceptions.ProdutoException;
import br.senac.sp.exceptions.VendaException;
import br.senac.sp.servicos.ServiceProduto;
import br.senac.sp.servicos.ServiceVenda;
import br.senac.sp.servicos.ServicoCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author william.sbarreto1
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    String ultimaPesquisaCli = null;
    String ultimaPesquisaPro = null;
    
    Cliente cli = new Cliente();
    public TelaVendas() {
        initComponents();
        
        updateTabelaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        buttonCancelar = new javax.swing.JButton();
        buttonConfirmarCompra = new javax.swing.JButton();
        textFieldBuscaCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonBuscarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        textProducts = new javax.swing.JTextField();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda");

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonConfirmarCompra.setBackground(new java.awt.Color(255, 255, 255));
        buttonConfirmarCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonConfirmarCompra.setText("Confirmar");
        buttonConfirmarCompra.setToolTipText("");
        buttonConfirmarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        buttonConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarCompraActionPerformed(evt);
            }
        });

        textFieldBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscaClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        buttonBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonBuscarCliente.setText("Buscar");
        buttonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaProdutos);

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 0, 0));
        buttonAdd.setText("Adicionar");
        buttonAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("* Insira o id, nome ou CPF do Cliente");

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Sobrenome", "CPF"
            }
        ));
        jScrollPane6.setViewportView(tableCliente);

        textProducts.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonBuscarCliente))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonConfirmarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonConfirmarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarCompraActionPerformed
        TelaFinalizacaoDeVenda finalVendas = new TelaFinalizacaoDeVenda();
        if(buttonConfirmarCompra.isEnabled()){
            finalVendas.setVisible(true);
        }
    }//GEN-LAST:event_buttonConfirmarCompraActionPerformed

    private void textFieldBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscaClienteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buttonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarClienteActionPerformed
        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de vendas não obteve resultados (situação padrão)
        
        boolean resultSearch = false;

        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaPesquisaCli = textFieldBuscaCliente.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshListCliente();
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

    }//GEN-LAST:event_buttonBuscarClienteActionPerformed

    //Atualiza a lista de clientes. Pode ser chamado por outras telas
    public boolean refreshListCliente() throws ClienteException, Exception {
        //Realiza a pesquisa de vendas com o último valor de pesquisa
        //para atualizar a lista
        List<Cliente> resultado = ServicoCliente.
                procurarCliente(ultimaPesquisaCli);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tableCliente.getModel();
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
            Cliente cli = resultado.get(i);
            if (cli != null) {
                Object[] row = new Object[4];
                row[0] = cli.getId();
                row[1] = cli.getNome();
                row[2] = cli.getSobrenome();
                row[3] = cli.getCpf();                
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }
    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {
        //Verifica se o clique é um clique duplo       
        if (evt.getClickCount() == 2) {
            try {
                //Obtém a linha selecionada da tabela de resultados
                final int row = tableCliente.getSelectedRow();
                //Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer id = (Integer) tableCliente.getValueAt(row, 0);

                //Com o ID da coluna, chama o serviço de produto para
                //obter o produto com dados atualizados do mock
                Cliente cliente = ServicoCliente.obterCliente(id);
                
            } catch (Exception e) {
                //Se ocorrer algum erro técnico, mostra-o no console,
                //mas esconde-o do usuário
                e.printStackTrace();
                //Exibe uma mensagem de erro genérica ao usuário
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste cliente.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBuscarCliente;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConfirmarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField textFieldBuscaCliente;
    private javax.swing.JTextField textProducts;
    // End of variables declaration//GEN-END:variables

    private void updateTabelaProdutos() {
        boolean resultSearch = false;

        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaPesquisaPro = textProducts.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshListProdutos();
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
    }
    public boolean refreshListProdutos() throws ProdutoException, Exception {
        //Realiza a pesquisa de vendas com o último valor de pesquisa
        //para atualizar a lista
        List<Produto> resultado = ServiceProduto.
                procurarProduto(ultimaPesquisaPro);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
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
    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {
        //Verifica se o clique é um clique duplo       
        if (evt.getClickCount() == 2) {
            try {
                //Obtém a linha selecionada da tabela de resultados
                final int row = tabelaProdutos.getSelectedRow();
                //Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer id = (Integer) tabelaProdutos.getValueAt(row, 0);

                //Com o ID da coluna, chama o serviço de produto para
                //obter o produto com dados atualizados do mock
                Produto produto = ServiceProduto.obterProduto(id);
                
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
}
