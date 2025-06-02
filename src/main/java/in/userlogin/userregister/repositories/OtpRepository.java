package in.userlogin.userregister.repositories;

import in.userlogin.userregister.entity.IdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import in.userlogin.userregister.entity.OtpEntity;

public interface OtpRepository extends JpaRepository<OtpEntity, Long> {
    OtpEntity findByUser(IdEntity user);
}
