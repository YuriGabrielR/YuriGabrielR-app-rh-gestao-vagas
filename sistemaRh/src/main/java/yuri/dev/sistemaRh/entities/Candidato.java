package yuri.dev.sistemaRh.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "candidato")
public class Candidato {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true)
    private String rg;

    @NotNull
    private String nomeCandidato;

    @NotNull
    private String email;

    @NotNull
    private String numeroTel;

    @ManyToOne
    private Vaga vaga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public @NotNull String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(@NotNull String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public @NotNull String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    public @NotNull String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(@NotNull String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
}
