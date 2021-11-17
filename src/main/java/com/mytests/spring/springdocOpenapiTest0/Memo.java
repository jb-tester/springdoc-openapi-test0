package com.mytests.spring.springdocOpenapiTest0;

public class Memo {
    public Memo() {
    }

    public Memo(String id, String text, String category) {
        this.id = id;
        this.text = text;
        this.category = category;
    }


    private String id;
    private String text;
    private String category;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", category ='" + category + '\'' +
                '}';
    }
}