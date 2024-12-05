package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public record Color(int red, int green, int blue, float alpha) {
    public Color {
    }

    public Color(int red,int green,int blue){
        this(red,green,blue,1);

    }
}
