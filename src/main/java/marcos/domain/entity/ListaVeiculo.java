package marcos.domain.entity;

import javax.persistence.Column;

public class ListaVeiculo {
        @Column(name = "Diarodizio",length = 100)
        private String marca;
        @Column (name = "modelo",length = 100)
        private String modelo;
        @Column(name = "ano",length = 100)
        private String ano;
}
