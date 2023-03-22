package vn.com.cmc.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.cmc.testapi.model.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
}
