package Bank.repository;

import Bank.model.CardUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends JpaRepository<CardUser,Integer> {

}
