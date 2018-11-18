package br.com.rodrigo.nostalgicmapapi.services;

import br.com.rodrigo.nostalgicmapapi.models.User;
import br.com.rodrigo.nostalgicmapapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService implements Serializable {

    private static final long serialVersionUID = 298639233014555801L;

    private final UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }


    public User findOneById(Long id) {
        return this.userRepository.getOne(id);
    }

}
