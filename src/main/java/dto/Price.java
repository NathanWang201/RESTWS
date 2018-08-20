
package dto;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title_id",
    "sales_status",
    "regular_price"
})
public class Price implements Serializable
{

    @JsonProperty("title_id")
    private Integer titleId;
    @JsonProperty("sales_status")
    private String salesStatus;
    @JsonProperty("regular_price")
    private RegularPrice regularPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4395975022779750019L;

    @JsonProperty("title_id")
    public Integer getTitleId() {
        return titleId;
    }

    @JsonProperty("title_id")
    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    @JsonProperty("sales_status")
    public String getSalesStatus() {
        return salesStatus;
    }

    @JsonProperty("sales_status")
    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
    }

    @JsonProperty("regular_price")
    public RegularPrice getRegularPrice() {
        return regularPrice;
    }

    @JsonProperty("regular_price")
    public void setRegularPrice(RegularPrice regularPrice) {
        this.regularPrice = regularPrice;
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
