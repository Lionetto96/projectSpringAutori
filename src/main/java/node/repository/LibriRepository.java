package node.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import node.entity.LibroEntity;

@Repository
public interface LibriRepository extends JpaRepository<LibroEntity,Long> { 
	
	
}