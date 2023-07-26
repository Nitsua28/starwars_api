package com.example.starwarsquotes.service;
import java.util.List;
import com.example.starwarsquotes.entity.QuoteObject;

public interface QuoteObjectService {
    List <QuoteObject> get_By_Actor(String actor);
    List <QuoteObject> get_By_Movie(String movie);
    List <QuoteObject> get_By_Trilogy(String trilogy);
    List <QuoteObject> get_By_Actor_And_Movie(String actor, String movie);
    List <QuoteObject> get_By_Actor_And_Trilogy(String actor, String trilogy);
    List <QuoteObject> get_Random_By_Actor(String actor);
    List <QuoteObject> get_Random_By_Movie(String movie);
    List <QuoteObject> get_Random_By_Trilogy(String trilogy);
    List <QuoteObject> get_Random_By_Actor_And_Movie(String actor, String movie);
    List <QuoteObject> get_Random_By_Actor_And_Trilogy(String actor, String trilogy);

}