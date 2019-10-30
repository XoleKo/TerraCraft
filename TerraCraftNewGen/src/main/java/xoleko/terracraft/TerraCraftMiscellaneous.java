package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftMiscellaneous extends ItemGroup
{
	public TerraCraftMiscellaneous()
	{
		super("terramiscellaneous");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.bug_net_item);
	}

}
