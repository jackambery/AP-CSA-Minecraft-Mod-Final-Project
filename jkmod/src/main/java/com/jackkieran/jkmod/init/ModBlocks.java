package com.jackkieran.jkmod.init;

import java.util.ArrayList;

//This class is essentially a list of all the blocks we have added in the game
//Each block will have its own class defining its more specific properties

import java.util.List;

import com.jackkieran.jkmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//List of our blocks
	public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.IRON);
	
}
