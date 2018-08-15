package domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "games")
@Getter
@Setter
public class NsGame {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "na_nsuid")
    private int naNsuid;

    @Column(name = "jp_nsuid")
    private int jpNsuid;

    @Column(name = "eu_nsuid")
    private int euNsuid;

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

    @Column(name = "score")
    private int metaScore;

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
