package Gym;

import java.time.LocalDate;

public class Abbonamento_Annuale extends Abbonamento {
    
    
    public Abbonamento_Annuale(LocalDate dataInizio) {
        super(dataInizio);
        this.dataScadenza = dataInizio.plusYears(1);
    }

    @Override
    public void attivaAbbonamento() {
        System.out.println("Abbonamento annuale attivato dal " + dataInizio + " al " + dataScadenza);
    }

    @Override
    public String toString() {
        return "Abbonamento Annuale\n" + super.toString();
    }
}
