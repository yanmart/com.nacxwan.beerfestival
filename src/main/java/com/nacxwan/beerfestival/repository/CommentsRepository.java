package com.nacxwan.beerfestival.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nacxwan.beerfestival.entity.Comment;
import com.nacxwan.beerfestival.model.RatingsAndReview;

@Repository
public interface CommentsRepository extends JpaRepository<Comment,Integer>
{
	@Query("SELECT b.name as beerName , b.type as beerType , c.content as beerComment FROM Comment c join c.beer b")
    List<RatingsAndReview> findAllCommentsWithBiere();
}
