package org.example.hw2_religious_service.model.buddhism;

public enum Language {
    TIBETAN("Тибетский"),
    NEPALI("Непальский"),
    HINDI("Хинди"),
    CHINESE("Китайский"),
    JAPANESE("Японский"),
    KOREAN("Корейский"),
    MONGOLIAN("Монгольский"),
    RUSSIAN("Русский");

    private String translation;

    Language(String translation) {
        this.translation = translation;
    }
}
