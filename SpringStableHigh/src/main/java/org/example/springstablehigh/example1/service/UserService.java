package org.example.springstablehigh.example1.service;

import java.util.HashSet;
import java.util.Set;
import org.example.springstablehigh.example1.exception.DuplicateEmailException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final Set<String> emails = new HashSet<>();

  public void register(String email) {
    if (emails.contains(email)) {
      throw new DuplicateEmailException(email);
    }
    emails.add(email);
  }

}
