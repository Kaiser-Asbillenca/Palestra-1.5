package Gym;

import java.io.*;
import java.util.ArrayList;

public class CsvManager {
    private static CsvManager instance;
    private static final String FILE_PATH = "iscritti.csv";

    private CsvManager() {}

    public static CsvManager getInstance() {
        if (instance == null) {
            instance = new CsvManager();
        }
        return instance;
    }

    public void salvaIscritti(ArrayList<Iscrizioni> listaIscritti) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Iscrizioni iscritto : listaIscritti) {
                writer.println(iscritto.getNome() + "," + iscritto.getCognome() + "," + iscritto.getCodiceFiscale());
            }
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del CSV: " + e.getMessage());
        }
    }

    public ArrayList<Iscrizioni> caricaIscritti() {
        ArrayList<Iscrizioni> lista = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return lista;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parti = line.split(",");
                if (parti.length >= 3) {
                    Iscrizioni iscritto = new Iscrizioni(parti[0], parti[1], parti[2]);
                    lista.add(iscritto);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del CSV: " + e.getMessage());
        }
        return lista;
    }
}
