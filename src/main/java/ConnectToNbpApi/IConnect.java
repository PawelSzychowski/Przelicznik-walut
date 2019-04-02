package ConnectToNbpApi;

import java.io.IOException;

public interface IConnect {
     String readJson(String currency,String data) throws IOException;
}
