package edu.farmingdale.csc311.clubdirectory.club;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // name at most 60 characters, cannot be blank
    @NotBlank(message = "name is required")
    @Size(max = 60)
    private String name;

    // category of the club (e.g., academic, sports, cultural) at most 30 char, not blank
    @NotBlank(message = "category is required")
    @Size(max = 30)
    private String category;

    // meetingDay of the club (e.g., Monday, Tuesday) at most 20 char, not blank
    @NotBlank(message = "meeting day is required")
    @Size(max = 20)
    private String meetingDay;

    // room of the club (e.g., Room 101, Gymnasium) at most 40 char
    @Size(max = 40)
    private String room;

    // A protected constructor with no parameters and a public constructor that takes name, category, meetingDay, and room
    protected Club() {
    }

    public Club(String name, String category, String meetingDay, String room) {
        this.name = name;
        this.category = category;
        this.meetingDay = meetingDay;
        this.room = room;
    }

    // A getter and setter for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMeetingDay() {
        return meetingDay;
    }

    public void setMeetingDay(String meetingDay) {
        this.meetingDay = meetingDay;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
