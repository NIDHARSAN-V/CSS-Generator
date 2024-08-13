package com.SpringCrud.SpringApp.CRepo;


import com.SpringCrud.SpringApp.Entity.Cust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CustRepo extends JpaRepository<Cust,Integer> {
}
