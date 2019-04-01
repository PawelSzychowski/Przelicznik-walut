package ConnectToNbpApi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SendRequest implements IConnect {
    public  String readJson(String currency) throws IOException {
        URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/c/"+currency+"\n");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("USER_AGENT", "Chrome");
        InputStream inputStream = url.openStream();
        Scanner scanner = new Scanner(inputStream);
        String request = scanner.nextLine();
        return request;
    }
}
