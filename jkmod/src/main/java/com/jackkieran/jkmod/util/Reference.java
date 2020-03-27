package com.jackkieran.jkmod.util;

//This is just a class of variables about the mod that are used in other places

public class Reference {
	
	//modId is just a short reference name for the mod
	//"jkmod" for Jack and Kieran's Mod
	public static final String MOD_ID = "jkmod";
	
	//name of the mod
	public static final String NAME = "Jack and Kieran's Mod";
	
	//version of the mod, don't really plan on changing this
	public static final String VERSION = "1.0";
	
	//tells what versions are accepted
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	//names for these classes, not sure exactly why they're needed
	public static final String CLIENT_PROXY_CLASS = "com.jackkieran.jkmod.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.jackkieran.jkmod.proxy.CommonProxy";
	
}