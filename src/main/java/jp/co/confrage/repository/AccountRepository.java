package jp.co.confrage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.confrage.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
  @Query(value = "select * from test_tbl", nativeQuery = true)
  List<AccountEntity> findCustom();
}
