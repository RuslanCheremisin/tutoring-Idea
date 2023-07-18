package org.example.hw2_religious_service;

public enum Religion {
    CHRISTIANITY("Христианство"),
    ISLAM("Ислам"),
    BUDDHISM("Буддизм");

    private String translation;
    Religion(String translation){
        this.translation = translation;
    }
}
