package com.jakala.dao;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jakala.model.Contract;

public interface ContractRespository extends JpaRepository<Contract,Integer>
{
	/*
   @Query("from Alien where Customername=?1")
	Optional<Alien> findByName(String name);
@Query("from Alien where typeofcontract=?1")
	Optional<Alien> findByName(String typeofcontact);*/
	
	//List<Alien> findByCustomername(String Customername);
	
}