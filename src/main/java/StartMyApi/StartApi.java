package StartMyApi;

import ExchangeCurrency.ExchangeCurrencyMethods;

import java.io.IOException;
import java.util.Scanner;

public class StartApi {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        ExchangeCurrencyMethods exchangeCurrencyMethods = new ExchangeCurrencyMethods();
        String command;
        String waluta;
        System.out.println("Podaj komende, wszystkie komendy: help");
        try {
            do {

                command = scanner.nextLine();
                if (command.equals("help")) {
                    System.out.println("kupno - pokazuje aktualny kurs kupna waluty ");
                    System.out.println("sprzedaż - pokazuje aktualny kurs sprzedaży waluty ");
                    System.out.println("koniec - zakończ program ");
                } else if (command.equals("kupno")) {
                    System.out.println("Podaj walutę");
                    waluta = scanner.nextLine();
                    System.out.println("Kurs kupna waluty " + waluta + " -> " + exchangeCurrencyMethods.showActualCurrencyToPlnBuy(waluta).get());
                } else if (command.equals("sprzedaz")) {
                    System.out.println("Podaj walutę");
                    waluta = scanner.nextLine();
                    System.out.println("Kurs sprzedaży waluty " + waluta + " -> " + exchangeCurrencyMethods.showActualCurrencyToPlnBuy(waluta).get());
                }

            } while (!command.equals("koniec"));
        } catch (IOException ioe) {
            System.out.println("Wystąpił błąd");
        }
    }

}
