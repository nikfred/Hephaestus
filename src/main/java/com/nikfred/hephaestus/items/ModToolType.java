package com.nikfred.hephaestus.items;

import net.minecraftforge.common.ToolType;

public class ModToolType {
    public static final ToolType HAMMER = ToolType.get("hammer");

    public ModToolType(String name){
       ToolType.get(name);
    }
}
