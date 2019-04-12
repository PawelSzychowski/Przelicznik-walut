package RefactorJson;

import ConnectToNbpApi.SendRequest;
import com.google.gson.Gson;

import java.io.IOException;

public class ReadJsonFile implements IRefactorJsonFile{

    public Currency creatCurrencyFromJson(String currency, String data) throws IOException {
        Gson gson = new Gson();
        SendRequest sendRequest = new SendRequest();
        Currency currencyObject = gson.fromJson(sendRequest.readJson(currency,data), Currency.class);
        return currencyObject;
    }
}
