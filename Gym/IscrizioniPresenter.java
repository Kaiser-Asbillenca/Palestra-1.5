package Gym;

import java.util.ArrayList;

public class IscrizioniPresenter {
    private IscrizioniView view;
    private ArrayList<Iscrizioni> listaIscritti;

    public IscrizioniPresenter(IscrizioniView view) {
        this.view = view;
        this.listaIscritti = new ArrayList<>();
    }

    public void aggiungiIscrizione(String nome, String cognome, String codiceFiscale) {
        Iscrizioni nuovoIscritto = new Iscrizioni(nome, cognome, codiceFiscale);
        listaIscritti.add(nuovoIscritto);
        aggiornaVista();
    }


       public void aggiornaVista() {
    if (listaIscritti.isEmpty()) {
        view.mostraErrore("Nessun iscritto disponibile.");
        return;
    }

    Iscrizioni ultimoIscritto = listaIscritti.get(listaIscritti.size() - 1);
    view.mostraDettagli(ultimoIscritto.toString());


    }

    public ArrayList<Iscrizioni> getListaIscritti() {
        return listaIscritti;
    }
}
