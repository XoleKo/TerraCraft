package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftHooks extends ItemGroup
{
	public TerraCraftHooks()
	{
		super("terrahooks");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.dirt_block);
	}

}
