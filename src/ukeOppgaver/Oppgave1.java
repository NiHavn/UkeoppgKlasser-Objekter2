package ukeOppgaver;

import static javax.swing.JOptionPane.*;

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn() {
        return fornavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return etternavn;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }
}

/*
Oppgave 1
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
 */

public class Oppgave1 {

    public static void main(String[] args) {

        String Fornavn = showInputDialog("Skriv inn fornavn");
        String Etternavn = showInputDialog("Skriv inn etternavn");
        String Adresse = showInputDialog("Skriv inn adresse");
        String TLFnr = showInputDialog("Skriv inn TLFnr");

        Person person1 = new Person(Fornavn, Etternavn, Adresse, TLFnr);


        showMessageDialog(null, "Fornavn : " + person1.getFornavn()+"\n Etternavn : " + person1.getEtternavn()+
                "\n Adresse : "+person1.getAdresse()+ " \n TLFnr : "+ person1.getTelefonnr());

    }
}
