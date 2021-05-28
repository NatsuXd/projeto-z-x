package marcos.domain.entity;

import javax.persistence.*;


public class Veiculo {
        @Column(name = "marcas",length = 100)
        private String marcas;
        @Column (name = "modelo",length = 100)
        private String modelos;
        @Column(name = "ano",length = 100)
        private String anos;

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marca) {
        this.marcas = marcas;
    }

    public String getModelos() {
            return modelos;
        }

        public void setModelos(String modelo) {
            this.modelos = modelos;
        }

        public String getAnos() {
            return anos;
        }

        public void setAnos(String anos) {
            this.anos = anos;
        }
}
//@GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name ="nome",length = 100, unique = true)
//    private String nome;
//    @Column(name = "codigo",length = 100)
//    private String codigo;

