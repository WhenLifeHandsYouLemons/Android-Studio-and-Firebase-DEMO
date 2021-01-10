package com.example.demo;

public class Yarn {
    private String thickness;
    private String colour;
    private String length;

    public Yarn(String thickness, String colour, String length) {
        this.thickness = thickness;
        this.colour = colour;
        this.length = length;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
