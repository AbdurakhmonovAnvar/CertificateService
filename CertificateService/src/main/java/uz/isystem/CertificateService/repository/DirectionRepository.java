package uz.isystem.CertificateService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.CertificateService.model.Direction;

public interface DirectionRepository extends JpaRepository<Direction,Integer> {
    boolean create(Direction direction);


}
