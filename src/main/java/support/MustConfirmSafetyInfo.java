package support;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

/**
 * Created by aleksandr.kot on 7/1/17.
 */
@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class MustConfirmSafetyInfo {

    @JsonProperty
    private boolean mustConfirmSafeteInfo;

    public boolean getMustConfirmSafetyInfoValue() {
        return mustConfirmSafeteInfo;
    }


}
