package domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "games")
public class NsGame {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "na_nsuid")
    private String naNsuid;

    @Column(name = "jp_nsuid")
    private String jpNsuid;

    @Column(name = "eu_nsuid")
    private String euNsuid;

    @Column(name = "na_title")
    private String naTitle;

    @Column(name = "jp_title")
    private String jpTitle;

    @Column(name = "eu_title")
    private String euTitle;

    @Column(name = "rel_date")
    private LocalDate releaseDate;

    @Column(name = "lang")
    private String languages;

    private String publisher;

    @Column(name = "img_url")
    private String imgURL;

    @Column(name = "box_img_url")
    private String boxArtUrl;

    @Column(name = "crit_score")
    private int metaCriticScore;

    @Column(name = "user_score")
    private float metaUserScore;

    private String category;

    @Column(name = "is_dig")
    private boolean isDigital;

    @Column(name = "player_num")
    private int playerNum;

    private boolean multiplayer;

    @Column(name = "tv_mode")
    private boolean tvMode;

    @Column(name = "hand_mode")
    private boolean handMode;

    @NotNull
    @Column(name = "code")
    private String gameCode;

    @Column(name = "meta_name")
    private String metaName;

    private String description;

    private String age_rating;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "game_id")
    private GamePrice gamePrice;

    public String getNaNsuid() {
        return naNsuid;
    }

    public void setNaNsuid(String naNsuid) {
        this.naNsuid = naNsuid;
    }

    public String getJpNsuid() {
        return jpNsuid;
    }

    public void setJpNsuid(String jpNsuid) {
        this.jpNsuid = jpNsuid;
    }

    public String getEuNsuid() {
        return euNsuid;
    }

    public void setEuNsuid(String euNsuid) {
        this.euNsuid = euNsuid;
    }

    public String getNaTitle() {
        return naTitle;
    }

    public void setNaTitle(String naTitle) {
        this.naTitle = naTitle;
    }

    public String getJpTitle() {
        return jpTitle;
    }

    public void setJpTitle(String jpTitle) {
        this.jpTitle = jpTitle;
    }

    public String getEuTitle() {
        return euTitle;
    }

    public void setEuTitle(String euTitle) {
        this.euTitle = euTitle;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getMetaCriticScore() {
        return metaCriticScore;
    }

    public void setMetaCriticScore(int metaCriticScore) {
        this.metaCriticScore = metaCriticScore;
    }

    public float getMetaUserScore() {
        return metaUserScore;
    }

    public void setMetaUserScore(float metaUserScore) {
        this.metaUserScore = metaUserScore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public boolean isTvMode() {
        return tvMode;
    }

    public void setTvMode(boolean tvMode) {
        this.tvMode = tvMode;
    }

    public boolean isHandMode() {
        return handMode;
    }

    public void setHandMode(boolean handMode) {
        this.handMode = handMode;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBoxArtUrl() {
        return boxArtUrl;
    }

    public void setBoxArtUrl(String boxArtUrl) {
        this.boxArtUrl = boxArtUrl;
    }

    public GamePrice getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(GamePrice gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getAge_rating() {
        return age_rating;
    }

    public void setAge_rating(String age_rating) {
        this.age_rating = age_rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NsGame nsGame = (NsGame) o;
        return id == nsGame.id &&
                naNsuid == nsGame.naNsuid &&
                jpNsuid == nsGame.jpNsuid &&
                euNsuid == nsGame.euNsuid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naNsuid, jpNsuid, euNsuid);
    }
}
