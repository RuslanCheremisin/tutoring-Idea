package org.example.hw2_religious_service.model.christianity;

public enum Denomination {
    ORTHODOX("Православие"),
    CATHOLIC("Католицизм"),
    EVANGELIC("Протестанты"),
    COPTIC("Копты");
    private String translation;

    Denomination(String translation) {
        this.translation = translation;
    }
}
