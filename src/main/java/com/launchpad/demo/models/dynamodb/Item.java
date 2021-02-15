package com.launchpad.demo.models.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamoDBDocument
public class Item {

    @DynamoDBAttribute(attributeName = "id")
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "price")
    private Integer price;

    @DynamoDBAttribute(attributeName = "quantity")
    private Integer quantity;

    @DynamoDBAttribute(attributeName = "isBought")
    private Boolean isBought;

    @DynamoDBAttribute(attributeName = "isPromoted")
    private Boolean isPromoted;

    @DynamoDBAttribute(attributeName = "score")
    private Score score;

    @DynamoDBAttribute(attributeName = "size")
    private Amount size;

    @DynamoDBAttribute(attributeName = "itemType")
    private ItemType itemType;
}