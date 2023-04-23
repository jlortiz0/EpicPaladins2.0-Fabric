package net.veroxuniverse.arclight.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;

public class EntityTypes {
    public static final EntityType<AngelEntity> ANGEL = Registry.register(Registry.ENTITY_TYPE, new Identifier(ArclightMod.MODID, "angel"),
                    FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AngelEntity::new).dimensions(EntityDimensions.fixed(1.0f, 2.0f)).build()
            );


}