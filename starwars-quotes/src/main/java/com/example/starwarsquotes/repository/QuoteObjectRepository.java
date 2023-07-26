package com.example.starwarsquotes.repository;

import com.example.starwarsquotes.entity.QuoteObject.java;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository

public interface QuoteObjectRepository extends JpaRepository<QuoteObject, String> {
    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor)")
    List<QuoteObject> findByActor(@Param("actor") String actor);
    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Movie=:movie)")
    List<QuoteObject> findByMovie(@Param("movie") String movie);
    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Trilogy=:trilogy)")
    List<QuoteObject> findByTrilogy(@Param("trilogy") String trilogy);

    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor and Trilogy=:trilogy)")
    List<QuoteObject> findByTrilogyAndActor(@Param("trilogy") String trilogy, @Param("actor") String actor);

    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor and Movie=:movie)")
    List<QuoteObject> findByMovieAndActor(@Param("movie") String movie, @Param("actor") String actor);


    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor) ORDER BY RAND() LIMIT 1")
    List<QuoteObject> findByActorOrderByRand(@Param("actor") String actor);
    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Movie=:movie) ORDER BY RAND() LIMIT 1")
    List<QuoteObject> findByMovieOrderByRand(@Param("movie") String movie);
    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Trilogy=:trilogy) ORDER BY RAND() LIMIT 1")
    List<QuoteObject> findByTrilogyOrderByRand(@Param("trilogy") String trilogy);

    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor and Trilogy=:trilogy) ORDER BY RAND() LIMIT 1")
    List<QuoteObject> findByTrilogyAndActorOrderByRand(@Param("trilogy") String trilogy, @Param("actor") String actor);

    @Query(value = "SELECT * FROM PrequelQuotes WHERE (Actor=:actor and Movie=:movie) ORDER BY RAND() LIMIT 1")
    List<QuoteObject> findByMovieAndActorOrderByRand(@Param("movie") String movie, @Param("actor") String actor);

}