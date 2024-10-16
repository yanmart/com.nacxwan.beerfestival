package com.nacxwan.beerfestival.service.controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.nacxwan.beerfestival.entity.Beer;
import com.nacxwan.beerfestival.entity.Comment;
import com.nacxwan.beerfestival.model.RatingsAndReview;
import com.nacxwan.beerfestival.service.repository.BeersRepositoryService;
import com.nacxwan.beerfestival.service.repository.CommentsRepositoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class RootControllerService 
{
	private final BeersRepositoryService beersRepositoryService;
	private final CommentsRepositoryService commentsRepositoryService;
	
	public String index() 
	{
		return "index";
	}

	public String beerList(Model model) 
	{
		List<Beer> beers = beersRepositoryService.findAll();
        model.addAttribute("beers", beers);
        
		return "content/beerList";
	}

	public String beerDiscovery() 
	{
		return "beerDiscovery";
	}

	public String ratingsAndReview() 
	{
		return "ratingsAndReview";
	}

	public String recipeSuggestions() 
	{
		return "recipeSuggestions";
	}

	public String dashboard() 
	{
		return "dashboard";
	}

	public String submitRating(String beerName,String comment) 
	{
		String result = "";
		
		Beer beer = beersRepositoryService.findByName(beerName);
		if (beer != null )
		{
			Comment commentEntity = new Comment();
			commentEntity.setBeer(beer);
			commentEntity.setContent(comment);
			
			commentsRepositoryService.save(commentEntity);
			
			
			result = "Commentaire ajouté pour la Bière " + beerName + " : " + comment;
		}
		else 
		{
			result = "Bière non trouvé dans la base de donnée";
		}
		
        return result;
	}

	public String ratingsAndReviewContent(Model model) 
	{
		List<Beer> beers = beersRepositoryService.findAll();
        model.addAttribute("beers", beers);
        
		List<RatingsAndReview> ratingsAndReviewList = commentsRepositoryService.findAllWithBiere();
        model.addAttribute("ratingsAndReviewBeers", ratingsAndReviewList);
        
		return "content/ratingsAndReview-content";
	}
	

}
