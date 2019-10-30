package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftItems extends ItemGroup
{
	public TerraCraftItems()
	{
		super("terraitems");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.bucket_item);
	}

}
