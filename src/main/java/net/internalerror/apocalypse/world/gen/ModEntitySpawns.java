package net.internalerror.apocalypse.world.gen;

import net.internalerror.apocalypse.Apocalypse;
import net.internalerror.apocalypse.init.ModEntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Apocalypse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            // Nether Mobs
            if (biome.getCategory() == Biome.Category.NETHER) { }

            // End Mobs
            else if (biome.getCategory() == Biome.Category.THEEND) { }

            // Overworld Mobs
            else {
                /*
                new Biome
                biome.
                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(ModEntityType.EVOLVED_ZOMBIE.get(), 15, 2, 9));

                 */
            }
        }
    }
}
