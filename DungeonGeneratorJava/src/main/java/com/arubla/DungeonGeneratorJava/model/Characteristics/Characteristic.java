package com.arubla.DungeonGeneratorJava.model.Characteristics;

public abstract class Characteristic {
    private int id;
    private String description;
    private String rarity;

    public Characteristic(int id, String description, String rarity) {
        this.id = id;
        this.description = description;
        this.rarity = rarity;
    }

    public Characteristic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
