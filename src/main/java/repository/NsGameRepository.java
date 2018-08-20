package repository;

import domain.NsGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NsGameRepository extends JpaRepository<NsGame, Long> {
}
