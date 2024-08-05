package yuri.dev.sistemaRh.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "vaga")
public class Vaga {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotNull
    private String nome;

    @NotNull
    private String data;

    @NotNull
    private String salario;

    @NotNull
    private String descricao;

    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    private List<Candidato> candidatos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotNull String getNome() {
        return nome;
    }

    public void setNome(@NotNull String nome) {
        this.nome = nome;
    }

    public @NotNull String getData() {
        return data;
    }

    public void setData(@NotNull String data) {
        this.data = data;
    }

    public @NotNull String getSalario() {
        return salario;
    }

    public void setSalario(@NotNull String salario) {
        this.salario = salario;
    }

    public @NotNull String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotNull String descricao) {
        this.descricao = descricao;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
