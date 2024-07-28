package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COMPRESSIT_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(CompressIt.MOD_ID, "tied_sticks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.compressit")).icon(()->new ItemStack(ModItems.TIED_STICKS)).entries((displayContext, entries) -> {
                entries.add(ModItems.TIED_STICKS);
                entries.add(ModItems.TIED_BONES);
                entries.add(ModItems.TIED_BLAZE_RODS);
                entries.add(ModItems.TIED_KELP);
                entries.add(ModItems.TIED_NAME_TAGS);
                entries.add(ModItems.TIED_ROTTEN_FLESH);
                entries.add(ModItems.TIED_SUGAR_CANE);
                entries.add(ModItems.TIED_LEATHER);
                entries.add(ModItems.STACK_OF_PAPERS);
                entries.add(ModItems.BALL_OF_STRINGS);
                entries.add(ModItems.BAG_OF_FEATHERS);
                entries.add(ModItems.PACKED_EGGS);
                entries.add(ModItems.PACKED_GOLDEN_CARROTS);
                entries.add(ModItems.PACKED_CARROTS);
                entries.add(ModItems.PACKED_POTATOES);
                entries.add(ModItems.PACKED_ENDER_PEARLS);
                entries.add(ModItems.BAG_OF_GUNPOWDER);
                entries.add(ModItems.BAG_OF_FLINT);
                entries.add(ModItems.BAG_OF_CHERRY_SAPLINGS);
                entries.add(ModItems.BAG_OF_NETHER_WARTS);
                entries.add(ModItems.BAG_OF_MANGROVE_PROPAGULES);
                entries.add(ModItems.BAG_OF_BIRCH_SAPLINGS);
                entries.add(ModItems.BAG_OF_JUNGLE_SAPLINGS);
                entries.add(ModItems.BAG_OF_ACACIA_SAPLINGS);
                entries.add(ModItems.BAG_OF_OAK_SAPLINGS);
                entries.add(ModItems.BAG_OF_SPRUCE_SAPLINGS);
                entries.add(ModItems.BAG_OF_DARK_OAK_SAPLINGS);
                entries.add(ModItems.TIED_CANDLES);
                entries.add(ModItems.TIED_BLACK_CANDLES);
                entries.add(ModItems.TIED_BLUE_CANDLES);
                entries.add(ModItems.TIED_BROWN_CANDLES);
                entries.add(ModItems.TIED_CYAN_CANDLES);
                entries.add(ModItems.TIED_GRAY_CANDLES);
                entries.add(ModItems.TIED_GREEN_CANDLES);
                entries.add(ModItems.TIED_LIGHT_BLUE_CANDLES);
                entries.add(ModItems.TIED_LIGHT_GRAY_CANDLES);
                entries.add(ModItems.TIED_LIME_CANDLES);
                entries.add(ModItems.TIED_MAGENTA_CANDLES);
                entries.add(ModItems.TIED_ORANGE_CANDLES);
                entries.add(ModItems.TIED_PINK_CANDLES);
                entries.add(ModItems.TIED_PURPLE_CANDLES);
                entries.add(ModItems.TIED_RED_CANDLES);
                entries.add(ModItems.TIED_WHITE_CANDLES);
                entries.add(ModItems.TIED_YELLOW_CANDLES);
                entries.add(ModItems.ALLIUM_BOUQUET);
                entries.add(ModItems.AZURE_BLUET_BOUQUET);
                entries.add(ModItems.BLUE_ORCHID_BOUQUET);
                entries.add(ModItems.CORNFLOWER_BOUQUET);
                entries.add(ModItems.DANDELION_BOUQUET);
                entries.add(ModItems.LILAC_BOUQUET);
                entries.add(ModItems.LILY_OF_THE_VALLEY_BOUQUET);
                entries.add(ModItems.OXEYE_DAISY_BOUQUET);
                entries.add(ModItems.PEONY_BOUQUET);
                entries.add(ModItems.POPPY_BOUQUET);
                entries.add(ModItems.ROSE_BUSH_BOUQUET);
                entries.add(ModItems.SUNFLOWER_BOUQUET);
                entries.add(ModItems.WITHER_ROSE_BOUQUET);
                entries.add(ModItems.ORANGE_TULIP_BOUQUET);
                entries.add(ModItems.PINK_TULIP_BOUQUET);
                entries.add(ModItems.RED_TULIP_BOUQUET);
                entries.add(ModItems.WHITE_TULIP_BOUQUET);
            }).build());
    public static void registerItemGroups(){
        CompressIt.LOGGER.info("["+CompressIt.MOD_ID+"]: Registering item groups!");
    }
}
