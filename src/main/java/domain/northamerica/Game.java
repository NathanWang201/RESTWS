
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
    "categories",
    "slug",
    "buyitnow",
    "release_date",
    "digitaldownload",
    "free_to_start",
    "title",
    "system",
    "id",
    "number_of_players",
    "nsuid",
    "video_link",
    "eshop_price",
    "front_box_art",
    "game_code",
    "buyonline",
    "sale_price",
    "release_date_display"
})
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Game implements Serializable
{

    @JsonProperty("categories")
    private Categories_ categories;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("buyitnow")
    private String buyitnow;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("digitaldownload")
    private String digitaldownload;
    @JsonProperty("free_to_start")
    private String freeToStart;
    @JsonProperty("title")
    private String title;
    @JsonProperty("system")
    private String system;
    @JsonProperty("id")
    private String id;
    @JsonProperty("number_of_players")
    private String numberOfPlayers;
    @JsonProperty("nsuid")
    private String nsuid;
    @JsonProperty("video_link")
    private String videoLink;
    @JsonProperty("eshop_price")
    private String eshopPrice;
    @JsonProperty("front_box_art")
    private String frontBoxArt;
    @JsonProperty("game_code")
    private String gameCode;
    @JsonProperty("buyonline")
    private String buyonline;
    @JsonProperty("sale_price")
    private String salePrice;
    @JsonProperty("release_date_display")
    private String releaseDateDisplay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -347480593860716122L;

    @JsonProperty("categories")
    public Categories_ getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(Categories_ categories) {
        this.categories = categories;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("buyitnow")
    public String getBuyitnow() {
        return buyitnow;
    }

    @JsonProperty("buyitnow")
    public void setBuyitnow(String buyitnow) {
        this.buyitnow = buyitnow;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("digitaldownload")
    public String getDigitaldownload() {
        return digitaldownload;
    }

    @JsonProperty("digitaldownload")
    public void setDigitaldownload(String digitaldownload) {
        this.digitaldownload = digitaldownload;
    }

    @JsonProperty("free_to_start")
    public String getFreeToStart() {
        return freeToStart;
    }

    @JsonProperty("free_to_start")
    public void setFreeToStart(String freeToStart) {
        this.freeToStart = freeToStart;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("number_of_players")
    public String getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @JsonProperty("number_of_players")
    public void setNumberOfPlayers(String numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @JsonProperty("nsuid")
    public String getNsuid() {
        return nsuid;
    }

    @JsonProperty("nsuid")
    public void setNsuid(String nsuid) {
        this.nsuid = nsuid;
    }

    @JsonProperty("video_link")
    public String getVideoLink() {
        return videoLink;
    }

    @JsonProperty("video_link")
    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    @JsonProperty("eshop_price")
    public String getEshopPrice() {
        return eshopPrice;
    }

    @JsonProperty("eshop_price")
    public void setEshopPrice(String eshopPrice) {
        this.eshopPrice = eshopPrice;
    }

    @JsonProperty("front_box_art")
    public String getFrontBoxArt() {
        return frontBoxArt;
    }

    @JsonProperty("front_box_art")
    public void setFrontBoxArt(String frontBoxArt) {
        this.frontBoxArt = frontBoxArt;
    }

    @JsonProperty("game_code")
    public String getGameCode() {
        return gameCode;
    }

    @JsonProperty("game_code")
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    @JsonProperty("buyonline")
    public String getBuyonline() {
        return buyonline;
    }

    @JsonProperty("buyonline")
    public void setBuyonline(String buyonline) {
        this.buyonline = buyonline;
    }

    @JsonProperty("sale_price")
    public String getSalePrice() {
        return salePrice;
    }

    @JsonProperty("sale_price")
    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    @JsonProperty("release_date_display")
    public String getReleaseDateDisplay() {
        return releaseDateDisplay;
    }

    @JsonProperty("release_date_display")
    public void setReleaseDateDisplay(String releaseDateDisplay) {
        this.releaseDateDisplay = releaseDateDisplay;
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
