package com.springdata.sorting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<entity, Long> {
}
