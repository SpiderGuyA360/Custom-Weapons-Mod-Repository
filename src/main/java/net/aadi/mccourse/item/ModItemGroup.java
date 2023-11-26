package net.aadi.mccourse.item;

import net.aadi.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MODDED_WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "modded_weapons_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modded_weapons_group"))
                    .icon(() -> new ItemStack(ModItems.GOLD_RING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_RING);
                        entries.add(ModItems.INKED_FEATHER);
                        entries.add(ModItems.RAVEN_SCYTHE);
                        entries.add(ModItems.NETHERWHITE_INGOT);
                    }).build());

    public static void registerItemGroups() {

    }
}
