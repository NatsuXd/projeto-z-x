package marcos.domain.repository;

import marcos.domain.entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class VeiculoRepository {
    private static String INSERT ="insert into veiculo (veiculo) values (?)";
   @Autowired
private JdbcTemplate jdbcTemplate;
   @Autowired
   private EntityManager entityManager;
   @Transactional
   public Veiculo salvar(Veiculo veiculo) {
       entityManager.persist(veiculo);
        return veiculo;
   }
}