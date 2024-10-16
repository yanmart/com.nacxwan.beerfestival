package com.nacxwan.beerfestival.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="beers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    private String name;
    private String type;
    private String origine;
    private String gout;
}
