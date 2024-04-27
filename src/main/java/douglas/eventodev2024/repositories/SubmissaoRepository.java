package douglas.eventodev2024.repositories;

import douglas.eventodev2024.domain.Submissao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SubmissaoRepository extends JpaRepository<Submissao, Long> {
    Optional<Submissao> findById(Long id);
}
