package jp.co.confrage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "test_tbl")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountEntity {
  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "name")
  private String name;
}
