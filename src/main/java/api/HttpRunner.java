package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;
import support.MustConfirmSafetyInfo;
import support.Result;

import java.io.IOException;

/**
 * Created by aleksandr.kot on 7/1/17.
 */
public class HttpRunner {

        /*public static void main(String[] args) throws IOException {
            Response response = api.HttpHelper.post("https://test-maven.cogniance.com//api/v1/login");
            String jsonString = response.body().string();
            System.out.println(jsonString);

            Result result = new ObjectMapper().readValue(jsonString, Result.class);
            System.out.println("mustConfirmSafetyInfo Value = " + result.getMustConfirmSafetyInfoValue());
        }*/

        public boolean CheckMustConfirmSafetyInfo(String login, String password) throws IOException {
            Response response = api.HttpHelper.post("https://test-maven.cogniance.com//api/v1/login", login, password);
            String jsonString = response.body().string();
            System.out.println("\n" + jsonString);

            Result result = new ObjectMapper().readValue(jsonString, Result.class);
            System.out.println("MustConfirmSafetyInfo value = " + result.getMustConfirmSafetyInfoValue());
            return result.getMustConfirmSafetyInfoValue();
        }
}
