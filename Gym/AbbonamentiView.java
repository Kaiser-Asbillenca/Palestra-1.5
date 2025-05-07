package Gym;

import javax.swing.JOptionPane;



public class AbbonamentiView extends javax.swing.JPanel {

    private I_Main_Form mainForm;
    String tipo=getTipoAbbonamento();
    String Codice_Fiscale=getCodiceFiscale();
    protected String nuovoAbbonamento;

    
    
    public AbbonamentiView() {
        initComponents();
    }
    
     public AbbonamentiView(I_Main_Form mainform){
         initComponents();
        SetMainForm(mainform);
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Scegli = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CodiceFiscale = new javax.swing.JTextField();
        Agg = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Abbonamenti per la Palestra Pagans:");

        Scegli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SCEGLI", "Mensile", "Annuale" }));
        Scegli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScegliActionPerformed(evt);
            }
        });

        jLabel2.setText("Codice Fiscale:");

        jLabel3.setText("Tipologia Abbonamento:");

        CodiceFiscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceFiscaleActionPerformed(evt);
            }
        });

        Agg.setText("Agg.");
        Agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodiceFiscale)))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scegli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agg)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Scegli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Agg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ScegliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScegliActionPerformed
       if (tipo.equalsIgnoreCase("Mensile")) {
    nuovoAbbonamento = new Abbonamento_Mensile(java.time.LocalDate.now());
} else if (tipo.equalsIgnoreCase("Annuale")) {
    nuovoAbbonamento = new Abbonamento_Annuale(java.time.LocalDate.now());
} else {
    nuovoAbbonamento = null;

    }//GEN-LAST:event_ScegliActionPerformed
  }
    private void CodiceFiscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodiceFiscaleActionPerformed
        if (CodiceFiscale.getText().isBlank() ) {
    JOptionPane.showMessageDialog(this, "Inserisci il codice fiscale!", "Errore", JOptionPane.ERROR_MESSAGE);
    return;
}

      Iscrizioni iscritto = IscrittiManager.getInstance().trovaIscritto(Codice_Fiscale);

if (iscritto == null) {
    JOptionPane.showMessageDialog(this, "Iscritto non trovato!", "Errore", JOptionPane.ERROR_MESSAGE);
    return;
}
    }//GEN-LAST:event_CodiceFiscaleActionPerformed

    private void AggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggActionPerformed
      Iscrizioni.aggiungiAbbonamento(nuovoAbbonamento);
        JOptionPane.showMessageDialog(this, "Abbonamento aggiunto con successo!");
    }//GEN-LAST:event_AggActionPerformed

    public String getCodiceFiscale() {
        return CodiceFiscale.getText();
    }

    public String getTipoAbbonamento() {
        return (String) Scegli.getSelectedItem();
    }

    
    private void SetMainForm(I_Main_Form mainform) {
        this.mainForm=mainform;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agg;
    private javax.swing.JTextField CodiceFiscale;
    private javax.swing.JComboBox<String> Scegli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
