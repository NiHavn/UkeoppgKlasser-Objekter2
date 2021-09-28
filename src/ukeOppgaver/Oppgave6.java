package ukeOppgaver;

/*
Oppgave 6
Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet
i km/t om det er stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).
Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i.
Bruk gjerne Math.pow funksjonen for å foreta beregningen.

Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1.852 km/h.

Nedenfor illustreres hvordan klassen og metodene skal se ut:

Lag så kode for å teste ut metodene via en main-metode.
 */

import static javax.swing.JOptionPane.*;

class Vind {
    private double vindHastighet = 0.0;

    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }
    // her skal det inn en konstruktør for å sette vindhastigheten

    public double getVindhastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet > 120) {
            return true;
        }else{
            return false;
        }
    }

    public boolean erVindstille() {
        if (vindHastighet < 2){
            return true;
        }else{
            return false;
        }
    }

    public double getKnop() {
        return vindHastighet / 1.852;
    }

    public int getBeaufort() {
        return (int) (Math.pow(vindHastighet / 3.01,0.6666)+0.5);
    }
}

public class Oppgave6 {
    public static void main(String[] args) {
        Vind vind1 = new Vind(67.98);

        String knop = String.format("%.2f", vind1.getKnop());

        showMessageDialog(null, "Vindhastighet : " + vind1.getVindhastighet() +
        "\nOrkan? : " + vind1.erOrkan() +
        "\nVindstille? : " + vind1.erVindstille() +
        "\nBaeufort : " + vind1.getBeaufort() +
        "\nKnop : " + knop);
    }
}
