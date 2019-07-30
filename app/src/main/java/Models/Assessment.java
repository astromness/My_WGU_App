package Models;

import Utilities.Assessment_Status;
import Utilities.Assessment_Type;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assessments")
public class Assessment {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private Assessment_Status status;
    private int number_of_question;
    private Assessment_Type type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Assessment_Status getStatus() {
        return status;
    }

    public void setStatus(Assessment_Status status) {
        this.status = status;
    }

    public int getNumber_of_question() {
        return number_of_question;
    }

    public void setNumber_of_question(int number_of_question) {
        this.number_of_question = number_of_question;
    }

    public Assessment_Type getType() {
        return type;
    }

    public void setType(Assessment_Type type) {
        this.type = type;
    }

    public Assessment() {
    }

    public Assessment(int id, Assessment_Status status, int number_of_question, Assessment_Type type) {
        this.id = id;
        this.status = status;
        this.number_of_question = number_of_question;
        this.type = type;
    }
}
