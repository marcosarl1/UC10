package com.cenaflix.view;

import com.cenaflix.dao.FilmeDAO;
import com.cenaflix.model.Filme;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 * Classe responsável pela interface gráfica de cadastro de filmes.
 */
public class CadastrarFilme extends javax.swing.JDialog {

    private final ListagemFilme listagemFilme;
    private final FilmeDAO filmeDAO;
    private Filme filmeEdit = null;

    public CadastrarFilme(ListagemFilme listagemFilme) {
        super(listagemFilme, "Cadastrar filme", true);
        this.listagemFilme = listagemFilme;
        this.filmeDAO = new FilmeDAO();
        initComponents();
        init();
    }

    private void init() {
        // Definindo placeholders para os campos de texto para acessibilidade.
        txtName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Divertida Mente");
        txtDate.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "18/06/2015");
        txtCategory.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Animação");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtDate = new javax.swing.JFormattedTextField();
        txtName = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblCenaflix = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cenaflix");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CADASTRO DE FILME");

        lblName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblName.setText("Nome do filme:");

        lblDate.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDate.setText("Data de lançamento:");

        lblCategory.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCategory.setText("Categoria:");

        txtCategory.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        txtDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        btnClean.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnClean.setText("Limpar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnRegister.setText("Cadastrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblCenaflix.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblCenaflix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCenaflix.setText("CENAFLIX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDate)
                                    .addComponent(lblCategory))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCategory)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCenaflix)
                        .addGap(190, 190, 190))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCenaflix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Limpa os campos de texto quando o botão "Limpar" é clicado.
     *
     * @param evt O evento de clique do botão.
     */
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtName.setText("");
        txtDate.setText("");
        txtCategory.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * Executa o cadastro de um filme quando o botão "Cadastrar" é clicado.
     *
     * @param evt O evento de clique do botão.
     */
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String nome = txtName.getText().trim();
        String dataString = txtDate.getText().trim();
        String categoria = txtCategory.getText().trim();

        // Verifica se todos os campos foram preenchidos.
        if (nome.isEmpty() || dataString.isEmpty() || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate datalancamento;
        try {
            // Converte a string da data para LocalDate.
            datalancamento = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Data de lançamento inválida. Use o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um objeto Filme com os dados informados.
        Filme filme = new Filme();
        if (filmeEdit != null) {
            filme = filmeEdit;
        }
        filme.setNome(nome);
        filme.setDatalancamento(datalancamento);
        filme.setCategoria(categoria);

        try {
            if (filmeEdit == null) {
                // Realiza tentativa de inserir o filme no banco de dados.
                FilmeDAO.insertMovie(filme);
                JOptionPane.showMessageDialog(null, "Filme: \"" + filme.getNome() + "\" adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                btnCleanActionPerformed(evt);
            } else {
                filmeDAO.editMovie(filme);
                JOptionPane.showMessageDialog(null, "Filme: \"" + filme.getNome() + "\" atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
            listagemFilme.loadMovies();
        } catch (SQLException e) {
            System.out.println("Erro ao adiconar" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocorreu uma falha, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro inesperado, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    public void fillEdit(Filme filme) {
        lblTitle.setText("Editar filme");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        btnRegister.setText("Editar");
        txtName.setText(filme.getNome());
        txtDate.setText(filme.getDatalancamento().format(DateTimeFormatter.ofPattern("dd/MM/y")));
        txtCategory.setText(filme.getCategoria());

        filmeEdit = filme;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCenaflix;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
