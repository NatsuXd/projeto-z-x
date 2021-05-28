package marcos.controller;

import marcos.domain.entity.Veiculo;
import marcos.domain.entity.VeiculoDTO;
import marcos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public Veiculo veiculo(Veiculo form) {
        VeiculoDTO veiculo = service.chamarApiExterna(form);
        return Veiculo.ok(veiculo);
    }
}