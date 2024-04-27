package douglas.eventodev2024.controllers;

import douglas.eventodev2024.domain.Submissao;
import douglas.eventodev2024.repositories.SubmissaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubmissaoResource {
    @Autowired
    SubmissaoRepository submissaoRepository;

    @GetMapping("/submissao{id}")
    public List<Submissao> listaSubmissoes(){
        return submissaoRepository.findAll();
    }
    @PostMapping("/submissao")
    public Submissao salvaSubmissao(@RequestBody @Valid Submissao submissao){
        return submissaoRepository.save(submissao);
    }
    @DeleteMapping("/submissao")
    public void deletaSubmisao(@RequestBody @Valid Submissao submissao){
        submissaoRepository.delete(submissao);
    }
    @PutMapping("/submissao")
    public Submissao atualizaSubmissao(@RequestBody @Valid Submissao submissao){
        return submissaoRepository.save(submissao);
    }
}
