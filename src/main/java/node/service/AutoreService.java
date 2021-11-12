package node.service;

import java.util.List;

//import node.entity.AutoreEntity;
import node.model.AutoreDto;

public interface AutoreService {
	
	public List<AutoreDto> getAllAutori();

	void saveAutore(AutoreDto autore);
	
	//public AutoreEntity saveAutore();
}
