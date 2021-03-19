package net.internalerror.apocalypse.init;

import net.internalerror.apocalypse.Apocalypse;
import net.internalerror.apocalypse.items.ModSpawnEggItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Apocalypse.MOD_ID);

    public static final RegistryObject<ModSpawnEggItem> EVOLVED_ZOMBIE_EGG = ITEMS.register("evolved_zombie_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityType.EVOLVED_ZOMBIE, 0xE1A68B, 0x99593B, new Item.Properties().group(Apocalypse.TAB)));

}
