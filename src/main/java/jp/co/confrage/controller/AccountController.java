package jp.co.confrage.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.confrage.entity.AccountEntity;
import jp.co.confrage.repository.AccountRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AccountController {

  private final AccountRepository accountRepository;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ResponseEntity<?> index() {
    List<AccountEntity> emplist = accountRepository.findAll();

    return new ResponseEntity<Object>(emplist, HttpStatus.OK);
  }

  public void select() {
    List<AccountEntity> ret = accountRepository.findCustom();
  }
}
