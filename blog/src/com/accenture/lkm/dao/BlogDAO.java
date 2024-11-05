package com.accenture.lkm.dao;

import java.util.List;

import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.accenture.lkm.entity.BlogEntity;

public interface BlogDAO extends CrudRepository<BlogEntity,Integer> {
	
	/**
	   To-Do Item 1.1: This method should retrieve a list of blog posts associated with the provided email address, sorted by title.
	    TODO: 
	     - Write a JPQL query and annotate the method with @Query to select blog posts from the BlogEntity table based on the provided email.
	     - Bind the email parameter to the query.
	 */ 
	  @Query(value="select b from BlogEntity b where b.email=?1 order by b.title")
	  public List<BlogEntity> findPostsByEmail(String email);
	
	/**
	   To-Do Item 1.2: This method should retrieve the count of blog posts associated with the provided email address.
       TODO: 
        - Write a JPQL query and annotate the method with @Query to count the number of blog posts from the BlogEntity table based on the provided email.
        - Bind the email parameter to the query.
     */
	@Query(value="select count(b.email) from BlogEntity b where b.email = ?1")
	public long countPostsByEmail(String email);

}
