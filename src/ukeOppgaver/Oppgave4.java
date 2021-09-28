package ukeOppgaver;

import static javax.swing.JOptionPane.*;

class Klokke {
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {

        if (time > 0 && time < 24) {
            this.time = time;
        }

        if (minutter > 0 && minutter < 59) {
            this.minutter = minutter;
        }

        if (sekunder > 0 && sekunder < 59) {
            this.sekunder = sekunder;
        }
    }

    public void setTime(int time) {
        if (time >= 0 && time <= 23) {
            this.time = time;
        }
    }

    public int getTime() {
        return time;
    }

    public void setMinutter(int minutter) {
        if (minutter >= 0 && minutter <= 59) {
            this.minutter = minutter;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && sekunder <= 59) {
            this.sekunder = sekunder;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void visTiden(){
        System.out.print(getTime()+" : "+getMinutter()+" "+getSekunder());
    }
}

/*
Oppgave 4
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende
format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
 */

public class Oppgave4 {
    public static void main(String[] args) {

        String timer = showInputDialog("Skriv inn time");
        String minutter = showInputDialog("Skriv inn minutter");
        String sekunder = showInputDialog("Skriv inn sekunder");

        int Timer = Integer.parseInt(timer);
        int Minutter = Integer.parseInt(minutter);
        int Sekunder = Integer.parseInt(sekunder);

        Klokke klokke = new Klokke(Timer, Minutter, Sekunder);

        int hour = klokke.getTime();
        int minuntes = klokke.getMinutter();
        int seconds = klokke.getSekunder();

        System.out.print(hour+" : "+minuntes+" : "+seconds);
    }
}
