package douglas.eventodev2024.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Submissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tituloSubmissao;
    private int situacaoSubmissao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloSubmissao() {
        return tituloSubmissao;
    }

    public void setTituloSubmissao(String tituloSubmissao) {
        this.tituloSubmissao = tituloSubmissao;
    }

    public int getSituacaoSubmissao() {
        return situacaoSubmissao;
    }

    public void setSituacaoSubmissao(int situacaoSubmissao) {
        this.situacaoSubmissao = situacaoSubmissao;
    }
}
