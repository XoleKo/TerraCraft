package xoleko.terracraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xoleko.terracraft.lists.ItemList;

public class TerraCraftBlocksOtherFromTerraria extends ItemGroup
{
	public TerraCraftBlocksOtherFromTerraria()
	{
		super("terraother");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.ordi_portable_block);
	}

}
