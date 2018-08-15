package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
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

    @Column(name = "steam_p")
    private float steamPrice;

    @Column(name = "xbox_p")
    private float xboxPrice;

    @Column(name = "gog_p")
    private float gogPrice;


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
