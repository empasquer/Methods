public class Opgave2 {

    //2.Print my names(metoder)
    // Skriv et program, der kan udskrive dit fornavn, dit efternavn og
    // dit mellemnavn (hvis du ikke har et mellemnavn, bruger du bare mellemnavnet
    // JavaMaster –detmå du i øvrigt også gerne, hvis du bare synes at dette er sejere end dit
    // faktiske mellemnavn ).
    // Skriv programmet sådan, at du opretter metoderne:
    // printFirstName()printMiddleName()printLastName()
    // De skal alle hedde public voidfør metodenavnet.
    // main-metoden skal gøre ligesom i opgave 1 (for sådan gør vi konsekvent fremover nu!).
    // I run-metoden kan du nu kalde de tre print-metoder i den rækkefølge du ønsker.
    // Kør programmet med forskellige kombinationsmuligheder,
    // fx:•Patrick JavaMaster Agergaard•Agergaard,
    // Patrick JavaMaster (bemærk kommaet –hvor vil du placere det i koden?)
    // •Patrick (JavaMaster)Agergaard (en tilsvarende overvejelse om parantesen









    public static void main(String[] args) {
        new Opgave2().run();
    }
    public void run() {
        giveFirstName();
        System.out.print(" (");
        giveMiddleName();
        System.out.print(") ");
        giveLastName();

    }
    public void giveFirstName() {
        System.out.print("Emma");
    }
    public void giveMiddleName() {
        System.out.print("JavaMaster");
    }
    public void giveLastName() {
        System.out.print("Pasquer");
    }
}
