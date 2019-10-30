package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftOres extends ItemGroup
{
	public TerraCraftOres()
	{
		super("terraores");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.meteorite_ore_block);
	}

}
