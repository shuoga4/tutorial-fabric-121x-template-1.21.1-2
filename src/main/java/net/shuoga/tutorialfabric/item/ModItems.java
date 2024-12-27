package net.shuoga.tutorialfabric.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shuoga.tutorialfabric.TutorialFabric121x;

public class ModItems {

    public static  final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialFabric121x.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TutorialFabric121x.LOGGER.info("registering Mod items for " + TutorialFabric121x.MOD_ID);
    }
}
