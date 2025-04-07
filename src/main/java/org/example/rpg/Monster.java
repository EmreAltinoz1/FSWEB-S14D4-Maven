package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    // Constructor
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    // attack method
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    // Abstract bleed ve poison metotları
    public abstract double bleed();
    public abstract double poison();
}
