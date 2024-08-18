package springjava.example.sprinboot;

import org.springframework.data.jpa.repository.JpaRepository;

import springjava.example.sprinboot.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
