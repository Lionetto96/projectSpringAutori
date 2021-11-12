package node.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.AutoreEntity;
import node.entity.LibroEntity;
import node.model.AutoreDto;
import node.model.LibroDto;
import node.repository.LibriRepository;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	public LibriRepository libriRepository;
	
	public List<LibroDto> getAllLibri() {
		
		// JEE STYLE CON HIBERNATE E NAMEDQUERY
		//em.createNamedQuery(Padrone.NAMED_QUERY_ALL, Padrone.class)
		//.getResultList();
		
		// SPRING REPOSITORY
		List<LibroEntity> listLibroEntity = libriRepository.findAll();
		return listLibroEntity.stream()
				.map(entity -> {
					LibroDto dto = new LibroDto();
					dto.setId(entity.getId());
					dto.setTitolo(entity.getTitolo());
					dto.setPagine(entity.getPagine());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
	public void saveRuolo(LibroEntity libro) {
		libriRepository.save(libro);
	}
	
}
