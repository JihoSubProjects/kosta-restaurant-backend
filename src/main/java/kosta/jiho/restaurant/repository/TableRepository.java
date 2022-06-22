package kosta.jiho.restaurant.repository;

import kosta.jiho.restaurant.domain.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {}
