package com.nacxwan.beerfestival.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nacxwan.beerfestival.entity.Beer;

@Repository
public interface BeersRepository extends JpaRepository<Beer,Integer>
{
	public Beer findByName(String name);
}
