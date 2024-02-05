package com.alllexe.springbootmongodb.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "justiceLeagueMembers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    private ObjectId id;
    @Indexed
    private String name;
    private String superPower;
    private String location;

    public void setId(String id) {
        this.id = new ObjectId(id);
    }
}
