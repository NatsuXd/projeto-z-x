package marcos.service;

import marcos.domain.entity.Veiculo;
import marcos.domain.entity.VeiculoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public  class VeiculoService {

    private static final String URI = "https://parallelum.com.br/fipe/api/v1";

    public VeiculoDTO chamarApiExterna(Veiculo form) {
        RestTemplate rest = new RestTemplate();
        VeiculoDTO veiculo
                = rest.getForEntity(URI, VeiculoDTO.class);
        return veiculo;
    }
}