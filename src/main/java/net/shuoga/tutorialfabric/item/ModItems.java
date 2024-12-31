package net.shuoga.tutorialfabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shuoga.tutorialfabric.TutorialFabric121x;

public class ModItems {

    // この一文で、アイテムがゲームに追加される。ただし、名前以外虚無
    // ここの名前が、 langディレクトリでの名前指定になって、lang内で、ゲーム内名前を決める
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    // メソッド抽出
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialFabric121x.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // 初期化時に実行される
        TutorialFabric121x.LOGGER.info("registering Mod items for " + TutorialFabric121x.MOD_ID);

        //クリエメニューの素材タブに追加
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}
