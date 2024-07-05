package com.specification.filtration.Repository;

import com.specification.filtration.Entity.filter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface datastore extends JpaRepository<filter,Integer>, JpaSpecificationExecutor<filter> {
}
