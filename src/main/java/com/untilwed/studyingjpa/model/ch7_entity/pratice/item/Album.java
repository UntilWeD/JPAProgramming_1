package com.untilwed.studyingjpa.model.ch7_entity.pratice.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends ItemP7{

    private String artist;
    private String etc;

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", etc='" + etc + '\'' +
                '}';
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
