package com.example.starwarsquotes.entity;

import javax.persistence.*;
import com.amazonaws.*;
import lombok.*;
import com.amazonaws.services.dynamodbv2.datamodeling.*
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@DynamoDBTable(name= "PrequelQuotes")
public class QuoteObject {
    @DynamoDBHashKey(attributeName = "ID")
    private String ID;
    @DynamoDBAttribute
    private String Movie;
    @DynamoDBAttribute
    private String Actor;
    @DynamoDBAttribute
    private String Quote;
    @DynamoDBAttribute
    private String Trilogy;
}