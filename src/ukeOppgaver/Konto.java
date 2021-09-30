package ukeOppgaver;

import static javax.swing.JOptionPane.*;

public class Konto {
    String navn;
    int kontonr;
    double saldo;

    public Konto(String navn, int kontonr, double saldo) {
        this.navn = "Roger Andersen";
        this.kontonr = 1234567891;
        this.saldo = 400;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }

    public int getKontonr() {
        return kontonr;
    }
    public void setKontonr(int kontonr){
        this.kontonr = kontonr;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void getSkrivut(){
        showMessageDialog(null, "Navn : " + getNavn() +
                "\nKontonr : " + getKontonr() +
                "\nSaldo" + getSaldo());
    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    public String getInnskudd(double Innskudd){
        saldo = saldo + Innskudd;
        return "Den nye saldoen er " + saldo;
    }
    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    public String getUttak(double Uttak){

        if(saldo < Uttak){
            return "Det er utilstrekkelig dekning på kontoen";
        }
        saldo = saldo - Uttak;
        {
            return "Den nye saldoen på kontoen er : " + saldo;
        }
    }
    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

}