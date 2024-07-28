package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TIED_STICKS = registerItem("tied_sticks", new Item(new FabricItemSettings()));
    public static final Item TIED_BONES = registerItem("tied_bones", new Item(new FabricItemSettings()));
    public static final Item TIED_BLAZE_RODS = registerItem("tied_blaze_rods", new Item(new FabricItemSettings()));
    public static final Item TIED_KELP = registerItem("tied_kelp", new Item(new FabricItemSettings()));
    public static final Item TIED_NAME_TAGS = registerItem("tied_name_tags", new Item(new FabricItemSettings()));
    public static final Item TIED_ROTTEN_FLESH = registerItem("tied_rotten_flesh", new Item(new FabricItemSettings()));
    public static final Item TIED_SUGAR_CANE= registerItem("tied_sugar_cane", new Item(new FabricItemSettings()));
    public static final Item TIED_LEATHER= registerItem("tied_leather", new Item(new FabricItemSettings()));
    public static final Item STACK_OF_PAPERS= registerItem("stack_of_papers", new Item(new FabricItemSettings()));
    public static final Item BALL_OF_STRINGS= registerItem("ball_of_strings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_FEATHERS = registerItem("bag_of_feathers", new Item(new FabricItemSettings()));
    public static final Item PACKED_EGGS = registerItem("packed_eggs", new Item(new FabricItemSettings()));
    public static final Item PACKED_GOLDEN_CARROTS = registerItem("packed_golden_carrots", new Item(new FabricItemSettings()));
    public static final Item PACKED_CARROTS = registerItem("packed_carrots", new Item(new FabricItemSettings()));
    public static final Item PACKED_POTATOES = registerItem("packed_potatoes", new Item(new FabricItemSettings()));
    public static final Item PACKED_ENDER_PEARLS = registerItem("packed_ender_pearls", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_GUNPOWDER = registerItem("bag_of_gunpowder", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_FLINT = registerItem("bag_of_flint", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_NETHER_WARTS = registerItem("bag_of_nether_warts", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_OAK_SAPLINGS = registerItem("bag_of_oak_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_MANGROVE_PROPAGULES = registerItem("bag_of_mangrove_propagules", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_SPRUCE_SAPLINGS = registerItem("bag_of_spruce_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_JUNGLE_SAPLINGS = registerItem("bag_of_jungle_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_DARK_OAK_SAPLINGS = registerItem("bag_of_dark_oak_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_BIRCH_SAPLINGS = registerItem("bag_of_birch_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_CHERRY_SAPLINGS = registerItem("bag_of_cherry_saplings", new Item(new FabricItemSettings()));
    public static final Item BAG_OF_ACACIA_SAPLINGS = registerItem("bag_of_acacia_saplings", new Item(new FabricItemSettings()));
    public static final Item TIED_CANDLES = registerItem("tied_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_BLACK_CANDLES = registerItem("tied_black_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_BLUE_CANDLES = registerItem("tied_blue_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_BROWN_CANDLES = registerItem("tied_brown_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_CYAN_CANDLES = registerItem("tied_cyan_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_GRAY_CANDLES = registerItem("tied_gray_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_GREEN_CANDLES = registerItem("tied_green_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_LIGHT_BLUE_CANDLES = registerItem("tied_light_blue_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_LIGHT_GRAY_CANDLES = registerItem("tied_light_gray_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_LIME_CANDLES = registerItem("tied_lime_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_MAGENTA_CANDLES = registerItem("tied_magenta_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_ORANGE_CANDLES = registerItem("tied_orange_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_PINK_CANDLES = registerItem("tied_pink_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_PURPLE_CANDLES = registerItem("tied_purple_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_RED_CANDLES = registerItem("tied_red_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_WHITE_CANDLES = registerItem("tied_white_candles", new Item(new FabricItemSettings()));
    public static final Item TIED_YELLOW_CANDLES = registerItem("tied_yellow_candles", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(TIED_STICKS);
        entries.add(TIED_BONES);
        entries.add(TIED_BLAZE_RODS);
        entries.add(TIED_KELP);
        entries.add(TIED_NAME_TAGS);
        entries.add(TIED_ROTTEN_FLESH);
        entries.add(TIED_SUGAR_CANE);
        entries.add(TIED_LEATHER);
        entries.add(STACK_OF_PAPERS);
        entries.add(BALL_OF_STRINGS);
        entries.add(BAG_OF_FEATHERS);
        entries.add(PACKED_EGGS);
        entries.add(PACKED_GOLDEN_CARROTS);
        entries.add(PACKED_CARROTS);
        entries.add(PACKED_POTATOES);
        entries.add(BAG_OF_GUNPOWDER);
        entries.add(BAG_OF_FLINT);
        entries.add(BAG_OF_CHERRY_SAPLINGS);
        entries.add(BAG_OF_NETHER_WARTS);
        entries.add(BAG_OF_MANGROVE_PROPAGULES);
        entries.add(BAG_OF_BIRCH_SAPLINGS);
        entries.add(BAG_OF_JUNGLE_SAPLINGS);
        entries.add(BAG_OF_ACACIA_SAPLINGS);
        entries.add(BAG_OF_OAK_SAPLINGS);
        entries.add(BAG_OF_SPRUCE_SAPLINGS);
        entries.add(BAG_OF_DARK_OAK_SAPLINGS);
        entries.add(TIED_CANDLES);
        entries.add(TIED_BLACK_CANDLES);
        entries.add(TIED_BLUE_CANDLES);
        entries.add(TIED_BROWN_CANDLES);
        entries.add(TIED_CYAN_CANDLES);
        entries.add(TIED_GRAY_CANDLES);
        entries.add(TIED_GREEN_CANDLES);
        entries.add(TIED_LIGHT_BLUE_CANDLES);
        entries.add(TIED_LIGHT_GRAY_CANDLES);
        entries.add(TIED_LIME_CANDLES);
        entries.add(TIED_MAGENTA_CANDLES);
        entries.add(TIED_ORANGE_CANDLES);
        entries.add(TIED_PINK_CANDLES);
        entries.add(TIED_PURPLE_CANDLES);
        entries.add(TIED_RED_CANDLES);
        entries.add(TIED_WHITE_CANDLES);
        entries.add(TIED_YELLOW_CANDLES);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CompressIt.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CompressIt.LOGGER.info("["+CompressIt.MOD_ID+"]: Registering items!");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));
    }
}
