package net.anth.anthsoverhaul.item;

import net.anth.anthsoverhaul.AnthsOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings()));
    public static final Item KATANA = registerItem("katana", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CLOTH);
        entries.add(KATANA);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnthsOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AnthsOverhaul.LOGGER.info("Registering Mod Items for " + AnthsOverhaul.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToIngredientItemGroup);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientItemGroup);

    }
}
