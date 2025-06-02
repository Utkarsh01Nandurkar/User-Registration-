package in.userlogin.userregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.userlogin.userregister.entity.AccountCreationEntity;

public interface AccountCreationRepository extends JpaRepository<AccountCreationEntity, Long> {
}