package br.com.mapas.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mapas.models.Trecho;

@Repository("trechoRepository")
public interface TrechoRepository extends JpaRepository<Trecho, Long> {

}
