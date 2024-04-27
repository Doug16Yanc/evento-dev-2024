package douglas.eventodev2024.domain;

import jakarta.persistence.*;

@Entity(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Submissao submissao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Submissao getSubmissao() {
        return submissao;
    }

    public void setSubmissao(Submissao submissao) {
        this.submissao = submissao;
    }
}
