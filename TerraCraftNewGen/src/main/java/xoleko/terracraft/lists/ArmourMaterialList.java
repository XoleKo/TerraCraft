package xoleko.terracraft.lists;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import xoleko.terracraft.TerraCraftNewGen;

public enum ArmourMaterialList implements IArmorMaterial
{
	wood("wood_armor", 400, new int[] {1, 1, 1, 1}, 0, ItemList.wood_block, "entity.ender_dragon.growl", 0.0f),
	mining("mining_armor", 300, new int[] {1, 1, 1, 1}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	rich_mahogany("rich_mahogany_armor", 300, new int[] {1, 1, 1, 1}, 0, ItemList.rich_mahogany_block, "entity.ender_dragon.growl", 0.0f),
	boreal_wood("boreal_wood_armor", 300, new int[] {1, 1, 1, 1}, 0, ItemList.boreal_wood_block, "entity.ender_dragon.growl", 0.0f),
	palm_wood("palm_wood_armor", 300, new int[] {1, 1, 1, 1}, 0, ItemList.palm_wood_block, "entity.ender_dragon.growl", 0.0f),
	ebonwood("ebonwood_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.ebonwood_block, "entity.ender_dragon.growl", 0.0f),
	shadewood("shadewood_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.shadewood_block, "entity.ender_dragon.growl", 0.0f),
	rain("rain_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	eskimo("eskimo_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	pink_eskimo("pink_eskimo_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	angler("angler_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	cactus("cactus_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.cactus_block, "entity.ender_dragon.growl", 0.0f),
	copper("copper_armor", 300, new int[] {1, 2, 1, 1}, 0, ItemList.copper_bar_item, "entity.ender_dragon.growl", 0.0f),
	tin("tin_armor", 300, new int[] {2, 2, 1, 2}, 0, ItemList.tin_bar_item, "entity.ender_dragon.growl", 0.0f),
	pumpkin("pumpkin_armor", 300, new int[] {2, 3, 2, 2}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	gladiator("gladiator_armor", 300, new int[] {2, 3, 2, 2}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	iron("iron_armor", 300, new int[] {2, 3, 2, 2}, 0, ItemList.iron_bar_item, "entity.ender_dragon.growl", 0.0f),
	lead("lead_armor", 300, new int[] {3, 3, 2, 3}, 0, ItemList.lead_bar_item, "entity.ender_dragon.growl", 0.0f),
	silver("silver_armor", 300, new int[] {3, 4, 3, 3}, 0, ItemList.silver_bar_item, "entity.ender_dragon.growl", 0.0f),
	tungsten("tungsten_armor", 300, new int[] {4, 5, 3, 4}, 0, ItemList.tungsten_bar_item, "entity.ender_dragon.growl", 0.0f),
	gold("gold_armor", 300, new int[] {4, 5, 4, 4}, 0, ItemList.gold_bar_item, "entity.ender_dragon.growl", 0.0f),
	platinum("platinum_armor", 300, new int[] {5, 6, 5, 5}, 0, ItemList.platinum_bar_item, "entity.ender_dragon.growl", 0.0f),
	ninja("ninja_armor", 300, new int[] {2, 4, 3, 2}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	fossil("fossil_armor", 300, new int[] {3, 6, 4, 3}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	obsidian("obsidian_armor", 300, new int[] {4, 5, 5, 4}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	bee("bee_armor", 300, new int[] {4, 5, 4, 4}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	jungle("jungle_armor", 300, new int[] {5, 6, 6, 5}, 0, ItemList.leather_item, "entity.ender_dragon.growl", 0.0f),
	ancient_cobalt("ancient_cobalt_armor", 300, new int[] {5, 6, 6, 5}, 0, ItemList.hellstone_bar_item, "entity.ender_dragon.growl", 0.0f),
	meteor("meteor_armor", 300, new int[] {5, 6, 5, 5}, 0, ItemList.meteorite_bar_item, "entity.ender_dragon.growl", 0.0f),
	necro("necro_armor", 300, new int[] {5, 6, 5, 5}, 0, ItemList.bone_item, "entity.ender_dragon.growl", 0.0f),
	shadow("shadow_armor", 300, new int[] {6, 7, 6, 6}, 0, ItemList.demonite_bar_item, "entity.ender_dragon.growl", 0.0f),
	ancient_shadow("ancient_shadow_armor", 300, new int[] {6, 7, 6, 6}, 0, ItemList.demonite_bar_item, "entity.ender_dragon.growl", 0.0f),
	crimson("crimson_armor", 300, new int[] {6, 7, 6, 6}, 0, ItemList.crimtane_bar_item, "entity.ender_dragon.growl", 0.0f),
	molten("molten_armor", 300, new int[] {8, 9, 8, 8}, 0, ItemList.hellstone_bar_item, "entity.ender_dragon.growl", 0.0f);
	
	private static final int[] max_damage_array = new int[] {13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	
	private ArmourMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
        this.repairItem = repairItem;
        this.damageReductionAmounts = damageReductionAmounts;
        this.toughness = toughness;
	
	}

	@Override
	public int getDamageReductionAmount(EntityEquipmentSlot slot)
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EntityEquipmentSlot slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public String getName() 
	{
		return TerraCraftNewGen.modid + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
	
	

}
