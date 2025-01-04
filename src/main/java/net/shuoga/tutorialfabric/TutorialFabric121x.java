package net.shuoga.tutorialfabric;

import net.fabricmc.api.ModInitializer;

import net.shuoga.tutorialfabric.block.ModBlocks;
import net.shuoga.tutorialfabric.item.ModItemGroups;
import net.shuoga.tutorialfabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialFabric121x implements ModInitializer {
	public static final String MOD_ID = "tutorialfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}

	/*
	add block
	1. ModBlocksで、新しいblock&itemの定義 + クリエメニューにも追加
	2. lang で、名前の追加
	3. blockstatesで、ブロック状態を定義
	4. models/blockで、ドロップ状態を定義?
	5. models/blockで、アイテム状態を定義
	6. textures/blockで、アイテムの画像を定義
	※ shift2回 + "Blocks" とタイプ + 非プロジェクト項目を含める + Block/net.minecraft.block で、すべてのバニラブロックの設定を見られる

	add item
	1. ModItemsで、新しいitemの定義 + クリエメニューにも追加
	2. langで、名前の追加
	3. models/itemで、アイテム状態を定義
	4. textures/itemで、アイテムの画像を追加

	add recipe
	1. data/tutorialfabric/recipeにjsonファイルを作る
	※ 外部ライブラリ/"Gradle: net_fabricmc_yarn"の3つ上にある"net.minecraft:minecraft-merged"で、すべてのレシピが確認可能


	 */
}