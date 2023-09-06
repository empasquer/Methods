import java.util.Scanner;

public class Opgave6 {

    // Opgave 6: Fitness center subscription(returværdier)
    // Skriv et program, der kan bruges i et fitnesscenter til at udregne et medlems abonnementspris.
    // Brugeren skal indtaste de nødvendige oplysninger, hvorefter programmet skal fortælle hvad prisen bliver fro den pågældende måned.
    // Grundprisen er 300 kr. om måneden, men der gives rabat jf. nedenstående
    // •Studerende får 40 % rabat
    // •Pensionister får 20 % rabat
    // •Efter tre måneders medlemskab sparer man5 % og efter seks måneder 10 %
    // •Hvis man er passivt medlem, betaler man 25 kr. om måneden uanset rabatter
    // •I den måned, hvor man har fødselsdag, sparer man 15 %
    // •For hver 12 måneders medlemskab,sparer man 25 % dén måned(altså efter 1 år, 2 år osv.)
    // Byg programmet op ved hjælp af små, specialiserede metoder.

    public static void main(String[] args) {
        new Opgave6().run();
    }
    public void run() {
        boolean isStudent, isRetired,hasBeenMemberOver6Months, hasBeenMemberOver3Months, isPassive, hasBirthdayThisMonth, isAnniversaryMonth;
        Scanner userInput = new Scanner(System.in);
        System.out.println("The basic membership is 300kr/month.");
        System.out.println("Let's see if we can get you a discount!");
        System.out.println("Have you a passive member this month? true/false");
        isPassive = userInput.nextBoolean();
        System.out.println("Are you a student? true/false");
        isStudent = userInput.nextBoolean();
        System.out.println("Are you retired? true/false");
        isRetired = userInput.nextBoolean();
        System.out.println("Have you been a member for over 6 months? true/false");
        hasBeenMemberOver6Months = userInput.nextBoolean();
        if (!hasBeenMemberOver6Months) {
            System.out.println("Have you been a member for over 3 months? true/false");
            hasBeenMemberOver3Months = userInput.nextBoolean();
        } else {
            hasBeenMemberOver3Months = false;
        }
        System.out.println("Is your birthday this month? true/false");
        hasBirthdayThisMonth = userInput.nextBoolean();
        System.out.println("Do you have your gym membership anniversary this month? true/false");
        isAnniversaryMonth = userInput.nextBoolean();
        System.out.println("Thank you for answering all of this,\nwe will now calculate your reduced price if there is any available discount for you!");

        System.out.printf("\nYour new membership price for this month is of : %.2f dkk. Congrats on your discount!", calculateMembership(isStudent, isRetired,hasBeenMemberOver6Months, hasBeenMemberOver3Months, isPassive, hasBirthdayThisMonth, isAnniversaryMonth));


        //or
        // make it so that we ask birthday,
        // life status : student, retired, or other
        // date for when they started membership
        // etc and calculate from those datas


    }
    public double calculateMembership(boolean isStudent, boolean isRetired, boolean hasBeenMemberOver6Months, boolean hasBeenMemberOver3Months, boolean isPassive, boolean hasBirthdayThisMonth, boolean isAnniversaryMonth) {

        double membership = 300;

        if (isPassive) {
            membership = 25;
        } else {
            if (isStudent) {
                membership = membership - (membership * 0.4);
            }
            if (isRetired) {
                membership = membership - (membership * 0.2);
            }
            if (hasBeenMemberOver6Months) {
                membership = membership - (membership * 0.1);
            } else {
                if (hasBeenMemberOver3Months) {
                    membership = membership - (membership * 0.05);
                }
            }
            if (hasBirthdayThisMonth) {
                membership = membership - (membership * 0.15);
            }
            if (isAnniversaryMonth) {
                membership = membership - (membership * 0.25);
            }
        }
        return membership;
    }
}
