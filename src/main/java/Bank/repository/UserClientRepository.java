package Bank.repository;

import Bank.model.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClientRepository extends JpaRepository<UserClient,Integer> {

}
