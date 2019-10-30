package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftAxe extends ItemGroup
{
	public TerraCraftAxe()
	{
		super("terraaxe");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.molten_hamaxe_axe);
	}

}
