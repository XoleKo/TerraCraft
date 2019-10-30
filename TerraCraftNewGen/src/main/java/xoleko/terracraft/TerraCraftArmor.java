package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftArmor extends ItemGroup
{
	public TerraCraftArmor()
	{
		super("terraarmor");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.molten_breastplate);
	}

}
