package br.com.rodrigo.nostalgicmapapi.services;

import br.com.rodrigo.nostalgicmapapi.models.Place;
import br.com.rodrigo.nostalgicmapapi.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class PlaceService implements Serializable {

    private static final long serialVersionUID = -8002992076554689660L;

    private final PlaceRepository placeRepository;

    @Autowired
    PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> findAllByPersonId(Long personId) {
        return this.placeRepository.findAllByPersonId(personId);
    }

    public Place findByPersonId(Long personId) {
        return this.placeRepository.findByPersonId(personId);
    }
 }
