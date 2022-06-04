package uz.isystem.CertificateService.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.isystem.CertificateService.model.User;
import uz.isystem.CertificateService.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class UserService {

    private UserRepository userRepository;


    public boolean create(User user) {
        userRepository.save(user);
        return true;

    }

    public List<User> getAll() {
        return userRepository.findAll();



    }
}
