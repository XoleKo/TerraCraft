package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftBows extends ItemGroup
{
	public TerraCraftBows()
	{
		super("terrabows");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.tendon_bow);
	}

}
