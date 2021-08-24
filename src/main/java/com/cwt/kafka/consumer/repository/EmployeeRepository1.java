/**
 * 
 */
package com.cwt.kafka.consumer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cwt.kafka.consumer.entity.Employee1;

@Repository
public interface EmployeeRepository1 extends MongoRepository<Employee1, String> {

//  public Customer findByFirstName(String firstName);
//  public List<Customer> findByLastName(String lastName);

}
