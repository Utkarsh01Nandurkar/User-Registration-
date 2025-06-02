package in.userlogin.userregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.userlogin.userregister.entity.IdEntity;
@Repository
public interface IdRepository extends JpaRepository<IdEntity, Long>{

}
