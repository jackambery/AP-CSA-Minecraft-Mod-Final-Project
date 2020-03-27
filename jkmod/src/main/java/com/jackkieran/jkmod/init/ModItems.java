package com.jackkieran.jkmod.init;

import java.util.ArrayList;
import java.util.List;

//This class is essentially a list of all the items we have added in the game
//Each item will have its own class defining its more specific properties

import com.jackkieran.jkmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

		public static final List<Item> ITEMS = new ArrayList<Item>();
		
		public static final Item RUBY = new ItemBase("ruby");
}