package net.internalerror.apocalypse.init;

import net.internalerror.apocalypse.Apocalypse;
import net.internalerror.apocalypse.entities.EvolvedZombieEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Apocalypse.MOD_ID);

    public static final RegistryObject<EntityType<EvolvedZombieEntity>> EVOLVED_ZOMBIE = ENTITY_TYPES.register("evolved_zombie",
            () -> EntityType.Builder.<EvolvedZombieEntity>create(EvolvedZombieEntity::new, EntityClassification.MONSTER)
                    .size(1.0f, 1.0f)
                    .build(new ResourceLocation(Apocalypse.MOD_ID, "evolved_zombie").toString()));
}
