package com.mekaki.allaney.Student;

import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student,Long> {
}
