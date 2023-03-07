package com.example.java_crud_mysql.Service.PersonneServiceIMPL;

import com.example.java_crud_mysql.Entity.Personne;
import com.example.java_crud_mysql.Resipository.PersonneRepo;
import com.example.java_crud_mysql.Service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonneService {
    @Autowired
    private PersonneRepo repo;

    @Override
    public List<Personne> ConsulterPersonne() {
        return (List<Personne>) this.repo.findAll();
    }

    @Override
    public Personne CreatPersonne(Personne personne) {
        personne.setEmail(personne.getEmail());
        return this.repo.save(personne);
    }

    @Override
    public Personne EditPersonne(Personne personne) {
        return this.repo.save(personne);
    }

    @Override
    public Personne SearchPersonne(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void DeletePersonne(int id) {
        this.repo.deleteById(id);

    }
}
