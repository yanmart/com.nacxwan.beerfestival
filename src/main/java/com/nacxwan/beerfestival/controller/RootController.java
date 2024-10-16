package com.nacxwan.beerfestival.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nacxwan.beerfestival.service.controller.RootControllerService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class RootController 
{
	private final RootControllerService rootControllerService;
	
	@GetMapping
	public String index()
	{
		return rootControllerService.index();
	}
	
	@GetMapping("/beerDiscovery")
	public String beerDiscovery()
	{
		return rootControllerService.beerDiscovery();
	}
	
	@GetMapping("/ratingsAndReview")
	public String ratingsAndReview()
	{
		return rootControllerService.ratingsAndReview();
	}
	
	@GetMapping("/recipeSuggestions")
	public String recipeSuggestions()
	{
		return rootControllerService.recipeSuggestions();
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return rootControllerService.dashboard();
	}
	
	
	@GetMapping("/beerList")
	public String beerList(Model model)
	{
		return rootControllerService.beerList(model);
	}
	
	@GetMapping("/ratingsAndReview-content")
	public String ratingsAndReviewContent(Model model)
	{
		return rootControllerService.ratingsAndReviewContent(model);
	}
	
	@PostMapping("/submitRating")
	@ResponseBody
	public String submitRating(@RequestParam String beerName,
            @RequestParam String comment)
	{
		return rootControllerService.submitRating(beerName , comment );
	}
}
