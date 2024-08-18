package springjava.example.sprinboot.controller;

import org.springframework.web.bind.annotation.RestController;

import springjava.example.sprinboot.UsuarioRepository;
import springjava.example.sprinboot.entidades.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> findAll(){

        List<Usuario> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id ){
        Usuario result = repository.findById(id).get();
        return result;

    }
   

}
