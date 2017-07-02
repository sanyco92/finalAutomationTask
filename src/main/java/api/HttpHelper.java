package api;

import okhttp3.*;

import java.io.IOException;

public class HttpHelper {

    private static final MediaType MediaTypeJSON = MediaType
            .parse("application/json; charset=utf-8");
    private static final String URI_LOGIN = "https://test-maven.cogniance.com//api/v1/login";

    static OkHttpClient client = new OkHttpClient();

    public static Response post(String url, String login, String password) throws IOException {
        //String json2 = "{\"login\":\"maventests+patient+1@gmail.com\", \"password\" : \"Password11\"}";
        String json = "{\"login\":" + "\"" + login + "\"," + "\"password\":" + "\"" + password + "\"}";

        RequestBody body = RequestBody.create(MediaTypeJSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        return client.newCall(request).execute();
    }
}
