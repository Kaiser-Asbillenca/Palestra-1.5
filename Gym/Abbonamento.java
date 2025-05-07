package Gym;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Abbonamento {
    protected LocalDate dataInizio;
    protected LocalDate dataScadenza;

    public Abbonamento(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public abstract void attivaAbbonamento();

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Data Inizio: " + dataInizio.format(formatter) + "\nData Scadenza: " + dataScadenza.format(formatter);
    }
}
