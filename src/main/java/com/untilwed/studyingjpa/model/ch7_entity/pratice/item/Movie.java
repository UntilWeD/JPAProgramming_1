package com.untilwed.studyingjpa.model.ch7_entity.pratice.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Movie extends ItemP7{

    private String director;
    private String actor;

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
