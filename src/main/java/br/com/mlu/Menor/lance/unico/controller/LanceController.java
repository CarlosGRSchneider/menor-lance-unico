package br.com.mlu.Menor.lance.unico.controller;

import br.com.mlu.Menor.lance.unico.entidade.Lance;
import br.com.mlu.Menor.lance.unico.repositorio.LanceRepository;
import br.com.mlu.Menor.lance.unico.request.LanceRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lances")
public class LanceController {

    @Autowired
    private LanceRepository lanceRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionaLance(@RequestBody @Valid LanceRequest request) {

        Lance lance = request.toModel();
        lanceRepository.save(lance);

    }

    @GetMapping
    public List<Lance> consultaLances() {

        List<Lance> lances = lanceRepository.findAll();
        return lances;
    }
}
