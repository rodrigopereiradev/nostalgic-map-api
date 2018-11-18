package br.com.rodrigo.nostalgicmapapi.repositories;

import br.com.rodrigo.nostalgicmapapi.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Long> {

    Place findByPersonId(Long personId);

    List<Place> findAllByPersonId(Long personId);

}
