package node.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import node.entity.AutoreEntity;

@Repository
public interface AutoriRepository extends JpaRepository<AutoreEntity,Long> { 
	
	
}