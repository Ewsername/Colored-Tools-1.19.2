package net.bunmuppet.coloredtools.tags;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {

    //FALLBACK RECIPE TESTING -- IGNORE
    //public static final TagKey<Item> CUSTOM_PLANKS = TagKey.of(Registry.ITEM_KEY, new Identifier("colored-tools", "planks_except_oak"));
    //public static final TagKey<Item> CUSTOM_SLABS = TagKey.of(Registry.ITEM_KEY, new Identifier("colored-tools", "slabs_except_oak"));

    public static void init() {
        // Call this during mod initialization if needed, but usually, tags are defined via JSON files.
    }
}