package br.com.ndog.music.service;

import br.com.ndog.music.model.Audio;

public class RecommendationService {

    public void evaluate(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(
                    audio.getTitle() + " is considered an absolute hit and a favorite among listeners!"
            );
        } else {
            System.out.println(
                    audio.getTitle() + " is also getting a lot of love from listeners."
            );
        }
    }
}