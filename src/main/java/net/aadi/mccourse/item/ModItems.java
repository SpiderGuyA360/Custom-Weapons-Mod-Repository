package net.aadi.mccourse.item;

import net.aadi.mccourse.MCCourseMod;
import net.aadi.mccourse.item.custom.ModBlindnessWeaponItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item INKED_FEATHER = registerItem("inked_feather",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_RING = registerItem("gold_ring",
            new Item(new FabricItemSettings()));
    public static final Item NETHERWHITE_INGOT = registerItem("netherwhite_ingot",
            new Item(new FabricItemSettings()));

    public static final Item RAVEN_SCYTHE = registerItem("raven_scythe",
            new ModBlindnessWeaponItem(ModToolMaterial.NETHEWHITE_INGOT, 3, -3f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(INKED_FEATHER);
        entries.add(GOLD_RING);
    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
