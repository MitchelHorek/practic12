package com.company;

public enum Planet {
    Sun(695000, 1.99e30),
    Mercury(2440, 3.30e23),
    Venus(6052,4.87e24),
    Earth(6378,5.97e24),
    Mars(3397,6.42e23),
    Jupiter(71492,1.90e27),
    Saturn(60268,5.68e26),
    Uranus(25559,8.68e25),
    Neptune(24766,1.02e26),
    Pluto(1150,1.27e22);

    private int radius;
    private double mass;
    Planet(int radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }
    public double getGravitaion(){
        double G = 6.67*Math.pow(10,-11);
        return G*(mass/(radius*radius));
    }


}
