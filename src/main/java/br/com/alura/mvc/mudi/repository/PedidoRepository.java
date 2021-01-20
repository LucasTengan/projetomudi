package br.com.alura.mvc.mudi.repository;
//Classes repository ficam responsáveis por acessar o banco de dados e fazer consultas

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.model.User;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	List<Pedido> findByStatus(StatusPedido status);

	@Query(value = "select * from pedidos p inner join users u where p.user_username = :username", nativeQuery = true)
	List<Pedido> findAllByUsuario(@Param("username") String username);

	@Query("select p from Pedido p join p.user u where u.username = :username and p.status = :status")
	List<Pedido> findByStatusEUser(StatusPedido status, String username);
}
