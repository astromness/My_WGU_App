package com.example.my_wgu_app.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assessments")
public class Assessment {
    @PrimaryKey
    private String description;
    private int number_of_question;
    private String type;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber_of_question() {
        return number_of_question;
    }

    public void setNumber_of_question(int number_of_question) {
        this.number_of_question = number_of_question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Assessment() {
    }

    public Assessment( String description, int number_of_question, String type) {
        this.description = description;
        this.number_of_question = number_of_question;
        this.type = type;
    }
}
