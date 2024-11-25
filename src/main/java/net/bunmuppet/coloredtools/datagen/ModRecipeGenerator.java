package net.bunmuppet.coloredtools.datagen;

import net.bunmuppet.coloredtools.item.Moditems;
import net.bunmuppet.coloredtools.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> consumer) {

        //ACACIA TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_ACACIA_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.ACACIA_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_ACACIA_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_ACACIA_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.ACACIA_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_ACACIA_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_ACACIA_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.ACACIA_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_ACACIA_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_ACACIA_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.ACACIA_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_ACACIA_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_ACACIA_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.ACACIA_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_ACACIA_SWORD)));

        //BIRCH TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_BIRCH_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.BIRCH_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_BIRCH_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_BIRCH_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.BIRCH_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_BIRCH_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_BIRCH_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.BIRCH_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_BIRCH_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_BIRCH_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.BIRCH_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_BIRCH_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_BIRCH_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.BIRCH_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_BIRCH_SWORD)));

        //CRIMSON TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_CRIMSON_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_CRIMSON_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_CRIMSON_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_CRIMSON_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_CRIMSON_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_CRIMSON_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_CRIMSON_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.CRIMSON_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_CRIMSON_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_CRIMSON_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_CRIMSON_SWORD)));

        //DARK_OAK TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_DARK_OAK_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_DARK_OAK_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_DARK_OAK_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_DARK_OAK_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_DARK_OAK_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_DARK_OAK_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_DARK_OAK_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_DARK_OAK_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_DARK_OAK_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_DARK_OAK_SWORD)));

        //JUNGLE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_JUNGLE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_JUNGLE_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_JUNGLE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_JUNGLE_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_JUNGLE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_JUNGLE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_JUNGLE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.JUNGLE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_JUNGLE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_JUNGLE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_JUNGLE_SWORD)));

        //MANGROVE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_MANGROVE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_MANGROVE_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_MANGROVE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_MANGROVE_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_MANGROVE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_MANGROVE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_MANGROVE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.MANGROVE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_MANGROVE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_MANGROVE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_MANGROVE_SWORD)));

        //SPRUCE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_SPRUCE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_SPRUCE_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_SPRUCE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_SPRUCE_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_SPRUCE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_SPRUCE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_SPRUCE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.SPRUCE_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_SPRUCE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_SPRUCE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_SPRUCE_SWORD)));

        //WARPED TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_WARPED_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.WARPED_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_WARPED_AXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_WARPED_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.WARPED_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_WARPED_HOE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_WARPED_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.WARPED_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_WARPED_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_WARPED_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.WARPED_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_WARPED_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Moditems.WOODEN_WARPED_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.WARPED_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Moditems.WOODEN_WARPED_SWORD)));

        //OAK TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(Items.WOODEN_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Items.WOODEN_AXE)));

        ShapedRecipeJsonBuilder.create(Items.WOODEN_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Items.WOODEN_HOE)));

        ShapedRecipeJsonBuilder.create(Items.WOODEN_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Items.WOODEN_PICKAXE)));

        ShapedRecipeJsonBuilder.create(Items.WOODEN_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.OAK_SLAB)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Items.WOODEN_SHOVEL)));

        ShapedRecipeJsonBuilder.create(Items.WOODEN_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('X', Moditems.WOODEN_HANDLE)
                .criterion(RecipeProvider.hasItem(Items.OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .criterion(RecipeProvider.hasItem(Moditems.WOODEN_HANDLE),
                        RecipeProvider.conditionsFromItem(Moditems.WOODEN_HANDLE))
                .offerTo(consumer, new Identifier(RecipeProvider.getRecipeName(Items.WOODEN_SWORD)));
    }
}