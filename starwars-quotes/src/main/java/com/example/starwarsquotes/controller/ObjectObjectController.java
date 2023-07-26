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