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
            }).build());
    public static void registerItemGroups(){
        CompressIt.LOGGER.info("["+CompressIt.MOD_ID+"]: Registering item groups!");
    }
}
