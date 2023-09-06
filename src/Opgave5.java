import java.util.Scanner;

public class Opgave5 {

    // 5.BMI calculator(argumenter og parametre)
    // Dette program skal beregne brugeren body mass index (BMI).
    // BMI beregnes efter formlen:
    // BMI = vægt (kg)/ højde (m)^2
    // Skriv et program med en run-metode jf. opgave 1.
    // I denne opgave skal run-metoden bede om brugerens:
    // •højde i cm
    // •vægt i kg
    // Dernæst skal programmet kalde metoden calculate
    // Bmi, der modtager de to oplysninger som parametre.
    // Metoden skal udskrive BMI’et og en vurdering af vægtniveauet jf. denne skala:
    // For eksempel:Dit BMI er 26,4 og du er overvægtig.



    public static void main(String[] args) {
        new Opgave5().run();
    }

    public void run() {
        double weight, bmi, heightInM;
        int height;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Let's calculate your BMI.");
        System.out.println("How much do you weigh?");
        weight = userInput.nextDouble();
        System.out.println("How tall are you?");
        height = userInput.nextInt();
        heightInM = (height * 0.01);
        System.out.println(heightInM);

        bmi = calculateBMI(weight, heightInM);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if(bmi < 16) {
            System.out.println("You are severely underweight.");
        }
        else if (bmi>=16 && bmi <= 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi > 18.5 && bmi <= 25 ) {
            System.out.println("You are normal.");
        } else if (bmi > 25 && bmi <= 30 ) {
            System.out.println("You are overweight.");
        } else if (bmi > 30 && bmi <= 35 ) {
            System.out.println("You are first degree obese.");
        } else if (bmi > 35) {
            System.out.println("You are second degree overweight.");
        }
    }

    public double calculateBMI(double weight, double heightInM) {
        return weight / Math.pow(heightInM, 2);
    }
}
