package net.bunmuppet.coloredtools.item;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {

    //WOODEN HANDLE STATISTICS
    public static final Item WOODEN_HANDLE = registerTool("wooden_handle");

    //HANDLE LOGIC
    public static Item registerTool(String name){
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new Item(new Item.Settings().group(ItemGroup.TOOLS))
        );
    }

    //SWORD STATISTICS
    public static final Item WOODEN_BIRCH_SWORD = registerSword("wooden_birch_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_ACACIA_SWORD = registerSword("wooden_acacia_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_SPRUCE_SWORD = registerSword("wooden_spruce_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_CRIMSON_SWORD = registerSword("wooden_crimson_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_DARK_OAK_SWORD = registerSword("wooden_dark_oak_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_JUNGLE_SWORD = registerSword("wooden_jungle_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_MANGROVE_SWORD = registerSword("wooden_mangrove_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_WARPED_SWORD = registerSword("wooden_warped_sword",
            ToolMaterials.WOOD, 3, -2.4F);

    //SWORD LOGIC
    public static Item registerSword(String name, ToolMaterials material, int attackDamage, float attackSpeed){
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new SwordItem(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.COMBAT))
        );
    }

    //PICKAXE STATISTICS
    public static final Item WOODEN_BIRCH_PICKAXE = registerPickaxe("wooden_birch_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_ACACIA_PICKAXE = registerPickaxe("wooden_acacia_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_SPRUCE_PICKAXE = registerPickaxe("wooden_spruce_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_CRIMSON_PICKAXE = registerPickaxe("wooden_crimson_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_DARK_OAK_PICKAXE = registerPickaxe("wooden_dark_oak_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_JUNGLE_PICKAXE = registerPickaxe("wooden_jungle_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_MANGROVE_PICKAXE = registerPickaxe("wooden_mangrove_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_WARPED_PICKAXE = registerPickaxe("wooden_warped_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);

    //PICKAXE LOGIC
    public static Item registerPickaxe(String name, ToolMaterials material, int attackDamage, float attackSpeed){
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new PickaxeItem(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS))
        );
    }

    //AXE STATISTICS
    public static final Item WOODEN_BIRCH_AXE = registerAxe("wooden_birch_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_ACACIA_AXE = registerAxe("wooden_acacia_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_SPRUCE_AXE = registerAxe("wooden_spruce_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_CRIMSON_AXE = registerAxe("wooden_crimson_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_DARK_OAK_AXE = registerAxe("wooden_dark_oak_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_JUNGLE_AXE = registerAxe("wooden_jungle_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_MANGROVE_AXE = registerAxe("wooden_mangrove_axe",
            ToolMaterials.WOOD, 6, -3.2F);
    public static final Item WOODEN_WARPED_AXE = registerAxe("wooden_warped_axe",
            ToolMaterials.WOOD, 6, -3.2F);

    //AXE LOGIC
    public static Item registerAxe(String name, ToolMaterials material, int attackDamage, float attackSpeed){
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new AxeItem(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS))
        );
    }

    //HOE STATISTICS
    public static final Item WOODEN_BIRCH_HOE = registerHoe("wooden_birch_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_ACACIA_HOE = registerHoe("wooden_acacia_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_SPRUCE_HOE = registerHoe("wooden_spruce_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_CRIMSON_HOE = registerHoe("wooden_crimson_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_DARK_OAK_HOE = registerHoe("wooden_dark_oak_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_JUNGLE_HOE = registerHoe("wooden_jungle_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_MANGROVE_HOE = registerHoe("wooden_mangrove_hoe",
            ToolMaterials.WOOD, 0, -3.0F);
    public static final Item WOODEN_WARPED_HOE = registerHoe("wooden_warped_hoe",
            ToolMaterials.WOOD, 0, -3.0F);

    //HOE LOGIC
    public static Item registerHoe(String name, ToolMaterial material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new CustomHoeItem(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS))
        );
    }

    //SHOVEL STATISTICS
    public static final Item WOODEN_BIRCH_SHOVEL = registerShovel("wooden_birch_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_ACACIA_SHOVEL = registerShovel("wooden_acacia_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_SPRUCE_SHOVEL = registerShovel("wooden_spruce_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_CRIMSON_SHOVEL = registerShovel("wooden_crimson_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_DARK_OAK_SHOVEL = registerShovel("wooden_dark_oak_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_JUNGLE_SHOVEL = registerShovel("wooden_jungle_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_MANGROVE_SHOVEL = registerShovel("wooden_mangrove_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);
    public static final Item WOODEN_WARPED_SHOVEL = registerShovel("wooden_warped_shovel",
            ToolMaterials.WOOD, 1.5, -3.0F);

    //SHOVEL LOGIC
    public static Item registerShovel(String name, ToolMaterials material, double attackDamage, float attackSpeed){
        return Registry.register(
                Registry.ITEM,
                new Identifier("colored-tools", name),
                new ShovelItem(material, (float) attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS))
        );
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for Colored Tools");
        // This method is a placeholder. Actual registration logic happens as static initializers.
    }


}
