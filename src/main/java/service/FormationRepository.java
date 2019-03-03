package service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.Formation;
    
@Repository
@Transactional(readOnly = true)
public interface FormationRepository extends JpaRepository<Formation, String>{
	
	List<Formation> findByNomFormation(String nomFormation);
	
	Formation findByCodeFormation(String codeFormation);
	
	@Modifying
    @Transactional
    @Query("delete from Formation f where f.codeFormation = ?1")
    void deleteByCodeFormation(String codeFormation);
	
	@Modifying
    @Transactional
	@Query("DELETE from Formation")
    void deleteAll();
	


	
	

	




	
}






