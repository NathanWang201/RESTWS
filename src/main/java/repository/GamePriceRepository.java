package repository;

import domain.NsGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamePriceRepository extends JpaRepository<NsGame, Long> {
}
