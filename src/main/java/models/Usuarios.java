package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuarios {
    @Id
    private int id;
    private String nome;
    private String email;
    private String senhas;

    public Usuarios(int id, String nome, String email, String senhas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senhas = senhas;
    }
}
