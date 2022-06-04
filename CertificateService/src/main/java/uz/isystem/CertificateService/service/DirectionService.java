package uz.isystem.CertificateService.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.isystem.CertificateService.model.Direction;
import uz.isystem.CertificateService.repository.DirectionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectionService {
    private DirectionRepository directionRepository;

    public boolean create(Direction direction) {
        directionRepository.save(direction);
        return true;

    }


    public List<Direction> getAll() {
        return directionRepository.findAll();



    }
}
