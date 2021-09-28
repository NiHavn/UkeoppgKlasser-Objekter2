package ukeOppgaver;

import static javax.swing.JOptionPane.*;

public class Konto {
    String navn;
    int kontonr;
    double saldo;

    public Konto(String navn, int kontonr, double saldo) {
        this.navn = "Roger Andersen";
        this.kontonr = 1234567891;
        this.saldo = 400.49;
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


    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    public Konto kontoInnskudd = new Konto(getNavn(), getKontonr(),getSaldo()) {

    }
        String mere = showInputDialog("Skriv inn innskuddet");
        double Innskudd = Double.parseDouble(mere);
        double innskudd = getSaldo() + Innskudd;



    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
    public Konto kontoUttak = new Konto(getNavn(),getKontonr(),getSaldo()){
        String mindre = showInputDialog("Skriv inn fratrekket");{
            double Uttak = Double.parseDouble(mindre);
            double uttak = getSaldo() - Uttak;
        }
    };
    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

}