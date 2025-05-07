package Gym;

import java.util.ArrayList;

public class Iscrizioni {
    private String Nome;
    private String Cognome;
    private String Codice_Fiscale;
    private ArrayList<Abbonamento> abbonamentiAttivi;
    private ArrayList<Abbonamento> storicoAbbonamenti;

    public Iscrizioni(String Nome, String Cognome, String Codice_Fiscale) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Codice_Fiscale = Codice_Fiscale;
        this.abbonamentiAttivi = new ArrayList<>();
        this.storicoAbbonamenti = new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getCodiceFiscale() {
        return Codice_Fiscale;
    }

    public ArrayList<Abbonamento> getAbbonamentiAttivi() {
        return abbonamentiAttivi;
    }

    public ArrayList<Abbonamento> getStoricoAbbonamenti() {
        return storicoAbbonamenti;
    }

    public void aggiungiAbbonamento(Abbonamento abbonamento) {
        abbonamentiAttivi.add(abbonamento);
    }

    public void terminaAbbonamento(Abbonamento abbonamento) {
        if (abbonamentiAttivi.contains(abbonamento)) {
            abbonamentiAttivi.remove(abbonamento);
            storicoAbbonamenti.add(abbonamento);
        }
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + "\nCognome: " + Cognome + "\nCodice Fiscale: " + Codice_Fiscale;
    }
}
