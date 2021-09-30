package ukeOppgaver;

public class Bank {

    public static void main(String[] args)
    {

        Konto konto1 = new Konto("Roger Andersen", 1234567891, 400);


    /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */

        konto1.getSkrivut();

        System.out.println(konto1.getUttak(150));

        System.out.println(konto1.getInnskudd(200));
    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */

    }
}
