package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftBlocks extends ItemGroup
{
	public TerraCraftBlocks()
	{
		super("terrablock");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.dirt_block);
	}

}
