package com.nacxwan.beerfestival.service.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nacxwan.beerfestival.entity.Beer;
import com.nacxwan.beerfestival.repository.BeersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeersRepositoryService 
{
	private final BeersRepository beersRepository;
	
	public List<Beer> findAll() 
	{
		return beersRepository.findAll();
	}
	
	public Beer findByName(String beerName) 
	{
		return beersRepository.findByName(beerName);
	}
	

}
