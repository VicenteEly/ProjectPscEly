package models;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
@Entity
@Table(name = "tarefa")
public class Tarefa {
    @Id
    private int id;
    private String nome;
    private String descricao;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataFim;
    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;
    @ManyToOne
    @JoinColumn(name = "id_respondavel")
    private Usuarios respondavel;
    public Tarefa(int id, String nome, String descricao, String prioridade, LocalDate dataVencimento, String status, LocalDate dataFim, Projeto projeto, Usuarios respondavel) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataFim = dataFim;
        this.projeto = projeto;
        this.respondavel = respondavel;
    }
}
