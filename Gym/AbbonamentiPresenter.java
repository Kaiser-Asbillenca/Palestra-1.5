package Gym;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class AbbonamentiPresenter {
    private AbbonamentiView view;

    public AbbonamentiPresenter(AbbonamentiView view) {
        this.view = view;
        this.view.addAggiungiAbbonamentoListener(e -> aggiungiAbbonamento());
    }


    private void aggiungiAbbonamento() {
        String codiceFiscale = view.getCodiceFiscale().trim();
        String tipo = view.getTipoAbbonamento();
        
        if (codiceFiscale.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Inserire il codice fiscale!",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        IscrittiManager mgr = IscrittiManager.getInstance();
        Iscrizioni trovato = null;
        for (Iscrizioni i : mgr.getListaIscritti()) {
            if (i.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
                trovato = i;
                break;
            }
        }

        if (trovato == null) {
            JOptionPane.showMessageDialog(null,
                    "Iscritto non trovato con il codice: " + codiceFiscale,
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Abbonamento abbonamento;
        if (tipo.equalsIgnoreCase("Mensile")) {
            abbonamento = new Abbonamento_Mensile(LocalDate.now());
        } else {
            abbonamento = new Abbonamento_Annuale(LocalDate.now());
        }

        trovato.aggiungiAbbonamento(abbonamento);

        String msg = "Abbonamento aggiunto con successo per:\n" 
                + trovato.toString()
                + "\nDettaglio abbonamento:\n" 
                + abbonamento.toString();

        JOptionPane.showMessageDialog(null, msg, "Conferma", JOptionPane.INFORMATION_MESSAGE);

        //view.resetInput();
    }
}
