package net.abanoub.litevanillaextras.item;

import net.abanoub.litevanillaextras.LiteVanillaExtras;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item GOLDEN_DUCK_EGG = registerItem("golden_duck_egg", new Item(new Item.Settings()));
    public static final Item DUCK_EGG = registerItem("duck_egg", new Item(new Item.Settings()));
    public static final Item OMELETTE = registerItem("omelette", new Item(new Item.Settings()));
    public static final Item OMELETTE_SANDWICH = registerItem("omelette_sandwich", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LiteVanillaExtras.MOD_ID, name), item) ;
    }

    public static void registerModItems(){
        LiteVanillaExtras.LOGGER.info("registering mod items for: " + LiteVanillaExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
            entries.add(GOLDEN_DUCK_EGG);
            entries.add(DUCK_EGG);
            entries.add(OMELETTE);
            entries.add(OMELETTE_SANDWICH);
        });
    }
}
