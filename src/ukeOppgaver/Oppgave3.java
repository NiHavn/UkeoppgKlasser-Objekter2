package ukeOppgaver;

class Bensinkjop{
    private String bergen;
    private String blyfri;
    private double fylling;
    private double pris;
    private String time;

    public Bensinkjop(String bergen, String blyfri, double fylling, double pris, String time){
        this.bergen = bergen;
        this.blyfri = blyfri;
        this.fylling = fylling;
        this.pris = pris;
        this.time = time;
    }
    public void setBergen(String bergen){
        this.bergen = bergen;
    }

    public String getBergen() {
        return bergen;
    }
    public void setBlyfri(String blyfri){
        this.blyfri = blyfri;
    }

    public String getBlyfri() {
        return blyfri;
    }
    public void setFylling(double fylling){
        this.fylling = fylling;
    }

    public double getFylling() {
        return fylling;
    }
    public void setPris(double Pris){
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }
    public void setTime(String time){
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public double finnTotalPrisen(){
        return getFylling()*getPris();
    }
}


/*
Oppgave 3
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)

Klassen skal ha en konstruktør som initialiserer alle attributtene.
Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen.
Denne skal ikke ha noen parametere inn, men skal returnere prisen som
et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
 */


public class Oppgave3 {
    public static void main(String[] args) {

        Bensinkjop bensin = new Bensinkjop("Bergen", "Blyfri 95", 45.50, 18.54, "14.56");



        String prisen = String.format("%.2f", bensin.finnTotalPrisen());
        System.out.println("Prisen for "+ bensin.getBlyfri()+" bensin når man fyller "+
                bensin.getFylling()+" liter, klokken "+bensin.getTime()+" i "+bensin.getBergen()
                +" når prisen pr liter er "+ bensin.getPris()+ " blir "+ prisen+".");
    }
}
