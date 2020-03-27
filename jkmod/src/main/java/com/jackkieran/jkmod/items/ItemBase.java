package com.jackkieran.jkmod.items;

import com.jackkieran.jkmod.Main;
import com.jackkieran.jkmod.init.ModItems;
import com.jackkieran.jkmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//This is the basic constructor for a block

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
		
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}