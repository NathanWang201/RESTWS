
package domain.northamerica;

import java.io.Serializable;
import java.util.HashMap;
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
    "free_start",
    "categories",
    "prices",
    "availabilities",
    "sale",
    "number_of_players",
    "how_to_play",
    "franchises",
    "dlc",
    "publishers",
    "vcs",
    "esrbs",
    "shop",
    "demo",
    "total",
    "systems"
})
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Filter implements Serializable
{

    @JsonProperty("free_start")
    private FreeStart freeStart;
    @JsonProperty("categories")
    private Categories categories;
    @JsonProperty("prices")
    private Prices prices;
    @JsonProperty("availabilities")
    private Availabilities availabilities;
    @JsonProperty("sale")
    private Sale sale;
    @JsonProperty("number_of_players")
    private NumberOfPlayers numberOfPlayers;
    @JsonProperty("how_to_play")
    private HowToPlay howToPlay;
    @JsonProperty("franchises")
    private Franchises franchises;
    @JsonProperty("dlc")
    private Dlc dlc;
    @JsonProperty("publishers")
    private Publishers publishers;
    @JsonProperty("vcs")
    private Vcs vcs;
    @JsonProperty("esrbs")
    private Esrbs esrbs;
    @JsonProperty("shop")
    private Shop shop;
    @JsonProperty("demo")
    private Demo demo;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("systems")
    private Systems systems;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7969055191413577938L;

    @JsonProperty("free_start")
    public FreeStart getFreeStart() {
        return freeStart;
    }

    @JsonProperty("free_start")
    public void setFreeStart(FreeStart freeStart) {
        this.freeStart = freeStart;
    }

    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @JsonProperty("prices")
    public Prices getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    @JsonProperty("availabilities")
    public Availabilities getAvailabilities() {
        return availabilities;
    }

    @JsonProperty("availabilities")
    public void setAvailabilities(Availabilities availabilities) {
        this.availabilities = availabilities;
    }

    @JsonProperty("sale")
    public Sale getSale() {
        return sale;
    }

    @JsonProperty("sale")
    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @JsonProperty("number_of_players")
    public NumberOfPlayers getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @JsonProperty("number_of_players")
    public void setNumberOfPlayers(NumberOfPlayers numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @JsonProperty("how_to_play")
    public HowToPlay getHowToPlay() {
        return howToPlay;
    }

    @JsonProperty("how_to_play")
    public void setHowToPlay(HowToPlay howToPlay) {
        this.howToPlay = howToPlay;
    }

    @JsonProperty("franchises")
    public Franchises getFranchises() {
        return franchises;
    }

    @JsonProperty("franchises")
    public void setFranchises(Franchises franchises) {
        this.franchises = franchises;
    }

    @JsonProperty("dlc")
    public Dlc getDlc() {
        return dlc;
    }

    @JsonProperty("dlc")
    public void setDlc(Dlc dlc) {
        this.dlc = dlc;
    }

    @JsonProperty("publishers")
    public Publishers getPublishers() {
        return publishers;
    }

    @JsonProperty("publishers")
    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    @JsonProperty("vcs")
    public Vcs getVcs() {
        return vcs;
    }

    @JsonProperty("vcs")
    public void setVcs(Vcs vcs) {
        this.vcs = vcs;
    }

    @JsonProperty("esrbs")
    public Esrbs getEsrbs() {
        return esrbs;
    }

    @JsonProperty("esrbs")
    public void setEsrbs(Esrbs esrbs) {
        this.esrbs = esrbs;
    }

    @JsonProperty("shop")
    public Shop getShop() {
        return shop;
    }

    @JsonProperty("shop")
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @JsonProperty("demo")
    public Demo getDemo() {
        return demo;
    }

    @JsonProperty("demo")
    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("systems")
    public Systems getSystems() {
        return systems;
    }

    @JsonProperty("systems")
    public void setSystems(Systems systems) {
        this.systems = systems;
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
