package com.jakala.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jakala.dao.ContractRespository;
import com.jakala.model.Contract;

@RestController

public class ContractController {
	@Autowired //Implicity inject object dependency
	ContractRespository repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
		
	}
    
	@PostMapping(path="/contract",consumes= {"application/json"})//I am setting it to strictly JSON formst
	public String addContract(@RequestBody Contract contract)
	{
		repo.save(contract);
		return "Data Created";
	
	}
	//Deletes the data with the paticular id
	@DeleteMapping("/contract/{customerid}")
	public String deleteContract(@PathVariable int customerid)
	{
		Contract a=repo.getOne(customerid);
		repo.delete(a);
		return "deleted";
		
	}
	// Localhost:8080/contracts retrives all customerdetails we can test in postman or browser
	@GetMapping("/contracts")
	
	public List<Contract> getAliens()
	{
		
	return repo.findAll();
	}
	//Localhost:8080/contract  To update the contract or to insert  contract
	@PutMapping("/contract")
	public String saveorUpdateAlien(@RequestBody Contract alien)
	{
		repo.save(alien);
		return "UPDATED";
	}
//findby customer id Localhost;8080/contract/101
	@RequestMapping("/contract/{customerid}")
	
	  public Optional<Contract> getContract(@PathVariable int customerid )
		{
		 	
		return repo.findById(customerid);
		}

//Findby typeofcontract
/*
@RequestMapping("/contract/{typeofcontract}")
	
	  public Optional<Contract> findByName(@PathVariable String typeofcontract)
		{
		 		
	
  return repo.findByName(typeofcontract);
	
		
		}*/
	
		
	}
	
	


	
	

 
 
  


