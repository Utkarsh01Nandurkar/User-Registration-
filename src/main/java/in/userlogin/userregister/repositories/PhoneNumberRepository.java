package in.userlogin.userregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.userlogin.userregister.entity.PhoneNumberEntity;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumberEntity, Long> {
    PhoneNumberEntity findByPhoneNo(String phoneNo);
}
