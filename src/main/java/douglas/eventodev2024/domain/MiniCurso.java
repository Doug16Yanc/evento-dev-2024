package douglas.eventodev2024.domain;

import jakarta.persistence.Entity;

@Entity(name = "minicurso")
public class MiniCurso extends Submissao{
    private String justificativa;
    private String objetivo;
    private int duracao;
    private String publico;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }
}
