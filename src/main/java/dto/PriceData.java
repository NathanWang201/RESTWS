
package dto;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personalized",
    "country",
    "prices"
})
public class PriceData implements Serializable
{

    @JsonProperty("personalized")
    private Boolean personalized;
    @JsonProperty("country")
    private String country;
    @JsonProperty("prices")
    private List<Price> prices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6970961462412098187L;

    @JsonProperty("personalized")
    public Boolean getPersonalized() {
        return personalized;
    }

    @JsonProperty("personalized")
    public void setPersonalized(Boolean personalized) {
        this.personalized = personalized;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
