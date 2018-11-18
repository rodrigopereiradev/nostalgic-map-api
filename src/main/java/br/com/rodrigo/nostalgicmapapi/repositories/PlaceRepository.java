package br.com.rodrigo.nostalgicmapapi.repositories;

import br.com.rodrigo.nostalgicmapapi.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Long> {

    List<Place> findByPersonId(Long person_id);

}
