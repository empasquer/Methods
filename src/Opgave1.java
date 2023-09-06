public class Opgave1 {
    // 1.Hello,Runner!(metoder)
    // Skriv et ”Hello world”-agtigt program baseret på den nye skabelon med en run()-metode:
    // •main() må kun indeholde et statement: new HelloRunner().run();
    // •public void run()-metoden skal bareudskrive ”Hello,Runner!”på skærmen.
    // Fra og med i dag benytter du denne fremgangsmåde i opgaverne.
    // main() må aldrig indeholde mere end dette.
    // Al kode skal skrive i run() og evt. øvrige metoder.

    public static void main(String[] args) {
        new Opgave1().run();
    }

    public void run() {
        helloRunner();
    }

    public void helloRunner() {
        System.out.println("Hello Runner!");
    }
}
