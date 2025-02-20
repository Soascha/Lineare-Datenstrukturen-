import java.util.Scanner;


public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich willkommen zu den linearen Datenstrukturen!");

    }
    public Verwaltung() {
        scanner = new Scanner(System.in);
        Warteschlange warteschlange = new Warteschlange();
        while (true) {
            System.out.println("====== HAUPTMENÜ ======");
            System.out.println("[1] Hinzufuegen");
            System.out.println("[2] Ersten Auslesen");
            System.out.println("[3] Ersten Löschen");
            System.out.println("[4] Manuell hinzufügen");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Wie viele Elemente sollen hinzugefügt werden?");
                option = scanner.nextInt();
                for (int i = 0; i < option; i++) {
                    warteschlange.enqueue(new Element("" + i));
                }
            }
            if (option == 2) {
                //option = scanner.nextInt();
               // warteschlange.gibErsten();
                System.out.println(warteschlange.gibErsten());
            }
            if (option == 3) {
                System.out.println("Lösche erstes Element");
                warteschlange.dequeue();
            }
            if (option == 4) {
                System.out.println("Namen angeben");
                String Namen = scanner.nextLine();
                System.out.println(Namen);
                Element hilfe = new Element(Namen);
                warteschlange.enqueue(hilfe);
            }
    }
}
}