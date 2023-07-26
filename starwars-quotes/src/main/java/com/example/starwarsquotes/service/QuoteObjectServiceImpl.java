package com.example.starwarsquotes.service;

import com.example.starwarsquotes.repository.QuoteObjectRepository;
import com.example.starwarsquotes.entity.QuoteObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuoteObjectServiceImpl implements QuoteObjectService{
    @Autowired
    QuoteObjectRepository quoteObjectRepository;

    @Override
    public List<QuoteObject> get_By_Actor(String actor){return quoteObjectRepository.findByActor(actor);}

    @Override
    public List<QuoteObject> get_By_Movie(String movie){return quoteObjectRepository.findByMovie(movie);}

    @Override
    public List<QuoteObject> get_By_Trilogy(String trilogy){return quoteObjectRepository.findByTrilogy(trilogy);}

    @Override
    public List<QuoteObject> get_By_Actor_And_Movie(String actor, String movie){return quoteObjectRepository.findByMovieAndActor(movie,actor);}

    @Override
    public List<QuoteObject> get_By_Actor_And_Trilogy(String actor, String trilogy){return quoteObjectRepository.findByTrilogyAndActor(trilogy,actor);}

    @Override
    public List <QuoteObject> get_Random_By_Actor(String actor){return quoteObjectRepository.findByActorOrderByRand(actor);}

    @Override
    public List <QuoteObject> get_Random_By_Movie(String movie){return quoteObjectRepository.findByMovieOrderByRand(movie);}

    @Override
    public List <QuoteObject> get_Random_By_Trilogy(String trilogy){return quoteObjectRepository.findByTrilogyOrderByRand(trilogy);}

    @Override
    public List <QuoteObject> get_Random_By_Actor_And_Movie(String actor, String movie){return quoteObjectRepository.findByMovieAndActorOrderByRand(movie,actor);}

    @Override
    public List <QuoteObject> get_Random_By_Actor_And_Trilogy(String actor, String trilogy){return quoteObjectRepository.findByTrilogyAndActorOrderByRand(trilogy,actor);}


}