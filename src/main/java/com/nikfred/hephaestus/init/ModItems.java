package com.nikfred.hephaestus.init;

import com.nikfred.hephaestus.Hephaestus;
import com.nikfred.hephaestus.blocks.MaterialBlock;
import com.nikfred.hephaestus.items.HammerItem;
import com.nikfred.hephaestus.items.MaterialItem;
import com.nikfred.hephaestus.utils.ModItemGroups;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.beans.EventHandler;

import static net.minecraft.entity.EntityType.BAT;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hephaestus.MOD_ID);

    //ITEMS

    ArmorItem armor;
    //EventHandler
    SpawnEggItem egg;

    public static final RegistryObject<Item> PRELOGHTINE_NEEDLE = ITEMS.register("preloghtine_needle", MaterialItem::new);
    public static final RegistryObject<Item> PRELOGHTINE_STRING = ITEMS.register("preloghtine_string", MaterialItem::new);
    public static final RegistryObject<Item> PRELOGHTINE_LEATHER = ITEMS.register("preloghtine_leather", MaterialItem::new);
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod", MaterialItem::new);
    public static final RegistryObject<Item> IRON_HANDLE = ITEMS.register("iron_handle", MaterialItem::new);
    public static final RegistryObject<Item> SPAWN_EGG = ITEMS.register("spawn_egg", () -> new SpawnEggItem( BAT, 1, 2, new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB)));

    //MINERAL

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", MaterialItem::new);
    public static final RegistryObject<Item> RUBY_BROKEN = ITEMS.register("ruby_broken", MaterialItem::new);

    //NUGGETS

    public static final RegistryObject<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget", MaterialItem::new);
    public static final RegistryObject<Item> PRELOGHTINE_NUGGET = ITEMS.register("preloghtine_nugget", MaterialItem::new);

    //INGOTS

    public static final RegistryObject<Item> PRELOGHTINE_INGOT = ITEMS.register("preloghtine_ingot", MaterialItem::new);
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot", MaterialItem::new);

    //TOOLS

    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(ItemTier.IRON,7, (new Item.Properties()).group(ModItemGroups.MOD_MATERIALS_TAB)));
    public static final RegistryObject<Item> PRELOGHTINE_HAMMER = ITEMS.register("preloghtine_hammer", () -> new MaterialItem(768));
    public static final RegistryObject<Item> ADAMANTINE_HAMMER = ITEMS.register("adamantine_hammer", () -> new MaterialItem(1500));


    //ORE ITEMS

    public static final RegistryObject<Item> PRELOGHTINE_ORE_ITEM = ITEMS.register("preloghtine_ore", () ->
            new MaterialBlock(ModBlocks.PRELOGHTINE_ORE.get()));
    public static final RegistryObject<Item> ADAMANTINE_ORE_ITEM = ITEMS.register("adamantine_ore", () ->
            new MaterialBlock(ModBlocks.ADAMANTINE_ORE.get()));

    //METAL BLOCK ITEMS

    public static final RegistryObject<Item> PRELOGHTINE_BLOCK_ITEM = ITEMS.register("preloghtine_block", () ->
            new MaterialBlock(ModBlocks.PRELOGHTINE_BLOCK.get()));
    public static final RegistryObject<Item> ADAMANTINE_BLOCK_ITEM = ITEMS.register("adamantine_block", () ->
            new MaterialBlock(ModBlocks.ADAMANTINE_BLOCK.get()));

    //ANVIL

    public static final RegistryObject<Item> IRON_ANVIL_ITEM = ITEMS.register("iron_anvil", () ->
            new MaterialBlock(ModBlocks.IRON_ANVIL.get()));
    public static final RegistryObject<Item> PRELOGHTINE_ANVIL_ITEM = ITEMS.register("preloghtine_anvil", () ->
            new MaterialBlock(ModBlocks.PRELOGHTINE_ANVIL.get()));
    public static final RegistryObject<Item> ADAMANTINE_ANVIL_ITEM = ITEMS.register("adamantine_anvil", () ->
            new MaterialBlock(ModBlocks.ADAMANTINE_ANVIL.get()));

    //OTHER BLOCK

    public static final RegistryObject<Item> TESTBLOCK_ITEM = ITEMS.register("testblock", () ->
            new MaterialBlock(ModBlocks.TESTBLOCK.get()));
    public static final RegistryObject<Item> TURTLEBLOCK_ITEM = ITEMS.register("turtleblock", () ->
            new MaterialBlock(ModBlocks.TURTLEBLOCK.get()));

}
