package com.arubla.DungeonGeneratorJava.dao;

import com.arubla.DungeonGeneratorJava.model.Characteristics.Characteristic;

import java.util.List;

public interface CharacteristicDao {

    List<Characteristic> getAllAppearances();
    List<Characteristic> getAllBonds();
    List<Characteristic> getAllFlaws();
    List<Characteristic> getAllHighAbilities();
    List<Characteristic> getAllIdeals();
    List<Characteristic> getAllInteractionTraits();
    List<Characteristic> getAllLowAbilities();
    List<Characteristic> getAllMannerisms();
    List<Characteristic> getAllTalents();

    boolean createAppearance();
    boolean createBond();
    boolean createFlaw();
    boolean createHighAbility();
    boolean createIdeal();
    boolean createInteractionTrait();
    boolean createLowAbility();
    boolean createMannerism();
    boolean createTalent();

    boolean deleteAppearance(int id);
    boolean deleteBond(int id);
    boolean deleteFlaw(int id);
    boolean deleteHighAbility(int id);
    boolean deleteIdeal(int id);
    boolean deleteInteractionTrait(int id);
    boolean deleteLowAbility(int id);
    boolean deleteMannerism(int id);
    boolean deleteTalent(int id);


}
