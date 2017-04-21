package com.alobot.dummysoapservicewithmvppattern.model.pojos;

public class Annotation {
    private String id;
    private String annotation;

    public Annotation(String id, String annotation) {
        this.id = id;
        this.annotation = annotation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
