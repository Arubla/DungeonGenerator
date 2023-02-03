package com.arubla.DungeonGeneratorJava.model;

public class Npc {
    private int npcId;
    private int userId;
    private String name;
    private int appearance;
    private int highAbility;
    private int lowAbility;
    private int talents;
    private int mannerisms;
    private int interactionTraits;
    private int ideals;
    private int bonds;
    private int flaws;

    public Npc(int npcId, int userId, String name, int appearance, int highAbility, int lowAbility, int talents, int mannerisms, int interactionTraits, int ideals, int bonds, int flaws) {
        this.npcId = npcId;
        this.userId = userId;
        this.name = name;
        this.appearance = appearance;
        this.highAbility = highAbility;
        this.lowAbility = lowAbility;
        this.talents = talents;
        this.mannerisms = mannerisms;
        this.interactionTraits = interactionTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    public Npc() {}

    public int getNpcId() {
        return npcId;
    }

    public void setNpcId(int npcId) {
        this.npcId = npcId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    public int getHighAbility() {
        return highAbility;
    }

    public void setHighAbility(int highAbility) {
        this.highAbility = highAbility;
    }

    public int getLowAbility() {
        return lowAbility;
    }

    public void setLowAbility(int lowAbility) {
        this.lowAbility = lowAbility;
    }

    public int getTalents() {
        return talents;
    }

    public void setTalents(int talents) {
        this.talents = talents;
    }

    public int getMannerisms() {
        return mannerisms;
    }

    public void setMannerisms(int mannerisms) {
        this.mannerisms = mannerisms;
    }

    public int getInteractionTraits() {
        return interactionTraits;
    }

    public void setInteractionTraits(int interactionTraits) {
        this.interactionTraits = interactionTraits;
    }

    public int getIdeals() {
        return ideals;
    }

    public void setIdeals(int ideals) {
        this.ideals = ideals;
    }

    public int getBonds() {
        return bonds;
    }

    public void setBonds(int bonds) {
        this.bonds = bonds;
    }

    public int getFlaws() {
        return flaws;
    }

    public void setFlaws(int flaws) {
        this.flaws = flaws;
    }
}
