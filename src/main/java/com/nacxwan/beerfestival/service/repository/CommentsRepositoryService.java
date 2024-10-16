package com.nacxwan.beerfestival.service.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nacxwan.beerfestival.entity.Comment;
import com.nacxwan.beerfestival.model.RatingsAndReview;
import com.nacxwan.beerfestival.repository.CommentsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentsRepositoryService 
{
	private final CommentsRepository commentsRepository;
	
	public Comment save(Comment comment) 
	{
		return commentsRepository.save(comment);
	}
	
	public List<RatingsAndReview> findAllWithBiere()
	{
		return commentsRepository.findAllCommentsWithBiere();
	}

}
