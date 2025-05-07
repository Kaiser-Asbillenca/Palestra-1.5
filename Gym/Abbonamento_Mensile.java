package Gym;

import java.time.LocalDate;

public class Abbonamento_Mensile extends Abbonamento {
    
    
    public Abbonamento_Mensile(LocalDate dataInizio) {
        super(dataInizio);
        this.dataScadenza = dataInizio.plusMonths(1);
    }

    @Override
    public void attivaAbbonamento() {
        System.out.println("Abbonamento mensile attivato dal " + dataInizio + " al " + dataScadenza);
    }

    @Override
    public String toString() {
        return "Abbonamento Mensile\n" + super.toString();
    }
}
