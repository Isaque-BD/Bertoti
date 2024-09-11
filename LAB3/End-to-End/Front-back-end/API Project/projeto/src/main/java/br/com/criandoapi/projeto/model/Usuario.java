package br.com.criandoapi.projeto.model;

import org.hibernate.annotations.Columns;
import org.hibernate.mapping.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @jakarta.persistence.Column(name = "id")
    private Integer id;
    
    @jakarta.persistence.Column(name = "nome", length = 200, nullable = true)
    private String nome;

    @jakarta.persistence.Column(name = "email", length = 50, nullable = true)
    private String email;

    @jakarta.persistence.Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    @jakarta.persistence.Column(name = "telefone", length = 15, nullable = true)
    private String telefone;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
