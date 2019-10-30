package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftWiring extends ItemGroup
{
	public TerraCraftWiring()
	{
		super("terrawiring");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.blue_wrench_item);
	}

}
