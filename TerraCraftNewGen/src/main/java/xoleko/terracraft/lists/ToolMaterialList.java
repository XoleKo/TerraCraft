package xoleko.terracraft.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
	//TerraCraftAxePrehardmode
	
	copper_axe(3.0f, 35, 450, 1, 0, ItemList.copper_axe),
	lead_axe(6.0f, 50, 700, 1, 0, ItemList.lead_axe),
	gold_axe(7.0f, 55, 750, 1, 0, ItemList.gold_axe),
	blood_lust_cluster_axe(22.0f, 75, 950, 1, 0, ItemList.blood_lust_cluster_axe),
	molten_hamaxe_axe(20.0f, 110, 1300, 1, 0, ItemList.molten_hamaxe_axe),
	tin_axe(4.0f, 40, 500, 1, 0, ItemList.tin_axe),
	silver_axe(6.0f, 50, 700, 1, 0, ItemList.silver_axe),
	platinum_axe(8.0f, 60, 800, 1 , 0, ItemList.platinum_axe),
	war_axe_of_the_night_axe(20.0f, 75, 950, 1, 0, ItemList.war_axe_of_the_night_axe),
	iron_axe(5.0f, 45, 550, 1, 0, ItemList.iron_axe),
	tungsten_axe(7.0f, 55, 550, 1, 0, ItemList.tungsten_axe),
	sawtooth_shark_axe(13.0f, 70, 900, 1, 0, ItemList.sawtooth_shark_axe),
	meteor_hamaxe_axe(20.0f, 80, 1000, 1, 0, ItemList.meteor_hamaxe_axe),
	
	//TerraCraftPickaxePrehardmode
	copper_pickaxe(4.0f, 35f, 450, 1, 0, ItemList.copper_pickaxe),
	iron_pickaxe(5.0f, 40f, 500, 1, 0, ItemList.iron_pickaxe),
	tungsten_pickaxe(6.0f, 50f, 700, 1, 0, ItemList.tungsten_pickaxe),
	candy_cane_pickaxe(7.0f, 55, 750, 1, 0, ItemList.candy_cane_pickaxe),
	deathbringer_pickaxe(12.0f, 70, 900, 3, 0, ItemList.deathbringer_pickaxe),
	tin_pickaxe(5.0f, 35, 450, 1, 0, ItemList.tin_pickaxe),
	lead_pickaxe(6.0f, 43, 525, 1, 0, ItemList.lead_pickaxe),
	bone_pickaxe(8.0f, 50, 700, 1, 0, ItemList.bone_pickaxe),
	platinum_pickaxe(7.0f, 59, 795, 2, 0, ItemList.platinum_pickaxe),
	molten_pickaxe(12.0f, 100, 1200, 3, 0, ItemList.molten_pickaxe),
	cactus_pickaxe(5.0f, 35, 450, 1, 0, ItemList.cactus_pickaxe),
	silver_pickaxe(6.0f, 45, 550, 1, 0, ItemList.silver_pickaxe),
	gold_pickaxe(6.0f, 55, 750, 2, 0, ItemList.gold_pickaxe),
	nightmare_pickaxe(9.0f, 65, 850, 3, 0, ItemList.nightmare_pickaxe),
	reaver_shark_pickaxe(16.0f, 100, 2500, 1, 0, ItemList.reaver_shark_pickaxe),
	
	//TerraCraftShortSwordPreHardmode
	copper_shortsword_sword(5f, 5.0f, 350, 1, 0, ItemList.copper_shortsword_sword),
	lead_shortsword_sword(9.0f, 5.0f, 615, 1, 0, ItemList.lead_shortsword_sword),
	gold_shortsword_sword(11.0f, 5.0f, 750, 1, 0, ItemList.gold_shortsword_sword),
	tin_shortsword_sword(7.0f, 5.0f, 475, 1, 0, ItemList.tin_shortsword_sword),
	silver_shortsword_sword(9.0f, 5.0f, 625, 1, 0, ItemList.silver_shortsword_sword),
	platinum_shortsword_sword(13.0f, 5.0f, 800, 1, 0, ItemList.platinum_shortsword_sword),
	iron_shortsword_sword(8.0f, 5.0f, 525, 1, 0, ItemList.iron_shortsword_sword),
	tungsten_shortsword_sword(10.0f, 5.0f, 625, 1, 0, ItemList.tungsten_shortsword_sword),
	
	//TerraCraftBroadSwordPreHarmode
	boreal_wood_sword(7.0f, 5.0f, 125, 1, 0, ItemList.boreal_wood_sword),
	ebonwood_sword(9.0f, 5.0f, 325, 1, 0, ItemList.ebonwood_sword),
	zombie_arm_sword(11.0f, 5.0f, 2500, 1, 0, ItemList.zombie_arm_sword),
	iron_broadsword_sword(9.0f, 5.0f, 600, 1, 0, ItemList.iron_broadsword_sword),
	tungsten_broadsword_sword(11.0f, 5.0f, 700, 1, 0, ItemList.tungsten_broadsword_sword),
	bone_sword(15.0f, 5.0f, 1025, 1, 0, ItemList.bone_sword),
	katana_sword(15.0f, 5.0f, 2500, 1, 0, ItemList.katana_sword),
	blood_butcherer_sword(21.0f, 5.0f, 850, 1, 0, ItemList.blood_butcherer_sword),
	phasesaber_blue_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_blue_sword),
	phasesaber_red_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_red_sword),
	phasesaber_green_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_green_sword),
	phasesaber_purple_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_purple_sword),
	phasesaber_white_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_white_sword),
	phasesaber_yellow_sword(20.0f, 5.0f, 875, 1, 0, ItemList.phasesaber_yellow_sword),
	blade_of_grass_sword(27.0f, 5.0f, 900, 1, 0, ItemList.blade_of_grass_sword),
	nights_edge_sword(41.0f, 5.0f, 1500, 1, 0, ItemList.nights_edge_sword),
	mandible_blade_sword(13.0f, 5.0f, 380, 1, 0, ItemList.mandible_blade_sword),
	fiery_greatsword_sword(35.0f, 5.0f, 1250, 1, 0, ItemList.fiery_greatsword_sword),
	muramasa_sword(18.0f, 5.0f, 950, 1, 0, ItemList.muramasa_sword),
	lights_bane_sword(17.0f, 5.0f, 900, 1, 0, ItemList.lights_bane_sword),
	rich_mahogany_sword(7.0f, 5.0f, 125, 1, 0, ItemList.rich_mahogany_sword),
	shadewood_sword(9.0f, 5.0f, 125, 1, 0, ItemList.shadewood_sword),
	copper_broadsword_sword(7.0f, 5.0f, 425, 1, 0, ItemList.copper_broadsword_sword),
	lead_broadsword_sword(10.0f, 5.0f, 690, 1, 0, ItemList.lead_broadsword_sword),
	gold_broadsword_sword(12.0f, 5.0f, 825, 1, 0, ItemList.gold_broadsword_sword),
	enchanted_sword(23.0f, 5.0f, 2500, 1, 0, ItemList.enchanted_sword),
	candy_cane_sword(15.0f, 5.0f, 1000, 1, 0, ItemList.candy_cane_sword),
	purple_clubberfish_sword(23.0f, 5.0f, 2500, 1, 0, ItemList.purple_clubberfish_sword),
	starfury_sword(21.0f, 5.0f, 2500, 1, 0, ItemList.starfury_sword),
	falcon_blade_sword(29.0f, 5.0f, 1250, 1, 0, ItemList.falcon_blade_sword),
	wooden_sword(6.0f, 5.0f, 125, 1, 0, ItemList.wooden_sword),
	palm_wood_sword(7.0f, 5.0f, 125, 1, 0, ItemList.palm_wood_sword),
	cactus_sword(8.0f, 5.0f, 175, 1, 0, ItemList.cactus_sword),
	tin_broadsword_sword(8.0f, 5.0f, 550, 1, 0, ItemList.tin_broadsword_sword),
	silver_broadsword_sword(10.0f, 5.0f, 700, 1, 0, ItemList.silver_broadsword_sword),
	platinum_broadsword_sword(14.0f, 5.0f, 875, 1, 0, ItemList.platinum_broadsword_sword),
	ice_blade_sword(16.0f, 5.0f, 1250, 1, 0, ItemList.ice_blade_sword),
	bee_keeper_sword(25.0f, 5.0f, 1250, 1, 0, ItemList.bee_keeper_sword),
	arkhalis_sword(19.0f, 5.0f, 2500, 1, 0, ItemList.arkhalis_sword),
	
	//TerraCraftBowPreHardmode
	wooden_bow(3.0f, 5.0f, 300, 1, 0, ItemList.wooden_bow),
	tendon_bow(18.0f, 5.0f, 700, 1, 0, ItemList.tendon_bow),
	palm_wood_bow(5.0f, 5.0f, 300, 1, 0, ItemList.palm_wood_bow),
	copper_bow(5.0f, 5.0f, 300, 1, 0, ItemList.copper_bow),
	lead_bow(8.0f, 5.0f, 300, 1, 0, ItemList.lead_bow),
	gold_bow(10.0f, 5.0f, 600, 1, 0, ItemList.gold_bow),
	the_bees_knees(25.0f, 5.0f, 1200, 1, 0, ItemList.the_bees_knees),
	boreal_wood_bow(5.0f, 5.0f, 300, 1, 0, ItemList.boreal_wood_bow),
	ebonwood_bow(7.0f, 5.0f, 300, 1, 0, ItemList.ebonwood_bow),
	tin_bow(6.0f, 5.0f, 450, 1, 0, ItemList.tin_bow),
	silver_bow(8.0f, 5.0f, 700, 1, 0, ItemList.silver_bow),
	platinum_bow(12.0f, 5.0f, 800, 1, 0, ItemList.platinum_bow),
	molten_fury(30.0f, 5.0f, 1250, 1, 0, ItemList.molten_fury),
	hellwing_bow(19.0f, 5.0f, 2500, 1, 0, ItemList.hellwing_bow),
	rich_mahogany_bow(5.0f, 5.0f, 300, 1, 0, ItemList.rich_mahogany_bow),
	iron_bow(7.0f, 5.0f, 600, 1, 0, ItemList.iron_bow),
	tungsten_bow(9.0f, 5.0f, 700, 1, 0, ItemList.tungsten_bow),
	demon_bow(13.0f, 5.0f, 850, 1, 0, ItemList.demon_bow),
	sharanga(35.0f, 5.0f, 1500, 1, 0, ItemList.sharanga),
	shadewood_bow(7.0f, 5.0f, 300, 1, 0, ItemList.shadewood_bow);
	
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.durability = durability;
		this.efficiency = efficiency;
		this.enchantability = enchantability;
		this.harvestLevel = harvestLevel;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() 
	{
	   return this.durability;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() 
	{
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
