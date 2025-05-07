
package Gym;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;



public class IscrizioniView extends javax.swing.JPanel  {

    private I_Main_Form mainForm;
    private Iscrizioni Nome;
    private Iscrizioni Cognome;
    private Iscrizioni Codice_Fiscale;
    

    public IscrizioniView() {
        initComponents();
    }
    
    public IscrizioniView(I_Main_Form mainform){
         initComponents();
        SetMainForm(mainform);
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Inserisci_Cognome = new javax.swing.JTextField();
        Inserisci_Codice_fiscale = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        Annulla = new javax.swing.JButton();
        Inserisci = new javax.swing.JTextField();

        jLabel1.setText("Nome:");

        jLabel2.setText("Cognome:");

        jLabel3.setText("Codice Fiscale:");

        Inserisci_Cognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserisci_CognomeActionPerformed(evt);
            }
        });

        Inserisci_Codice_fiscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserisci_Codice_fiscaleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Iscrizioni Alla Palestra Pagans:");

        OK.setText("Inserisci");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Annulla.setText("Annulla");
        Annulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullaActionPerformed(evt);
            }
        });

        Inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserisciActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Inserisci_Cognome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Inserisci_Codice_fiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Inserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Annulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OK)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Inserisci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Inserisci_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Inserisci_Codice_fiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annulla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Inserisci_Codice_fiscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserisci_Codice_fiscaleActionPerformed
        Codice_Fiscale.getCodiceFiscale();
    }//GEN-LAST:event_Inserisci_Codice_fiscaleActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        
    if (Inserisci.getText().isBlank() || Inserisci_Cognome.getText().isBlank() || Inserisci_Codice_fiscale.getText().isBlank()) {
    JOptionPane.showMessageDialog(this, "Inserisci tutti i dati!", "Errore", JOptionPane.ERROR_MESSAGE);
    return;
    }
    Iscrizioni nuovoIscritto = new Iscrizioni(Inserisci.getText(), Inserisci_Cognome.getText(), Inserisci_Codice_fiscale.getText());
    IscrittiManager.getInstance().aggiungiIscritto(nuovoIscritto);

    JOptionPane.showMessageDialog(this, "Iscritto aggiunto con successo!");
    }//GEN-LAST:event_OKActionPerformed

    private void AnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullaActionPerformed
        this.mainForm.GoHome();
    }//GEN-LAST:event_AnnullaActionPerformed

    private void InserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserisciActionPerformed
        Nome.getNome();
    }//GEN-LAST:event_InserisciActionPerformed

    private void Inserisci_CognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserisci_CognomeActionPerformed
        Cognome.getCognome();
    }//GEN-LAST:event_Inserisci_CognomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annulla;
    private javax.swing.JTextField Inserisci;
    private javax.swing.JTextField Inserisci_Codice_fiscale;
    private javax.swing.JTextField Inserisci_Cognome;
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void SetMainForm(I_Main_Form mainform) {
        this.mainForm=mainform;
    }

    public String getNome() {
        return Inserisci.getText();
    }

    public String getCognome() {
        return Inserisci_Cognome.getText();
    }

    public String getCodiceFiscale() {
        return Inserisci_Codice_fiscale.getText();
    }

    void mostraErrore(String nessun_iscritto_disponibile) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostraDettagli(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

