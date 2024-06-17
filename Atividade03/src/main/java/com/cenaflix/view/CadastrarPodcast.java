package com.cenaflix.view;

import com.formdev.flatlaf.FlatClientProperties;

public class CadastrarPodcast extends javax.swing.JDialog {

    public CadastrarPodcast(ListagemPodcast listagemPodcast) {
        super(listagemPodcast, "Cadastrar Podcast", true);
        initComponents();
        init();
    }

    private void init(){
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:15");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblProdutor = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        lblNomeEP = new javax.swing.JLabel();
        txtNomeEP = new javax.swing.JTextField();
        lblNumeroEP = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        lblURL = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        txtNumeroEP = new javax.swing.JTextField();
        txtURL = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CENAFLIX");

        lblSubTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblSubTitle.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle.setText("CADASTRAR PODCAST");

        lblProdutor.setBackground(new java.awt.Color(0, 0, 0));
        lblProdutor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblProdutor.setForeground(new java.awt.Color(0, 0, 0));
        lblProdutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutor.setLabelFor(txtProdutor);
        lblProdutor.setText("Produtor:");

        txtProdutor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtProdutor.setToolTipText("Insira o nome do produtor.");
        txtProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutorActionPerformed(evt);
            }
        });

        lblNomeEP.setBackground(new java.awt.Color(0, 0, 0));
        lblNomeEP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNomeEP.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeEP.setLabelFor(txtNomeEP);
        lblNomeEP.setText("Nome do Episódio:");

        txtNomeEP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNomeEP.setToolTipText("Insira o nome do episódio.");
        txtNomeEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEPActionPerformed(evt);
            }
        });

        lblNumeroEP.setBackground(new java.awt.Color(0, 0, 0));
        lblNumeroEP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNumeroEP.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroEP.setLabelFor(txtNumeroEP);
        lblNumeroEP.setText("Nº do Episódio:");

        lblDuracao.setBackground(new java.awt.Color(0, 0, 0));
        lblDuracao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDuracao.setForeground(new java.awt.Color(0, 0, 0));
        lblDuracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDuracao.setLabelFor(txtDuracao);
        lblDuracao.setText("Duração:");

        lblURL.setBackground(new java.awt.Color(0, 0, 0));
        lblURL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblURL.setForeground(new java.awt.Color(0, 0, 0));
        lblURL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblURL.setLabelFor(txtURL);
        lblURL.setText("URL do repositório:");

        txtDuracao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDuracao.setToolTipText("Insira a duração do episódio.");
        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        txtNumeroEP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumeroEP.setToolTipText("Insira o número do episódio.");
        txtNumeroEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEPActionPerformed(evt);
            }
        });

        txtURL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtURL.setToolTipText("Insira a URL.");
        txtURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastar novo podcast.");

        btnLimpar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpar todos os campos.");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblProdutor)
                        .addComponent(lblNomeEP)
                        .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblURL)
                        .addComponent(txtNomeEP, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumeroEP, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNumeroEP))
                            .addGap(18, 18, 18)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDuracao)
                                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubTitle)
                .addGap(35, 35, 35)
                .addComponent(lblProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNomeEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroEP)
                    .addComponent(lblDuracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblURL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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

        setSize(new java.awt.Dimension(600, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutorActionPerformed

    private void txtNomeEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEPActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void txtNumeroEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEPActionPerformed

    private void txtURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURLActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblNomeEP;
    private javax.swing.JLabel lblNumeroEP;
    private javax.swing.JLabel lblProdutor;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblURL;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtNomeEP;
    private javax.swing.JTextField txtNumeroEP;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
