package uz.isystem.CertificateService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.CertificateService.model.Direction;

import java.util.List;

public interface DirectionRepository extends JpaRepository<Direction,Integer> {
}
