package com.annotation.customCreation.Repository;

import com.annotation.customCreation.Entity.TableEntity;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<TableEntity,Integer> {
    List<TableEntity> findByName(String name);
}
