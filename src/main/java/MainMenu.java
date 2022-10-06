import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        int input;
        boolean menuRunning = true;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Gör ett menyval: ");
        System.out.println("1. Läs dagbok. 2. Skriv ett inlägg. 3. Avsluta");

        do {
            System.out.println("Tryck \"1\", \"2\" eller \"3\"");
            input = userInput.nextInt();

            switch (input)
            {
                case 1:
                    System.out.println("Välj vad du vill läsa");
                    break;
                case 2:
                    System.out.println("Skriv in en titel: " );
                    break;
                case 3:
                    System.out.println("Programmet avslutas");
                    menuRunning = false;
                    break;
                default:
                    System.out.println("Du måste välja 1, 2 eller 3.");
            }
        } while (input != 3 & menuRunning);

    }
}
