package douglas.eventodev2024.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "submissao")
public class Submissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tituloSubmissao;
    private int situacaoSubmissao;
    private String abstractArtigo;
    private String arquivo;

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

    public String getAbstractArtigo() {
        return abstractArtigo;
    }

    public void setAbstractArtigo(String abstractArtigo) {
        this.abstractArtigo = abstractArtigo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
