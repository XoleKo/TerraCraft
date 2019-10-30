package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftFishingPoles extends ItemGroup
{
	public TerraCraftFishingPoles()
	{
		super("terrafishingpoles");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.dirt_block);
	}

}
