package StartMyApi;

import ExchangeCurrency.ExchangeCurrencyMethods;
import RefactorJson.ReadJsonFile;

import java.io.IOException;
import java.util.Scanner;

public class StartApi {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        ReadJsonFile readJsonFile = new ReadJsonFile();
        ExchangeCurrencyMethods exchangeCurrencyMethods = new ExchangeCurrencyMethods();
        String command;
        String waluta;
        String data;
        String dataSprzdazy;
        String price;
        System.out.println("Podaj komende, wszystkie komendy: help");
        try {
            do {

                command = scanner.nextLine();
                if (command.equals("help")) {
                    System.out.println("kupno - pokazuje aktualny kurs kupna waluty ");
                    System.out.println("sprzedaż - pokazuje aktualny kurs sprzedaży waluty ");
                    System.out.println("symulacja - pokazuje możliwy zarobek bądź strate na sprzedaży walut ");
                    System.out.println("koniec - zakończ program ");
                } else if (command.equals("kupno")) {
                    System.out.println("Podaj walutę");
                    waluta = scanner.nextLine();
                    System.out.println("Podaj datę notowania format: rrrr-mm-dd");
                    data = scanner.nextLine();

                    System.out.println("Kurs kupna waluty " + readJsonFile.creatCurrencyFromJson(waluta,data).getCurrency() + " -> " + exchangeCurrencyMethods.showCurrencyToPlnBuy(waluta, data).get());
                } else if (command.equals("sprzedaz")) {
                    System.out.println("Podaj walutę");
                    waluta = scanner.nextLine();
                    System.out.println("Podaj datę notowania format: rrrr-mm-dd");
                    data = scanner.nextLine();
                    System.out.println("Kurs sprzedaży waluty " + waluta.toUpperCase() + " -> " + exchangeCurrencyMethods.showCurrencyToPlnSell(waluta, data).get());
                }else if(command.equals("symulacja")){
                    System.out.println("Podaj walutę");
                    waluta = scanner.nextLine();
                    System.out.println("Podaj datę kupna format: rrrr-mm-dd");
                    data = scanner.nextLine();
                    System.out.println("Podaj datę sprzedaży format: rrrr-mm-dd");
                    dataSprzdazy = scanner.nextLine();
                    System.out.println("ile waluty kupiłeś");
                    price = scanner.nextLine();
                    System.out.println("Symulacja sprzedaży" + readJsonFile.creatCurrencyFromJson(waluta,data).getCurrency() + " -> " + exchangeCurrencyMethods.symulationCurrency(waluta,data,dataSprzdazy, Double.parseDouble(price)));

                }

            } while (!command.equals("koniec"));
        } catch (IOException ioe) {
            System.out.println("Wystąpił błąd");
        }
    }

}
