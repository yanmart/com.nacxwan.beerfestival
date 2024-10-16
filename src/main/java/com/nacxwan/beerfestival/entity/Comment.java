package com.nacxwan.beerfestival.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "beer_id", nullable = false)
    private Beer beer;
	
	@Column(nullable = false)
    private String content;

}
