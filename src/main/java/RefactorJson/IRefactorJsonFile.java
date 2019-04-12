package RefactorJson;

import java.io.IOException;

public interface IRefactorJsonFile {
     //Create Currency Objcect From Json. Json request is a String.
     Currency creatCurrencyFromJson(String currency,String data) throws IOException;
}

