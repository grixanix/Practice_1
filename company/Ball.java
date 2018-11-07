package com.company;

public class Ball
{
    double Radius;
    String Color;
    String Material;

    public String toString()
    {
        return Radius + Color + Material;
    }

    public Ball (double Radius, String Color, String Material)
    {
        this.Radius = Radius;
        this.Color = Color;
        this.Material = Material;
    }
}