package com.example.starwarsquotes.controller;
import com.example.starwarsquotes.entity.QuoteObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.starwarsquotes.service.*;

@RestController
@CrossOrigin()
@RequestMapping("")

public class QuoteObjectController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    QuoteObjectService quoteObjectService;

    @GetMapping("/actor/{actor}")
    public ResponseEntity <List<QuoteObject>> getByActor(@PathVariable("actor") String actor){
        try{
            logger.info("Invoking getByActor in QuoteObjectController.java for " + actor);
            return ResponseEntity.ok(quoteObjectService.get_By_Actor(actor));
        } catch(Exception e) {
            logger.error("exception in getByActor: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }

    @GetMapping("/movie/{movie}")
    public ResponseEntity <List<QuoteObject>> getByMovie(@PathVariable("movie") String movie){
        try{
            logger.info("Invoking getByMovie in QuoteObjectController.java for " + movie);
            return ResponseEntity.ok(quoteObjectService.get_By_Movie(movie));
        } catch(Exception e) {
            logger.error("exception in getByMovie: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }
    @GetMapping("/trilogy/{trilogy}")
    public ResponseEntity <List<QuoteObject>> getByTrilogy(@PathVariable("trilogy") String trilogy){
        try{
            logger.info("Invoking getByTrilogy in QuoteObjectController.java for " + trilogy);
            return ResponseEntity.ok(quoteObjectService.get_By_Trilogy(trilogy));
        } catch(Exception e) {
            logger.error("exception in getByTrilogy: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }
    @GetMapping("/actorAndMovie/{actor}/{movie}")
    public ResponseEntity <List<QuoteObject>> getByActorAndMovie(@PathVariable("actor") String actor, @PathVariable("movie") String movie){
        try{
            logger.info("Invoking getByActorAndMovie in QuoteObjectController.java for actor: " + actor + " movie:" + movie);
            return ResponseEntity.ok(quoteObjectService.get_By_Actor_And_Movie(actor,movie));
        } catch(Exception e) {
            logger.error("exception in getByActorAndMovie: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }
    @GetMapping("/actorAndTrilogy/{actor}/{trilogy}")
    public ResponseEntity <List<QuoteObject>> getByActorAndTrilogy(@PathVariable("actor") String actor, @PathVariable("trilogy") String trilogy){
        try{
            logger.info("Invoking getByActorAndTrilogy in QuoteObjectController.java for actor: " + actor + " trilogy:" + trilogy);
            return ResponseEntity.ok(quoteObjectService.get_By_Actor_And_Trilogy(actor,trilogy));
        } catch(Exception e) {
            logger.error("exception in getByActorAndTrilogy: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }

    @GetMapping("/actor/random/{actor}")
    public ResponseEntity <List<QuoteObject>> getRandomByActor(@PathVariable("actor") String actor){
        try{
            logger.info("Invoking getRandomByActor in QuoteObjectController.java for actor: " + actor);
            return ResponseEntity.ok(quoteObjectService.get_Random_By_Actor(actor));
        } catch(Exception e) {
            logger.error("exception in getRandomByActor: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }

    @GetMapping("/movie/random/{movie}")
    public ResponseEntity <List<QuoteObject>> getRandomByMovie(@PathVariable("movie") String movie){
        try{
            logger.info("Invoking getRandomByMovie in QuoteObjectController.java for movie: " + movie);
            return ResponseEntity.ok(quoteObjectService.get_Random_By_Movie(movie));
        } catch(Exception e) {
            logger.error("exception in getRandomByMovie: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }
    @GetMapping("/trilogy/random/{trilogy}")
    public ResponseEntity <List<QuoteObject>> getRandomByTrilogy(@PathVariable("trilogy") String trilogy){
        try{
            logger.info("Invoking getRandomByTrilogy in QuoteObjectController.java for trilogy: " + trilogy);
            return ResponseEntity.ok(quoteObjectService.get_Random_By_Trilogy(trilogy));
        } catch(Exception e) {
            logger.error("exception in getRandomByTrilogy: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }

    @GetMapping("/actorAndMovie/random/{actor}/{movie}")
    public ResponseEntity <List<QuoteObject>> getRandomByActorAndMovie(@PathVariable("actor") String actor, @PathVariable("movie") String movie){
        try{
            logger.info("Invoking getRandomByActorAndMovie in QuoteObjectController.java for actor: " + actor + " movie: " + movie);
            return ResponseEntity.ok(quoteObjectService.get_Random_By_Actor_And_Movie(actor,movie));
        } catch(Exception e) {
            logger.error("exception in getRandomByActorAndMovie: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }
    @GetMapping("/actorAndTrilogy/random/{actor}/{trilogy}")
    public ResponseEntity <List<QuoteObject>> getRandomByActorAndTrilogy(@PathVariable("actor") String actor, @PathVariable("trilogy") String trilogy){
        try{
            logger.info("Invoking getRandomByActorAndTrilogy in QuoteObjectController.java for actor: " + actor + " trilogy: " + trilogy);
            return ResponseEntity.ok(quoteObjectService.get_By_Actor_And_Trilogy(actor,trilogy));
        } catch(Exception e) {
            logger.error("exception in getRandomByActorAndTrilogy: " + e.getMessage());
            return ResponseEntity.status(404).build();

        }
    }

}