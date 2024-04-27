package douglas.eventodev2024.domain;

import jakarta.persistence.Entity;

@Entity(name = "artigo")
public class Artigo extends Submissao{
    private String resumoArtigo;
    private String abstractArtigo;
    private String arquivoArtigo;

    public String getResumoArtigo() {
        return resumoArtigo;
    }

    public void setResumoArtigo(String resumoArtigo) {
        this.resumoArtigo = resumoArtigo;
    }

    public String getAbstractArtigo() {
        return abstractArtigo;
    }

    public void setAbstractArtigo(String abstractArtigo) {
        this.abstractArtigo = abstractArtigo;
    }

    public String getArquivoArtigo() {
        return arquivoArtigo;
    }

    public void setArquivoArtigo(String arquivoArtigo) {
        this.arquivoArtigo = arquivoArtigo;
    }
}
