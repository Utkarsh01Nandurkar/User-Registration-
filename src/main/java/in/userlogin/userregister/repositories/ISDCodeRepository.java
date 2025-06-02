package in.userlogin.userregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userlogin.userregister.entity.ISDCodeEntity;

@Repository
public interface ISDCodeRepository extends JpaRepository<ISDCodeEntity, Long> {
}
