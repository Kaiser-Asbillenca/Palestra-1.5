
package Gym;

import java.awt.CardLayout;
import java.util.ArrayList;




public class MainForm extends javax.swing.JFrame implements I_Main_Form {
        
    public final static String HOME = "HOME";
    public final static String INSERISCI = "INSERISCI";
    public final static String ABB = "ABB";
    public final static String CERCA = "CERCA";
    public final static String ANNULLA  = "ANNULLA";
    public final static String ABB_STORICO  = "ABB_STORICO";

    
    private ArrayList<String> _cardAperte;
    private String lastCardName;
    
    @Override 
    public void Show(String cardName){
        this._cardAperte.add(lastCardName);
        lastCardName=cardName;

        cardLayout.show(cardPanel, cardName);
        
    }

    private CardLayout cardLayout;
    
    public MainForm() {
        initComponents();
        Init();
        
        _cardAperte = new ArrayList<>();
         this._cardAperte.add(HOME);
         lastCardName=HOME;
       
    }
    
     private void Init(){
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        
        cardPanel.add(new Home(this), HOME);
        cardPanel.add(new IscrizioniView(this), INSERISCI);
        cardPanel.add(new AbbonamentiView(this), ABB);
        cardPanel.add(new Cerca_abbonamento(this), CERCA);
        cardPanel.add(new Annulla_Abbonamento(this), ANNULLA);
        cardPanel.add(new Abb_Storici(this), ABB_STORICO);

        
        
        this.Inserisci.addActionListener(e -> cardLayout.show(cardPanel, INSERISCI));
        this.Abbonamento.addActionListener(e -> cardLayout.show(cardPanel, ABB));
        this.Cerca.addActionListener(e -> cardLayout.show(cardPanel, CERCA));
        this.Annulla.addActionListener(e -> cardLayout.show(cardPanel, ANNULLA));
        this.Abb_Storico.addActionListener(e -> cardLayout.show(cardPanel, ABB_STORICO));

        
        pack();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Inserisci = new javax.swing.JButton();
        Cerca = new javax.swing.JButton();
        Annulla = new javax.swing.JButton();
        cardPanel = new javax.swing.JPanel();
        Abb_Storico = new javax.swing.JButton();
        Abbonamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Benvenuto alla Palestra Pagans");

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel2.setText("Opzioni: ");

        Inserisci.setBackground(new java.awt.Color(0, 255, 0));
        Inserisci.setText("Iscriviti");
        Inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserisciActionPerformed(evt);
            }
        });

        Cerca.setText("Cerca abb.");
        Cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaActionPerformed(evt);
            }
        });

        Annulla.setText("Annulla Abb.");

        cardPanel.setName("CardPanel"); // NOI18N

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Abb_Storico.setText("Abb. Storici");
        Abb_Storico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abb_StoricoActionPerformed(evt);
            }
        });

        Abbonamento.setBackground(new java.awt.Color(255, 0, 0));
        Abbonamento.setText("Abbonamento");
        Abbonamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbonamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Annulla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inserisci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Abbonamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Abb_Storico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inserisci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Abbonamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Annulla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Abb_Storico)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserisciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserisciActionPerformed

    private void CercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CercaActionPerformed

    private void Abb_StoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abb_StoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Abb_StoricoActionPerformed

    private void AbbonamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbonamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbbonamentoActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abb_Storico;
    private javax.swing.JButton Abbonamento;
    private javax.swing.JButton Annulla;
    private javax.swing.JButton Cerca;
    private javax.swing.JButton Inserisci;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void GoHome() {
        cardLayout.show(cardPanel, HOME);

    }

}
