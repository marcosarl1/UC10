package com.cenaflix.view;

import com.cenaflix.dao.PodcastDAO;
import com.cenaflix.model.Podcast;
import com.cenaflix.model.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemPodcast extends javax.swing.JFrame {

    private Usuario usuarioLogado;
    private final PodcastDAO podcastDAO;

    public ListagemPodcast(Usuario usuario) {
        this.usuarioLogado = usuario;
        this.podcastDAO = new PodcastDAO();
        initComponents();
        init();
        ajustPermission();
        loadPodcast();
    }

    private void init() {
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:15;"
                + "background:$Table.background");
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Pesquisar produtor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPodcast = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPodcast.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblPodcast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produtor", "Nome do Episódio", "Nº Episódio", "Duração", "URL do Repo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPodcast.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPodcast);
        if (tblPodcast.getColumnModel().getColumnCount() > 0) {
            tblPodcast.getColumnModel().getColumn(0).setMinWidth(70);
            tblPodcast.getColumnModel().getColumn(0).setMaxWidth(70);
            tblPodcast.getColumnModel().getColumn(3).setMinWidth(110);
            tblPodcast.getColumnModel().getColumn(3).setMaxWidth(110);
            tblPodcast.getColumnModel().getColumn(4).setMinWidth(110);
            tblPodcast.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        txtSearch.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtSearch.setToolTipText("Pesquisar filme por nome ou categoria.");
        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cenaflix");

        btnDelete.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnDelete.setText("Deletar");
        btnDelete.setToolTipText("Deletar filme.");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnRegister.setText("Cadastrar");
        btnRegister.setToolTipText("Cadastrar novo filme.");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
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
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(1024, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        try {
            List<Podcast> podcasts = podcastDAO.getPodcast(txtSearch.getText().trim());
            updateTbl(podcasts);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        new CadastrarPodcast(this).setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void updateTbl(List<Podcast> podcasts) {
        DefaultTableModel tblModel = (DefaultTableModel) tblPodcast.getModel();
        tblModel.setRowCount(0);
        for (Podcast podcast : podcasts) {
            tblModel.addRow(new Object[]{podcast.getId(), podcast.getProdutor(), podcast.getNomeEpisodio(), podcast.getNumeroEpisodio(), podcast.getDuracao(), podcast.getUrl()});
        }
    }

    protected void loadPodcast() {
        try {
            List<Podcast> podcasts = podcastDAO.getPodcast("");
            updateTbl(podcasts);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar podcasts, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ajustPermission() {
        if ("Administrador".equals(usuarioLogado.getTipo())) {
            btnRegister.setEnabled(true);
            btnDelete.setEnabled(true);
        } else if ("Operador".equals(usuarioLogado.getTipo())) {
            btnRegister.setEnabled(true);
            btnDelete.setEnabled(false);
        } else if ("Usuário".equals(usuarioLogado.getTipo())) {
            btnRegister.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblPodcast;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
