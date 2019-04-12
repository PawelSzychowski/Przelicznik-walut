package ConnectToNbpApi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SendRequestTest {
    SendRequest sendRequest;
    @BeforeEach
    void startUp(){
        sendRequest = new SendRequest();
    }
    @Test
    void ShouldThrowsIOExceptionWhenValueIsIncorect() {
        String waluta = "abc";
        String data = "abc";

        try {
             sendRequest.readJson(waluta, data);

             fail("Exeption wasnt't thrown" );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}