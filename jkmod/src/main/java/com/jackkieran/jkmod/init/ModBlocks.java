package com.jackkieran.jkmod.init;

import java.util.ArrayList;
import java.util.List;

import com.jackkieran.jkmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.IRON);
	
	//Just use this statement to create new block
	//public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.IRON);
}
