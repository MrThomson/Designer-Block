package com.Richard.designerblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="designerblocks", name="Designer Blocks", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false) 
public class DesignerBlocks {
	//this is the first verison of my mod but I will keep working on new blocks plus add a few brand new things never before seen in minecraft

		@Instance("designerblocks")
		public static DesignerBlocks instance;
		
		@SidedProxy(clientSide="com.Richard.designerblocks.ClientProxy", serverSide="com.Richard.designerblocks.serverProxy")
		public static ServerProxy proxy;
		
		public final Block firstblock = new firstblock(165, Material.materialCarpet)
		   .setHardness(0.2F) .setStepSound(Block.soundClothFootstep)
		   .setUnlocalizedName("firstblock") .setCreativeTab(CreativeTabs.tabBlock);
		
		public final Block marble = new marble(166, Material.rock)
		   .setHardness(0.7F) .setStepSound(Block.soundStoneFootstep)
		   .setUnlocalizedName("marble") .setCreativeTab(CreativeTabs.tabBlock);
		
		@EventHandler  
		public void preInit(FMLPreInitializationEvent event) {}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {}
		
		@EventHandler
		public void load(FMLInitializationEvent event) {
			proxy.registerRenderers();
			GameRegistry.registerBlock(firstblock, "firstblock");
			LanguageRegistry.addName(firstblock, "firstblock");
			MinecraftForge.setBlockHarvestLevel(firstblock,"shears", 0);
			GameRegistry.registerBlock(marble, "marble");
			LanguageRegistry.addName(marble, "marble");
			MinecraftForge.setBlockHarvestLevel(marble,"pickaxe", 0);
		
		}
		
		

}
