package com.nikfred.hephaestus.init;

import com.nikfred.hephaestus.Hephaestus;
import com.nikfred.hephaestus.blocks.ModAnvil;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Hephaestus.MOD_ID);

    //ORE
    
    public static final RegistryObject<Block> PRELOGHTINE_ORE = BLOCKS.register("preloghtine_ore", () ->
            new Block(
                    Block.Properties
                            .create(Material.ROCK)
                            .hardnessAndResistance(8.0f, 10.0f)
                            .sound(SoundType.STONE)
                            .harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
            )
    );

    public static final RegistryObject<Block> ADAMANTINE_ORE= BLOCKS.register("adamantine_ore", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(25.0f, 40.0f)
                            .sound(SoundType.METAL)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .setRequiresTool()
            )
    );

    //METAL BLOCK

    public static final RegistryObject<Block> PRELOGHTINE_BLOCK= BLOCKS.register("preloghtine_block", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(10.0f, 10.0f)
                            .sound(SoundType.METAL)
                            .harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
            )
    );

    public static final RegistryObject<Block> ADAMANTINE_BLOCK= BLOCKS.register("adamantine_block", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(30.0f, 60.0f)
                            .sound(SoundType.METAL)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .setRequiresTool()
            )
    );

    //ANVIL

    public static final RegistryObject<Block> IRON_ANVIL= BLOCKS.register("iron_anvil", () ->
            new ModAnvil(
                    Block.Properties
                            .create(Material.ANVIL)
                            .hardnessAndResistance(10.0f, 10.0f)
                            .harvestLevel(2)

            )
    );

    public static final RegistryObject<Block> PRELOGHTINE_ANVIL= BLOCKS.register("preloghtine_anvil", () ->
            new ModAnvil(
                    Block.Properties
                            .create(Material.ANVIL)
                            .hardnessAndResistance(15.0f, 20.0f)
                            .harvestLevel(2)

            )
    );

    public static final RegistryObject<Block> ADAMANTINE_ANVIL = BLOCKS.register("adamantine_anvil", () ->
            new ModAnvil(
                    Block.Properties
                            .create(Material.ANVIL)
                            .hardnessAndResistance(30.0f, 40.0f)
                            .harvestLevel(3)

            )
    );

    //OTHER

    public static final RegistryObject<Block> TESTBLOCK = BLOCKS.register("testblock", () ->
            new Block(
                    Block.Properties
                            .create(Material.IRON)
                            .hardnessAndResistance(4.0f, 8.0f)
                            .sound(SoundType.METAL)
                            .harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
            )
    );

    public static final RegistryObject<Block> TURTLEBLOCK = BLOCKS.register("turtleblock", () ->
            new Block(
                    Block.Properties
                            .create(Material.ROCK)
                            .hardnessAndResistance(6.0f, 6.0f)
                            .sound(SoundType.STONE)
                            .harvestLevel(1)
                            .harvestTool(ToolType.PICKAXE)
                            .setRequiresTool()
            )
    );

}
