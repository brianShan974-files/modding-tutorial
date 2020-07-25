package com.brianShan974.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CryingObsidianBlock extends BlockBase{

	public CryingObsidianBlock(String name, Material material, CreativeTabs tab) {
		
		super(name, material, tab);
		
		setSoundType(SoundType.STONE);
		setHardness(50.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(12.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
		
	}

}
