package Gym;

import java.util.ArrayList;
import javax.swing.JTextField;

public class IscrittiManager {
    private static IscrittiManager instance;
    private ArrayList<Iscrizioni> listaIscritti;

    private IscrittiManager() {
        listaIscritti = CsvManager.getInstance().caricaIscritti();
    }

    public static IscrittiManager getInstance() {
        if (instance == null) {
            instance = new IscrittiManager();
        }
        return instance;
    }

    public void aggiungiIscritto(Iscrizioni iscritto) {
        listaIscritti.add(iscritto);
        CsvManager.getInstance().salvaIscritti(listaIscritti);
    }

    public ArrayList<Iscrizioni> getListaIscritti() {
        return listaIscritti;
    }

    Iscrizioni trovaIscritto(JTextField Codice_Fiscale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iscrizioni trovaIscritto(String Codice_Fiscale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
