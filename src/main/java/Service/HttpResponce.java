package Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpResponce {

    private OkHttpClient client = new OkHttpClient();

    public HttpResponce() {
        try {
            client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getRequest(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response.code());
            }
            return response.body().string();

        }

    }

}




