package com.music;
public class Music {
    private String name;
    private String movie;
    private String artist;
    private String language;
    private int year;
    
    Music(){

    }
    //Constructor with parameters
    public Music(String name, String movie, String artist, String language, int year) {
        this.name = name;
        this.movie = movie;
        this.artist = artist;
        this.language = language;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMovie() {
        return movie;
    }
    public void setMovie(String movie) {
        this.movie = movie;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Music [name=" + name + ", movie=" + movie + ", artist=" + artist + ", language=" + language + ", year="
                + year + "]";
    }

      
    
}
