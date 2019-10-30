package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftMeleeWeapons extends ItemGroup
{
	public TerraCraftMeleeWeapons()
	{
		super("terrameleeweapons");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.ice_blade_sword);
	}

}
