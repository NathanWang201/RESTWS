
package domain.northamerica;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number_of_players",
    "total"
})
@Component
@AllArgsConstructor
@NoArgsConstructor
public class NumberOfPlayers implements Serializable
{

    @JsonProperty("number_of_players")
    private List<NumberOfPlayer> numberOfPlayers = null;
    @JsonProperty("total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2649394712128638189L;

    @JsonProperty("number_of_players")
    public List<NumberOfPlayer> getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @JsonProperty("number_of_players")
    public void setNumberOfPlayers(List<NumberOfPlayer> numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
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
