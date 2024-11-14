package org.example;

public enum Weapon {
    SWORD(20, 1.2),
    AXE(30, 0.8),
    BOW(15, 1.5),
    DAGGER(12, 2.0),
    STAF(15, 1.5);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}