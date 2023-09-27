package br.com.luizlcezario.me.forumalura.repositories;

import br.com.luizlcezario.me.forumalura.model.Topics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TopicsRepository extends JpaRepository<Topics, UUID> {
    public Optional<Topics> findByTitle(String title);
}
