package com.retreivingdata.Hello.Repository;


import com.retreivingdata.Hello.TableCreation.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Employee,Long> , JpaSpecificationExecutor<Employee> {
}
