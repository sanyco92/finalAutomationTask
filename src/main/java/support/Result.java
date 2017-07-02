package support;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by aleksandr.kot on 7/1/17.
 */

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty
    private boolean mustConfirmSafetyInfo;

    @JsonProperty
    private String login;

    public boolean getMustConfirmSafetyInfoValue() {
        return mustConfirmSafetyInfo;
    }

    public String getLogin() {
        return login;
    }
}
