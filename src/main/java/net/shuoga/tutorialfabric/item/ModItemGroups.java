package net.shuoga.tutorialfabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shuoga.tutorialfabric.TutorialFabric121x;
import net.shuoga.tutorialfabric.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialFabric121x.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialfabric.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                    }).build());

    // builder以下、自由度あり、遊び推奨

    public static void registerItemGroups(){
        TutorialFabric121x.LOGGER.info("Registering Item Groups for " + TutorialFabric121x.MOD_ID);
    }
}
