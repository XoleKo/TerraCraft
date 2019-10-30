package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftPickaxe extends ItemGroup
{
	public TerraCraftPickaxe()
	{
		super("terrapickaxe");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.molten_pickaxe);
	}

}
