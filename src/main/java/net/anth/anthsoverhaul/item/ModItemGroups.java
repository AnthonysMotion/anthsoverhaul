package net.anth.anthsoverhaul.item;

import net.anth.anthsoverhaul.AnthsOverhaul;
import net.anth.anthsoverhaul.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANTHS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AnthsOverhaul.MOD_ID, "anthsoverhaul"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cloth"))
                    .icon(() -> new ItemStack(ModItems.CLOTH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CLOTH);
                        entries.add(ModItems.KATANA);
                        entries.add(ModBlocks.TEST_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        AnthsOverhaul.LOGGER.info("Registering Item Groups for " + AnthsOverhaul.MOD_ID);
    }
}
