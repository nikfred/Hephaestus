package com.nikfred.hephaestus.blocks;

import com.nikfred.hephaestus.init.ModBlocks;
import com.nikfred.hephaestus.utils.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class MaterialBlock extends BlockItem {
    public MaterialBlock(Block block) {
        super(block,new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB));
    }
}
