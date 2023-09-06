import java.util.Random;

public class Opgave3 {

    //3.Donald’s nephews(metoder)
    // Skriv et program, der udskriver navnene på Anders Ands tre nevøer: Rip, Rap og Rup.
    // Hvert navn skal udskrives af en separat metode.
    // I run-metoden skal du nu udskrive tre tilfældige navne på én linje.
    // Java skriver måske: Rup, Rap og Rap.
    // Det samme navn kan altså optræde 0-3 gange for hver kørsel.
    // Husk at tilføje komma og ”og”i udskriften.
    // Tilføj en for-løkke, så programmet gør dette 25 gange.


    public static void main(String[] args) {
        new Opgave3().run();
    }

    public void run() {


        for (int i=0; i<=25; i++) {
            System.out.println("Anders Ands tre nevøer er:");
            choseRandomNumber();
            System.out.print(", ");
            choseRandomNumber();
            System.out.print(" and ");
            choseRandomNumber();
            System.out.println("\n"); //scanner bug
        }



    }
    public void choseRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1;

        if (randomNumber == 1) {
            sayRip();
        } else if (randomNumber == 2) {
            sayRap();
        } else if (randomNumber == 3) {
            sayRup();
        }
    }

    public void sayRip() {
        System.out.print("Rip");
    }
    public void sayRap() {
        System.out.print("Rap");
    }
    public void sayRup() {
        System.out.print("Rup");
    }
}
