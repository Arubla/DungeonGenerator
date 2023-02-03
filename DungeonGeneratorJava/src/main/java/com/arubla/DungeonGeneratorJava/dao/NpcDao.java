package com.arubla.DungeonGeneratorJava.dao;

import com.arubla.DungeonGeneratorJava.model.Npc;

import java.util.List;

public interface NpcDao {

    List<Npc> getNpcsByUserId(int userId);

    Npc getNpcById(int npcId);

    Npc findNpcByName(String name);

    boolean createNpc(int npcId, int userId, String name, int appearance, int highAbility, int lowAbility, int talents, int mannerisms, int interactionTraits, int ideals, int bonds, int flaws);

    Npc updateNpc(int npcId, Npc npc);

}
