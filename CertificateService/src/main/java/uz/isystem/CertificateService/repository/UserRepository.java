package uz.isystem.CertificateService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.CertificateService.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
