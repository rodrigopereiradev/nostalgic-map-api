package br.com.rodrigo.nostalgicmapapi.repositories;

import br.com.rodrigo.nostalgicmapapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
