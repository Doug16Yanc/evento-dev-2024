package douglas.eventodev2024.domain;

import jakarta.persistence.Entity;

@Entity(name = "palestra")
public class Palestra extends Submissao{
    private String objetivo;
    private String resumo;

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
