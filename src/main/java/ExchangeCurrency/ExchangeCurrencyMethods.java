package ExchangeCurrency;

import RefactorJson.IRefactorJsonFile;
import RefactorJson.Rates;
import RefactorJson.ReadJsonFile;

import java.io.IOException;
import java.util.Optional;

public class ExchangeCurrencyMethods {

    public Optional<Double> showCurrencyToPlnBuy(String currency, String data) throws IOException {
        IRefactorJsonFile actualCurrency = new ReadJsonFile();
        return actualCurrency.creatCurrencyFromJson(currency,data).getRates()
                .stream()
                .map(Rates::getAsk)
                .findFirst();
    }

    public Optional<Double> showCurrencyToPlnSell(String currency, String data) throws IOException {
        IRefactorJsonFile actualCurrency = new ReadJsonFile();
        return actualCurrency.creatCurrencyFromJson(currency,data).getRates()
                .stream()
                .map(Rates::getBid)
                .findFirst();
    }
    public double symulationCurrency(String currency, String buyData,String sellDate, double price) throws IOException {
        double priceSymulation = (showCurrencyToPlnSell(currency,sellDate).get() - showCurrencyToPlnBuy(currency,buyData).get()) * price;
        return priceSymulation;
    }

}
