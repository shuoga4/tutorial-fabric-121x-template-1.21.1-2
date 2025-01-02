package net.shuoga.tutorialfabric.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.shuoga.tutorialfabric.TutorialFabric121x;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings
            .create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            // shift2回 + "Blocks" とタイプ + 非プロジェクト項目を含める + Block/net.minecraft.block で、すべてのバニラブロックの設定を見られる
    ));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialFabric121x.MOD_ID, name), block);

    }

    // ブロックをアイテムとして登録して、さらにブロックとしても登録する
    // このメソッドはアイテム登録用
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialFabric121x.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialFabric121x.LOGGER.info("Registering Mod Blocks for " + TutorialFabric121x.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
        });
    }
}
