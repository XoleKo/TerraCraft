package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftKeys extends ItemGroup
{
	public TerraCraftKeys()
	{
		super("terrakeys");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.golden_key_item);
	}

}
