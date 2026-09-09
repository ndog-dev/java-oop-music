package br.com.ndog.music;

import br.com.ndog.music.model.Podcast;
import br.com.ndog.music.model.Song;
import br.com.ndog.music.service.RecommendationService;

public class Main {

    public static void main(String[] args) {

        Song song = new Song();
        song.setTitle("Forever");
        song.setArtist("Kiss");

        for (int i = 0; i < 1000; i++) {
            song.play();
        }

        for (int i = 0; i < 5; i++) {
            song.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Bolha Dev");
        podcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        RecommendationService recommendationService = new RecommendationService();

        recommendationService.evaluate(podcast);
        recommendationService.evaluate(song);
    }
}