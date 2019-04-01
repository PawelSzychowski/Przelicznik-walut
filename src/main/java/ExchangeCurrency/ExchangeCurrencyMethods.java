package ExchangeCurrency;

import RefactorJson.IRefacotorJsonFile;
import RefactorJson.Rates;
import RefactorJson.ReadJsonFile;

import java.io.IOException;
import java.util.Optional;

public class ExchangeCurrencyMethods {

    public Optional<Double> showActualCurrencyToPlnBuy(String currency) throws IOException {
        IRefacotorJsonFile actualCurrency = new ReadJsonFile();
        return actualCurrency.creatCurrencyFromJson(currency).getRates()
                .stream()
                .map(Rates::getAsk)
                .findFirst();
    }

    public Optional<Double> showActualCurrencyToPlnSell(String currency) throws IOException {
        IRefacotorJsonFile actualCurrency = new ReadJsonFile();
        return actualCurrency.creatCurrencyFromJson(currency).getRates()
                .stream()
                .map(Rates::getBid)
                .findFirst();
    }

}
