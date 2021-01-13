package br.com.alura.mvc.mudi.repository;
//Classes repository ficam responsáveis por acessar o banco de dados e fazer consultas

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
