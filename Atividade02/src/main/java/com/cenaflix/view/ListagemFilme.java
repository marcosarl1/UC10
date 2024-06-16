package com.cenaflix.view;

import com.cenaflix.dao.FilmeDAO;
import com.cenaflix.model.Filme;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemFilme extends javax.swing.JFrame {

    public ListagemFilme() {
        initComponents();
        init();
        loadMovies();
    }

    private void init() {
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:25;"
                + "background:$Table.background");
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Pesquisar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovies = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Data Lançamento", "Categoria"
            }
        ));
        tblMovies.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMovies);
        if (tblMovies.getColumnModel().getColumnCount() > 0) {
            tblMovies.getColumnModel().getColumn(0).setMinWidth(0);
            tblMovies.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        lblTitle.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitle.setText("Cenaflix");

        btnDelete.setText("Deletar");

        btnEdit.setText("Editar");

        btnRegister.setText("Cadastrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        new CadastrarFilme(this).setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * Atualiza a tabela de filmes com uma baseado na lista filmes.
     * 
     * @param filmes A lista de filmes a ser exibida na tabela
     */
    private void updateTbl(List<Filme> filmes) {
        DefaultTableModel tableModel = (DefaultTableModel) tblMovies.getModel();
        tableModel.setRowCount(0);
        for (Filme filme : filmes) {
            tableModel.addRow(new Object[]{filme.getId(), filme.getNome(), filme.getDatalancamento().format(DateTimeFormatter.ofPattern("dd/MM/y")), filme.getCategoria()});
        }
    }

    /**
     * Carrega todos os filmes do banco de dados e atualiza a tabela de filmes.
     */
    protected final void loadMovies() {
        FilmeDAO filmeDAO = new FilmeDAO();
        try {
            List<Filme> filmes = filmeDAO.selectAllMovies();
            updateTbl(filmes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar filmes", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblMovies;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
