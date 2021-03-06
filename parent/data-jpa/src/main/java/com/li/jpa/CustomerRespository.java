package com.li.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRespository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
