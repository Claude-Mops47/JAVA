package com.example.java_crud_mysql.Resipository;

import com.example.java_crud_mysql.Entity.Personne;
import org.springframework.data.repository.CrudRepository;

public interface PersonneRepo extends CrudRepository<Personne,Integer> {

}
