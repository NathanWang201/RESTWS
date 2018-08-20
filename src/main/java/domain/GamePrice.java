package domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prices")
public class GamePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "game_id")
    private int gameId;

    @Column(name = "us_p")
    private float usPrice;

    @Column(name = "mx_p")
    private float mexicoPrice;

    @Column(name = "ca_p")
    private float canadaPrice;

    @Column(name = "jp_p")
    private float japanPrice;

    @Column(name = "au_p")
    private float australiaPrice;

    @Column(name = "nz_p")
    private float newZealandPrice;

    @Column(name = "gb_p")
    private float greatBritainPrice;

    @Column(name = "ru_p")
    private float russiaPrice;

    @Column(name = "cz_p")
    private float czechPrice;

    @Column(name = "eu_p")
    private float europePrice;

    @Column(name = "za_p")
    private float southAfricaPrice;

    @Column(name = "dk_p")
    private float denmarkPrice;

    @Column(name = "steam_p")
    private float steamPrice;

    @Column(name = "xbox_p")
    private float xboxPrice;

    @Column(name = "gog_p")
    private float gogPrice;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private NsGame nsGame;

    public GamePrice(float usPrice, float mexicoPrice, float canadaPrice, float japanPrice, float australiaPrice, float newZealandPrice, float greatBritainPrice, float russiaPrice, float czechPrice, float europePrice, float southAfricaPrice, float denmarkPrice, float steamPrice, float xboxPrice, float gogPrice, NsGame nsGame) {
        this.usPrice = usPrice;
        this.mexicoPrice = mexicoPrice;
        this.canadaPrice = canadaPrice;
        this.japanPrice = japanPrice;
        this.australiaPrice = australiaPrice;
        this.newZealandPrice = newZealandPrice;
        this.greatBritainPrice = greatBritainPrice;
        this.russiaPrice = russiaPrice;
        this.czechPrice = czechPrice;
        this.europePrice = europePrice;
        this.southAfricaPrice = southAfricaPrice;
        this.denmarkPrice = denmarkPrice;
        this.steamPrice = steamPrice;
        this.xboxPrice = xboxPrice;
        this.gogPrice = gogPrice;
        this.nsGame = nsGame;
    }

    public float getRussiaPrice() {
        return russiaPrice;
    }

    public void setRussiaPrice(float russiaPrice) {
        this.russiaPrice = russiaPrice;
    }

    public float getCzechPrice() {
        return czechPrice;
    }

    public void setCzechPrice(float czechPrice) {
        this.czechPrice = czechPrice;
    }

    public float getEuropePrice() {
        return europePrice;
    }

    public void setEuropePrice(float europePrice) {
        this.europePrice = europePrice;
    }

    public float getSouthAfricaPrice() {
        return southAfricaPrice;
    }

    public void setSouthAfricaPrice(float southAfricaPrice) {
        this.southAfricaPrice = southAfricaPrice;
    }

    public float getDenmarkPrice() {
        return denmarkPrice;
    }

    public void setDenmarkPrice(float denmarkPrice) {
        this.denmarkPrice = denmarkPrice;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public float getUsPrice() {
        return usPrice;
    }

    public void setUsPrice(float usPrice) {
        this.usPrice = usPrice;
    }

    public float getMexicoPrice() {
        return mexicoPrice;
    }

    public void setMexicoPrice(float mexicoPrice) {
        this.mexicoPrice = mexicoPrice;
    }

    public float getCanadaPrice() {
        return canadaPrice;
    }

    public void setCanadaPrice(float canadaPrice) {
        this.canadaPrice = canadaPrice;
    }

    public float getJapanPrice() {
        return japanPrice;
    }

    public void setJapanPrice(float japanPrice) {
        this.japanPrice = japanPrice;
    }

    public float getAustraliaPrice() {
        return australiaPrice;
    }

    public void setAustraliaPrice(float australiaPrice) {
        this.australiaPrice = australiaPrice;
    }

    public float getNewZealandPrice() {
        return newZealandPrice;
    }

    public void setNewZealandPrice(float newZealandPrice) {
        this.newZealandPrice = newZealandPrice;
    }

    public float getGreatBritainPrice() {
        return greatBritainPrice;
    }

    public void setGreatBritainPrice(float greatBritainPrice) {
        this.greatBritainPrice = greatBritainPrice;
    }

    public float getSteamPrice() {
        return steamPrice;
    }

    public void setSteamPrice(float steamPrice) {
        this.steamPrice = steamPrice;
    }

    public float getXboxPrice() {
        return xboxPrice;
    }

    public void setXboxPrice(float xboxPrice) {
        this.xboxPrice = xboxPrice;
    }

    public float getGogPrice() {
        return gogPrice;
    }

    public void setGogPrice(float gogPrice) {
        this.gogPrice = gogPrice;
    }

    public NsGame getNsGame() {
        return nsGame;
    }

    public void setNsGame(NsGame nsGame) {
        this.nsGame = nsGame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePrice gamePrice = (GamePrice) o;
        return id == gamePrice.id &&
                gameId == gamePrice.gameId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gameId);
    }
}
