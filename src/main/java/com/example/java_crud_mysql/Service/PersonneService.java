package com.example.java_crud_mysql.Service;

import com.example.java_crud_mysql.Entity.Personne;

import java.util.List;

public interface PersonneService {
    public List<Personne> ConsulterPersonne();
    public Personne CreatPersonne(Personne personne);
    public Personne EditPersonne(Personne personne);
    public Personne SearchPersonne(int id);
    public void DeletePersonne(int id);

}
