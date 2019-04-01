package ConnectToNbpApi;

import java.io.IOException;

public interface IConnect {
     String readJson(String currency) throws IOException;
}
