package com.nikfred.hephaestus.items;

import com.nikfred.hephaestus.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class MaterialItem extends Item {

    public MaterialItem() {
        super(new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB));
    }

    public MaterialItem(int maxDamage) {
        super(new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB).maxDamage(maxDamage));
    }
}
