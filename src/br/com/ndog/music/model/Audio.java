package br.com.ndog.music.model;

public class Audio {

    private String title;
    private int totalPlays;
    private int totalLikes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return 0;
    }

    public void like() {
        totalLikes++;
    }

    public void play() {
        totalPlays++;
    }
}