package com.example.java_crud_mysql.Controller;

import com.example.java_crud_mysql.Entity.Personne;
import com.example.java_crud_mysql.Service.PersonneServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controll {
    @Autowired
    private PSIMPL psimpl;

    @GetMapping
    @RequestMapping(value = "ConsulterPersonne",method = RequestMethod.GET)
    public ResponseEntity<?> ConsulterPersonne(){
        List<Personne> personneList=this.psimpl.ConsulterPersonne();
        return ResponseEntity.ok(personneList);
    }

    @PostMapping
    @RequestMapping(value = "CreatePersonne",method = RequestMethod.POST)
    public ResponseEntity<?> CreatePersonne(@RequestBody Personne personne){
        Personne PersonneCreated=this.psimpl.CreatPersonne(personne);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonneCreated);
    }


    @PutMapping
    @RequestMapping(value = "EditPersonne",method = RequestMethod.PUT)
    public ResponseEntity<?> EditPersonne(@RequestBody Personne personne){
        Personne PersonneEdited=this.psimpl.EditPersonne(personne);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonneEdited);
    }


    @GetMapping
    @RequestMapping(value = "SearchPersonne/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> SearchPersonne(@PathVariable int id){
        Personne personne=this.psimpl.SearchPersonne(id);
        return ResponseEntity.ok(personne);
    }


    @DeleteMapping
    @RequestMapping(value = "DeletePersonne/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> DeletePersonne(@PathVariable int id){
        this.psimpl.DeletePersonne(id);
        return ResponseEntity.ok().build();
    }
}
