package com.berkaydisli.landmarkprojectjava;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String relation;
    int image;

    public Landmark(String name, String relation, int image) {
        this.name = name;
        this.relation = relation;
        this.image = image;
    }
}
