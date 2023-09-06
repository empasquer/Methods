import java.util.Scanner;

public class Opgave4 {

    //4.TV channels(variabler og scope)
    // Skriv et programmed en run-metode, der beder brugeren vælge mellem at se tre TV-kanaler
    // (fx DR, TV2 og TV3).
    // Hver kanal har ”sin egen” metode, som run()kalder jf. brugerens valg.
    // I hver metode skal der være en lokal String-variabel kaldet currentShow,
    // der fortæller hvad kanalen viser netop nu.
    // Find selv på en titel til hver kanal.
    // Når brugeren har valgt kanal, skal programmet udskrive teksten
    // Du ser ”The Matrix”på TV2e.a.



    public static void main(String[] args) {
        new Opgave4().run();
    }
    public void run() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose one of the following 3 channels.");
        System.out.println("DR, Ramasjang or TV2");
        String chosenChannel = userInput.nextLine();
        String currentShow = "";

        if (chosenChannel.equalsIgnoreCase("DR")) {
            currentShow = showProgramOnDR(); // Get the current show
        } else if (chosenChannel.equalsIgnoreCase("Ramasjang")) {
            currentShow = showProgramOnRamasjang(); // Get the current show
        } else if (chosenChannel.equalsIgnoreCase("TV2")) {
            currentShow = showProgramOnTV2(); // Get the current show
        } else {
            System.out.println("This is not a supported channel.");
        }

        System.out.println("You are seeing " + currentShow + " on " + chosenChannel.toUpperCase());

    }

    public String showProgramOnDR() {
        return "Nyheder";
    }
    public String showProgramOnRamasjang() {
        return "Paw Patrol";
    }
    public String showProgramOnTV2() {
        return "The Matrix";
    }

}
