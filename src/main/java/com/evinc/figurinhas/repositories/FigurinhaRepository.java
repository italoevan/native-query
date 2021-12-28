package com.evinc.figurinhas.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evinc.figurinhas.entities.FigurinhaEntity;

import com.evinc.figurinhas.entities.*;

@Repository
public abstract interface FigurinhaRepository extends CrudRepository<FigurinhaEntity, Integer> {
	
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO FIGURINHA (description, image) values (?1 , ?2 )", nativeQuery = true)
	public void newFigurinha(@Param("description") String description,@Param("image") String image);

}
