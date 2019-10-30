package xoleko.terracraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xoleko.terracraft.items.ItemCustomAxe;
import xoleko.terracraft.items.ItemCustomBow;
import xoleko.terracraft.items.ItemCustomPickaxe;
import xoleko.terracraft.lists.ArmourMaterialList;
import xoleko.terracraft.lists.BlockList;
import xoleko.terracraft.lists.ItemList;
import xoleko.terracraft.lists.ToolMaterialList;
import xoleko.terracraft.world.OreGeneration;


@Mod("terracraft")
public class TerraCraftNewGen
{
	public static TerraCraftNewGen instance;
	public static final String modid = "terracraft";
	private static final Logger Logger = LogManager.getLogger(modid);
	
    public static final ItemGroup terraitems = new TerraCraftItems();
    public static final ItemGroup terrakeys = new TerraCraftKeys();
    public static final ItemGroup terraaxe = new TerraCraftAxe();
    public static final ItemGroup terrapickaxe = new TerraCraftPickaxe();
    public static final ItemGroup terrafishingpoles = new TerraCraftFishingPoles();
    public static final ItemGroup terrahooks = new TerraCraftHooks();
    public static final ItemGroup terrawiring = new TerraCraftWiring();
    public static final ItemGroup terramiscellaneous = new TerraCraftMiscellaneous();
    public static final ItemGroup terrameleeweapon = new TerraCraftMeleeWeapons();
    public static final ItemGroup terraores = new TerraCraftOres();
    public static final ItemGroup terraarmor = new TerraCraftArmor();
    public static final ItemGroup terrabows = new TerraCraftBows();
    public static final ItemGroup terrablock = new TerraCraftBlocks();
    
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	
	{
		OreGeneration.setupOreGeneration();
		Logger.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	
	{
		Logger.info("clientRegistries method registered");
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
		public static class RegistryEvents
		{
			@SubscribeEvent
			public static void registerItems(final RegistryEvent.Register<Item> event)
			{
				event.getRegistry().registerAll
				(
						
						//TerraCraftPickaxePreHardmode
						
				        ItemList.copper_pickaxe = new ItemCustomPickaxe(ToolMaterialList.copper_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("copper_pickaxe")),
						ItemList.iron_pickaxe = new ItemCustomPickaxe(ToolMaterialList.iron_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("iron_pickaxe")),
						ItemList.tungsten_pickaxe = new ItemCustomPickaxe(ToolMaterialList.tungsten_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("tungsten_pickaxe")),
						ItemList.candy_cane_pickaxe = new ItemCustomPickaxe(ToolMaterialList.candy_cane_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("candy_cane_pickaxe")),
						ItemList.deathbringer_pickaxe = new ItemCustomPickaxe(ToolMaterialList.deathbringer_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("deathbringer_pickaxe")),
						ItemList.tin_pickaxe = new ItemCustomPickaxe(ToolMaterialList.tin_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("tin_pickaxe")),
						ItemList.lead_pickaxe = new ItemCustomPickaxe(ToolMaterialList.lead_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("lead_pickaxe")),
						ItemList.bone_pickaxe = new ItemCustomPickaxe(ToolMaterialList.bone_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("bone_pickaxe")),
						ItemList.platinum_pickaxe = new ItemCustomPickaxe(ToolMaterialList.platinum_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("platinum_pickaxe")),
						ItemList.molten_pickaxe = new ItemCustomPickaxe(ToolMaterialList.molten_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("molten_pickaxe")),
						ItemList.cactus_pickaxe = new ItemCustomPickaxe(ToolMaterialList.cactus_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("cactus_pickaxe")),
						ItemList.silver_pickaxe = new ItemCustomPickaxe(ToolMaterialList.silver_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("silver_pickaxe")),
						ItemList.gold_pickaxe = new ItemCustomPickaxe(ToolMaterialList.gold_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("gold_pickaxe")),
						ItemList.nightmare_pickaxe = new ItemCustomPickaxe(ToolMaterialList.nightmare_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("nightmare_pickaxe")),
						ItemList.reaver_shark_pickaxe = new ItemCustomPickaxe(ToolMaterialList.reaver_shark_pickaxe, -1, 6.0f, new Item.Properties().group(terrapickaxe)).setRegistryName(location("reaver_shark_pickaxe")),
						
						//TerraCraftArmorsPreHarmode
						ItemList.wood_helmet = new ItemArmor(ArmourMaterialList.wood, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("wood_helmet")),
						ItemList.wood_chestplate = new ItemArmor(ArmourMaterialList.wood, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("wood_chestplate")),
						ItemList.wood_leggings = new ItemArmor(ArmourMaterialList.wood, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("wood_leggings")),
						ItemList.wood_boots = new ItemArmor(ArmourMaterialList.wood, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("wood_boots")),
						ItemList.mining_helmet = new ItemArmor(ArmourMaterialList.mining, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("mining_helmet")),
						ItemList.mining_shirt = new ItemArmor(ArmourMaterialList.mining, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("mining_shirt")),
						ItemList.mining_pants = new ItemArmor(ArmourMaterialList.mining, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("mining_pants")),
						ItemList.mining_boots = new ItemArmor(ArmourMaterialList.mining, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("mining_boots")),
						ItemList.eskimo_hood = new ItemArmor(ArmourMaterialList.eskimo, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("eskimo_hood")),
						ItemList.eskimo_coat = new ItemArmor(ArmourMaterialList.eskimo, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("eskimo_coat")),
						ItemList.eskimo_pants = new ItemArmor(ArmourMaterialList.eskimo, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("eskimo_pants")),
						ItemList.eskimo_boots = new ItemArmor(ArmourMaterialList.eskimo, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("eskimo_boots")),
						ItemList.pumpkin_helmet = new ItemArmor(ArmourMaterialList.pumpkin, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("pumpkin_helmet")),
						ItemList.pumpkin_breastplate = new ItemArmor(ArmourMaterialList.pumpkin, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("pumpkin_breastplate")),
						ItemList.pumpkin_leggings = new ItemArmor(ArmourMaterialList.pumpkin, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("pumpkin_leggings")),
						ItemList.pumpkin_boots = new ItemArmor(ArmourMaterialList.pumpkin, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("pumpkin_boots")),
						ItemList.copper_helmet = new ItemArmor(ArmourMaterialList.copper, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("copper_helmet")),
						ItemList.copper_chainmail = new ItemArmor(ArmourMaterialList.copper, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("copper_chainmail")),
						ItemList.copper_greaves = new ItemArmor(ArmourMaterialList.copper, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("copper_greaves")),
						ItemList.copper_boots = new ItemArmor(ArmourMaterialList.copper, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("copper_boots")),
						ItemList.rich_mahogany_helmet = new ItemArmor(ArmourMaterialList.rich_mahogany, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("rich_mahogany_helmet")),
						ItemList.rich_mahogany_breastplate = new ItemArmor(ArmourMaterialList.rich_mahogany, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("rich_mahogany_breastplate")),
						ItemList.rich_mahogany_greaves = new ItemArmor(ArmourMaterialList.rich_mahogany, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("rich_mahogany_greaves")),
						ItemList.rich_mahogany_boots = new ItemArmor(ArmourMaterialList.rich_mahogany, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("rich_mahogany_boots")),
						ItemList.molten_helmet = new ItemArmor(ArmourMaterialList.molten, EntityEquipmentSlot.HEAD, new Item.Properties().group(terraarmor)).setRegistryName(location("molten_helmet")),
						ItemList.molten_breastplate = new ItemArmor(ArmourMaterialList.molten, EntityEquipmentSlot.CHEST, new Item.Properties().group(terraarmor)).setRegistryName(location("molten_breastplate")),
						ItemList.molten_greaves = new ItemArmor(ArmourMaterialList.molten, EntityEquipmentSlot.LEGS, new Item.Properties().group(terraarmor)).setRegistryName(location("molten_greaves")),
						ItemList.molten_boots = new ItemArmor(ArmourMaterialList.molten, EntityEquipmentSlot.FEET, new Item.Properties().group(terraarmor)).setRegistryName(location("molten_boots")),
								
						//TerraCraftAxePrehardmode
						
						ItemList.copper_axe = new ItemCustomAxe(ToolMaterialList.copper_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("copper_axe")),
						ItemList.lead_axe = new ItemCustomAxe(ToolMaterialList.lead_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("lead_axe")),
						ItemList.gold_axe = new ItemCustomAxe(ToolMaterialList.gold_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("gold_axe")),
						ItemList.blood_lust_cluster_axe = new ItemCustomAxe(ToolMaterialList.blood_lust_cluster_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("blood_lust_cluster_axe")),
						ItemList.molten_hamaxe_axe = new ItemCustomAxe(ToolMaterialList.molten_hamaxe_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("molten_hamaxe_axe")),
						ItemList.tin_axe = new ItemCustomAxe(ToolMaterialList.tin_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("tin_axe")),
						ItemList.silver_axe = new ItemCustomAxe(ToolMaterialList.silver_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("silver_axe")),
						ItemList.platinum_axe = new ItemCustomAxe(ToolMaterialList.platinum_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("platinum_axe")),
						ItemList.war_axe_of_the_night_axe = new ItemCustomAxe(ToolMaterialList.war_axe_of_the_night_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("war_axe_of_the_night_axe")),
						ItemList.iron_axe = new ItemCustomAxe(ToolMaterialList.iron_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("iron_axe")),
						ItemList.tungsten_axe = new ItemCustomAxe(ToolMaterialList.tungsten_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("tungsten_axe")),
						ItemList.sawtooth_shark_axe = new ItemCustomAxe(ToolMaterialList.sawtooth_shark_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("sawtooth_shark_axe")),
						ItemList.meteor_hamaxe_axe = new ItemCustomAxe(ToolMaterialList.meteor_hamaxe_axe, -1.0f, 6.0f, new Item.Properties().group(terraaxe)).setRegistryName(location("meteor_hamaxe_axe")),
						
						//TerraCraftShortswordPrehardmode
						
						ItemList.copper_shortsword_sword = new ItemSword(ToolMaterialList.copper_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("copper_shortsword_sword")),
						ItemList.lead_shortsword_sword = new ItemSword(ToolMaterialList.lead_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("lead_shortsword_sword")),
						ItemList.gold_shortsword_sword = new ItemSword(ToolMaterialList.gold_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("gold_shortsword_sword")),
						ItemList.tin_shortsword_sword = new ItemSword(ToolMaterialList.tin_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("tin_shortsword_sword")),
						ItemList.silver_shortsword_sword = new ItemSword(ToolMaterialList.silver_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("silver_shortsword_sword")),
						ItemList.platinum_shortsword_sword = new ItemSword(ToolMaterialList.platinum_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("platinum_shortsword_sword")),
						ItemList.iron_shortsword_sword = new ItemSword(ToolMaterialList.iron_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("iron_shortsword_sword")),
						ItemList.tungsten_shortsword_sword = new ItemSword(ToolMaterialList.tungsten_shortsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("tungsten_shortsword_sword")),
						
						//TerraCraftBroadswordPreHardmode
						
						ItemList.boreal_wood_sword = new ItemSword(ToolMaterialList.boreal_wood_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("boreal_wood_sword")),
						ItemList.ebonwood_sword = new ItemSword(ToolMaterialList.ebonwood_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("ebonwood_sword")),
						ItemList.zombie_arm_sword = new ItemSword(ToolMaterialList.zombie_arm_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("zombie_arm_sword")),
						ItemList.iron_broadsword_sword = new ItemSword(ToolMaterialList.iron_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("iron_broadsword_sword")),
						ItemList.tungsten_broadsword_sword = new ItemSword(ToolMaterialList.tungsten_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("tungsten_broadsword_sword")),
						ItemList.bone_sword = new ItemSword(ToolMaterialList.bone_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("bone_sword")),
						ItemList.katana_sword = new ItemSword(ToolMaterialList.katana_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("katana_sword")),
						ItemList.blood_butcherer_sword = new ItemSword(ToolMaterialList.blood_butcherer_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("blood_butcherer_sword")),
						ItemList.phasesaber_blue_sword = new ItemSword(ToolMaterialList.phasesaber_blue_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_blue_sword")),
						ItemList.phasesaber_red_sword = new ItemSword(ToolMaterialList.phasesaber_red_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_red_sword")),
					    ItemList.phasesaber_green_sword = new ItemSword(ToolMaterialList.phasesaber_green_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_green_sword")),
						ItemList.phasesaber_purple_sword = new ItemSword(ToolMaterialList.phasesaber_purple_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_purple_sword")),
						ItemList.phasesaber_white_sword = new ItemSword(ToolMaterialList.phasesaber_white_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_white_sword")),
					    ItemList.phasesaber_yellow_sword = new ItemSword(ToolMaterialList.phasesaber_yellow_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("phasesaber_yellow_sword")),
					    ItemList.blade_of_grass_sword = new ItemSword(ToolMaterialList.blade_of_grass_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("blade_of_grass_sword")),
						ItemList.nights_edge_sword = new ItemSword(ToolMaterialList.nights_edge_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("nights_edge_sword")),
						ItemList.mandible_blade_sword = new ItemSword(ToolMaterialList.mandible_blade_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("mandible_blade_sword")),
						ItemList.fiery_greatsword_sword = new ItemSword(ToolMaterialList.fiery_greatsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("fiery_greatsword_sword")),
						ItemList.muramasa_sword = new ItemSword(ToolMaterialList.muramasa_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("muramasa_sword")),							
					    ItemList.rich_mahogany_sword = new ItemSword(ToolMaterialList.rich_mahogany_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("rich_mahogany_sword")),
						ItemList.shadewood_sword = new ItemSword(ToolMaterialList.shadewood_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("shadewood_sword")),
						ItemList.copper_broadsword_sword = new ItemSword(ToolMaterialList.copper_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("copper_broadsword_sword")),
						ItemList.lead_broadsword_sword = new ItemSword(ToolMaterialList.lead_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("lead_broadsword_sword")),
						ItemList.gold_broadsword_sword = new ItemSword(ToolMaterialList.gold_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("gold_broadsword_sword")),
						ItemList.enchanted_sword = new ItemSword(ToolMaterialList.enchanted_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("enchanted_sword")),
						ItemList.candy_cane_sword = new ItemSword(ToolMaterialList.candy_cane_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("candy_cane_sword")),
						ItemList.purple_clubberfish_sword = new ItemSword(ToolMaterialList.purple_clubberfish_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("purple_clubberfish_sword")),
						ItemList.starfury_sword = new ItemSword(ToolMaterialList.starfury_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("starfury_sword")),
						ItemList.falcon_blade_sword = new ItemSword(ToolMaterialList.falcon_blade_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("falcon_blade_sword")),	
						ItemList.wooden_sword = new ItemSword(ToolMaterialList.wooden_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("wooden_sword")),
						ItemList.palm_wood_sword = new ItemSword(ToolMaterialList.palm_wood_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("palm_wood_sword")),	
						ItemList.cactus_sword = new ItemSword(ToolMaterialList.cactus_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("cactus_sword")),
						ItemList.tin_broadsword_sword = new ItemSword(ToolMaterialList.tin_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("tin_broadsword_sword")),
						ItemList.silver_broadsword_sword = new ItemSword(ToolMaterialList.silver_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("silver_broadsword_sword")),
						ItemList.platinum_broadsword_sword = new ItemSword(ToolMaterialList.platinum_broadsword_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("platinum_broadsword_sword")),
						ItemList.ice_blade_sword = new ItemSword(ToolMaterialList.ice_blade_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("ice_blade_sword")),
						ItemList.bee_keeper_sword = new ItemSword(ToolMaterialList.bee_keeper_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("bee_keeper_sword")),
						ItemList.arkhalis_sword = new ItemSword(ToolMaterialList.arkhalis_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("arkhalis_sword")),
						ItemList.lights_bane_sword = new ItemSword(ToolMaterialList.lights_bane_sword, -1, 6.0f, new Item.Properties().group(terrameleeweapon)).setRegistryName(location("lights_bane_sword")),
								
						
						//TerraCraftExplosivesPreHardmode
						ItemList.grenade_item = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("grenade_item")),
						ItemList.bomb_item = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("bomb_item")),
						ItemList.dynamite_item = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("dynamite_item")),
						
						//TerraCraftBarsPreHardmode
						ItemList.copper_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("copper_bar_item")),
						ItemList.crimtane_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("crimtane_bar_item")),		
						ItemList.demonite_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("demonite_bar_item")),
						ItemList.gold_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("gold_bar_item")),
						ItemList.iron_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("iron_bar_item")),		
						ItemList.lead_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("lead_bar_item")),
						ItemList.platinum_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("platinum_bar_item")),
						ItemList.meteorite_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("meteorite_bar_item")),		
						ItemList.silver_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("silver_bar_item")),
						ItemList.tin_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("tin_bar_item")),
				        ItemList.tungsten_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("tungsten_bar_item")),	
				        ItemList.hellstone_bar_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("hellstone_bar_item")),
				        
				        //TerraCraftPreciousMaterialsPreHardmode
				        ItemList.sapphire_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("sapphire_item")),
						ItemList.emerald_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("emerald_item")),
						ItemList.ruby_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("ruby_item")),
						ItemList.diamond_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("diamond_item")),
						ItemList.topaz_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("topaz_item")),
						ItemList.amethyst_item = new Item(new Item.Properties().group(terraores)).setRegistryName(location("amethyst_item")),
						
						//TerraCraftItemsPreHardmode
						ItemList.stinger_item = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("stinger_item")),
						ItemList.jungle_spores_item = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("jungle_spores_item")),
						ItemList.bucket_item = new ItemBucket(null, new Item.Properties().group(terraitems)).setRegistryName(location("bucket_item")),
						ItemList.string_demonite = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_demonite")),
						ItemList.string_crimtane = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_crimtane")),
						ItemList.string_iron = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_iron")),
						ItemList.string_tin = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_tin")),
						ItemList.string_tungsten = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_tungsten")),
						ItemList.string_gold = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_gold")),
						ItemList.string_lead = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_lead")),
						ItemList.string_copper = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("string_copper")),
						ItemList.demonite_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("demonite_nuggets")),
						ItemList.crimtane_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("crimtane_nuggets")),
						ItemList.iron_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("iron_nuggets")),
						ItemList.tin_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("tin_nuggets")),
						ItemList.tungsten_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("tungsten_nuggets")),
						ItemList.gold_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("gold_nuggets")),
						ItemList.lead_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("lead_nuggets")),
						ItemList.copper_nuggets = new Item(new Item.Properties().group(terraitems)).setRegistryName(location("copper_nuggets")),

						//TerraCraftKeysPreHardmode
						ItemList.shadow_key_item = new Item(new Item.Properties().group(terrakeys)).setRegistryName(location("shadow_key_item")),
						ItemList.golden_key_item = new Item(new Item.Properties().group(terrakeys)).setRegistryName(location("golden_key_item")),
						
						//TerraCraftBowsPreHarmode
						ItemList.wooden_bow = new ItemCustomBow(ToolMaterialList.wooden_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("wooden_bow")),
						ItemList.tendon_bow = new ItemCustomBow(ToolMaterialList.tendon_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("tendon_bow")),
						ItemList.demon_bow = new ItemCustomBow(ToolMaterialList.demon_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("demon_bow")),
						ItemList.iron_bow = new ItemCustomBow(ToolMaterialList.iron_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("iron_bow")),
						ItemList.palm_wood_bow = new ItemCustomBow(ToolMaterialList.palm_wood_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("palm_wood_bow")),
						ItemList.tin_bow = new ItemCustomBow(ToolMaterialList.tin_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("tin_bow")),
						ItemList.tungsten_bow = new ItemCustomBow(ToolMaterialList.tungsten_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("tungsten_bow")),
						ItemList.gold_bow = new ItemCustomBow(ToolMaterialList.gold_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("gold_bow")),
						ItemList.ebonwood_bow = new ItemCustomBow(ToolMaterialList.ebonwood_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("ebonwood_bow")),
						ItemList.copper_bow = new ItemCustomBow(ToolMaterialList.copper_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("copper_bow")),
						ItemList.lead_bow = new ItemCustomBow(ToolMaterialList.lead_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("lead_bow")),
						ItemList.boreal_wood_bow = new ItemCustomBow(ToolMaterialList.boreal_wood_bow, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("boreal_wood_bow")),
						ItemList.molten_fury = new ItemCustomBow(ToolMaterialList.molten_fury, -1, 6.0f, new Item.Properties().maxStackSize(1).group(terrabows)).setRegistryName(location("molten_fury")),


					    //TerraCraftFishingPolesPreHardmode
						
						
						//TerraCraftBlockPreHardmode
						
						ItemList.dirt_block = new ItemBlock(BlockList.dirt_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.dirt_block.getRegistryName()),
						ItemList.copper_ore_block = new ItemBlock(BlockList.copper_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.copper_ore_block.getRegistryName()),
						ItemList.tin_ore_block = new ItemBlock(BlockList.tin_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.tin_ore_block.getRegistryName()),
						ItemList.iron_ore_block = new ItemBlock(BlockList.iron_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.iron_ore_block.getRegistryName()),
					    ItemList.lead_ore_block = new ItemBlock(BlockList.lead_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.lead_ore_block.getRegistryName()),
						ItemList.silver_ore_block = new ItemBlock(BlockList.silver_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.silver_ore_block.getRegistryName()),
						ItemList.tungsten_ore_block = new ItemBlock(BlockList.tungsten_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.tungsten_ore_block.getRegistryName()),
					    ItemList.gold_ore_block = new ItemBlock(BlockList.gold_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.gold_ore_block.getRegistryName()),
	                    ItemList.platinum_ore_block = new ItemBlock(BlockList.platinum_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.platinum_ore_block.getRegistryName()),
	    				ItemList.meteorite_ore_block = new ItemBlock(BlockList.meteorite_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.meteorite_ore_block.getRegistryName()),
	    			    ItemList.demonite_ore_block = new ItemBlock(BlockList.demonite_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.demonite_ore_block.getRegistryName()),
	    				ItemList.crimtane_ore_block = new ItemBlock(BlockList.crimtane_ore_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.crimtane_ore_block.getRegistryName()),
	    	            ItemList.hellstone_block = new ItemBlock(BlockList.hellstone_block, new Item.Properties().group(terraores)).setRegistryName(BlockList.hellstone_block.getRegistryName()),
	    	    	    ItemList.rich_mahogany_block = new ItemBlock(BlockList.rich_mahogany_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.rich_mahogany_block.getRegistryName()),
	    	    	    ItemList.shadewood_block = new ItemBlock(BlockList.shadewood_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.shadewood_block.getRegistryName()),
	    	    	    ItemList.wood_block = new ItemBlock(BlockList.wood_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.wood_block.getRegistryName()),
	    	    	    ItemList.cactus_block = new ItemBlock(BlockList.cactus_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.cactus_block.getRegistryName()),
	    	    	    ItemList.palm_wood_block = new ItemBlock(BlockList.palm_wood_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.palm_wood_block.getRegistryName()),
	    	    	    ItemList.ebonwood_block = new ItemBlock(BlockList.ebonwood_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.ebonwood_block.getRegistryName()),
	    	    	    ItemList.boreal_wood_block = new ItemBlock(BlockList.boreal_wood_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.boreal_wood_block.getRegistryName()),
	    	    	    ItemList.grass_block = new ItemBlock(BlockList.grass_block, new Item.Properties().group(terrablock)).setRegistryName(BlockList.grass_block.getRegistryName()),
	    	    	    ItemList.glass = new ItemBlock(BlockList.glass, new Item.Properties().group(terrablock)).setRegistryName(BlockList.glass.getRegistryName())

				);
				
				
				Logger.info("Item registered");
			}
			
			@SubscribeEvent
			public static void registerBlocks(final RegistryEvent.Register<Block> event)
			{
				event.getRegistry().registerAll
				(
						BlockList.dirt_block = new Block(Block.Properties.create(Material.GRASS).hardnessAndResistance(1.2f, 5.0f).lightValue(0).sound(SoundType.GROUND)).setRegistryName(location("dirt_block")),
						BlockList.copper_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 20f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("copper_ore_block")),
						BlockList.tin_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 20f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("tin_ore_block")),
						BlockList.iron_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 25f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("iron_ore_block")),
						BlockList.lead_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 25f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("lead_ore_block")),
						BlockList.silver_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 27.5f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("silver_ore_block")),
						BlockList.tungsten_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 27.5f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("tungsten_ore_block")),
						BlockList.gold_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 27.5f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("gold_ore_block")),
						BlockList.platinum_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 27.5f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("platinum_ore_block")),
						BlockList.meteorite_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 5.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("meteorite_ore_block")),
						BlockList.demonite_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 5.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("demonite_ore_block")),
						BlockList.crimtane_ore_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20f, 5.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("crimtane_ore_block")),
						BlockList.hellstone_block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(60f, 5.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("hellstone_block")),
						BlockList.rich_mahogany_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("rich_mahogany_block")),
						BlockList.shadewood_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("shadewood_block")),
						BlockList.wood_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("wood_block")),
						BlockList.cactus_block = new Block(Block.Properties.create(Material.CACTUS).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.SNOW)).setRegistryName(location("cactus_block")),
						BlockList.palm_wood_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("palm_wood_block")),
						BlockList.ebonwood_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("ebonwood_block")),
						BlockList.boreal_wood_block = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("boreal_wood_block")),
						BlockList.grass_block = new BlockGrass(Block.Properties.create(Material.GRASS).hardnessAndResistance(1.2f, 5.0f).lightValue(0).sound(SoundType.PLANT)).setRegistryName(location("grass_block")),
						BlockList.glass = new BlockGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(1.2f, 5.0f).lightValue(0).sound(SoundType.GLASS)).setRegistryName(location("glass")),

						//OthersBlock
						BlockList.white_screen_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("white_screen_block")),
						BlockList.black_screen_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("black_screen_block")),
						BlockList.ordi_portable_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 10.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(location("ordi_portable_block"))
						
						
				
				);
				
				
				Logger.info("Blocks registered");
			}
			
			
			
			private static ResourceLocation location(String name)
			{
				return new ResourceLocation(modid, name);
			}
		}
}
