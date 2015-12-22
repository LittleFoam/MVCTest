package org.mvc.test.repository;

import org.mvc.test.model.HelloStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloStudentRepository extends JpaRepository<HelloStudent, String> {
}
