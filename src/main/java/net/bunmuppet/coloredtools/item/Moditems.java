package net.bunmuppet.coloredtools.item;

import net.bunmuppet.coloredtools.ColoredTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {

    public static final Item WOODEN_BIRCH_PICKAXE = registerItem("wooden_birch_pickaxe",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item WOODEN_BIRCH_SWORD = registerItem("wooden_birch_sword",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ColoredTools.MOD_ID, name), item);
    }

    public static void registerModItems()   {
        ColoredTools.LOGGER.debug("Registering Mod Items for" + ColoredTools.MOD_ID);

    }
}
