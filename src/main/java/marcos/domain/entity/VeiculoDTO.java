package marcos.domain.entity;

import org.apache.logging.log4j.util.Strings;

public class VeiculoDTO {
    private String marca;
    private String modelo;
    private String ano;

    public VeiculoDTO(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

}
