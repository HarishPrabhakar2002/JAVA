package com.email.emailapplication.Reposittory;

import com.email.emailapplication.Enity.Registerpage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface registerrepo extends JpaRepository<Registerpage,Long> {

    @Query("select a from EMAIL a where a.email=:email")
    Registerpage findByemail(@Param("email")String email);

}
