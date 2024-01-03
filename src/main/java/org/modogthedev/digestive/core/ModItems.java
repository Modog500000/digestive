package org.modogthedev.digestive.core;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.modogthedev.digestive.Digestive;

public class ModItems {
    public static final FoodProperties crayonFood = new FoodProperties.Builder().nutrition(3).saturationMod(0.2f).alwaysEat().build();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Digestive.MODID);

    public static final RegistryObject<Item> RED_CRAYON = ITEMS.register("red_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> BLUE_CRAYON = ITEMS.register("blue_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> GREEN_CRAYON = ITEMS.register("green_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> YELLOW_CRAYON = ITEMS.register("yellow_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> BLACK_CRAYON = ITEMS.register("black_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> BROWN_CRAYON = ITEMS.register("brown_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> CYAN_CRAYON = ITEMS.register("cyan_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> GRAY_CRAYON = ITEMS.register("gray_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> LIGHT_BLUE_CRAYON = ITEMS.register("light_blue_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> LIGHT_GRAY_CRAYON = ITEMS.register("light_gray_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> LIME_CRAYON = ITEMS.register("lime_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> MAGENTA_CRAYON = ITEMS.register("magenta_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> PINK_CRAYON = ITEMS.register("pink_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> PURPLE_CRAYON = ITEMS.register("purple_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
    public static final RegistryObject<Item> WHITE_CRAYON = ITEMS.register("white_crayon", () -> new Item(new  Item.Properties().food(crayonFood)));
}
