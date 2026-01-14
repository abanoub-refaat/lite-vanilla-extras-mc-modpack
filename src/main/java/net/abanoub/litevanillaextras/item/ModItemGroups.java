package net.abanoub.litevanillaextras.item;

import net.abanoub.litevanillaextras.LiteVanillaExtras;
import net.abanoub.litevanillaextras.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(LiteVanillaExtras.MOD_ID, "ruby_item_group"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.litevanillaextras.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                    }).build());


    public static void registerItemGroups(){
        LiteVanillaExtras.LOGGER.info("Register item groups for: " + LiteVanillaExtras.MOD_ID);
    }
}
