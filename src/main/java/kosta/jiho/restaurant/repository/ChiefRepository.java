package kosta.jiho.restaurant.repository;

import kosta.jiho.restaurant.domain.Chief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiefRepository extends JpaRepository<Chief, Long> {}
