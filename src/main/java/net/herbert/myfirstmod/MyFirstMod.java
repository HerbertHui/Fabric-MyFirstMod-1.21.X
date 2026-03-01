package net.herbert.myfirstmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.herbert.myfirstmod.block.ModBlocks;
import net.herbert.myfirstmod.component.ModDataComponentTypes;
import net.herbert.myfirstmod.item.ModItemGroups;
import net.herbert.myfirstmod.item.ModItems;
import net.herbert.myfirstmod.util.HammerUsageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstMod implements ModInitializer {
    public static final String MOD_ID = "myfirstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroup();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDataComponentTypes.registerDataComponentTypes();

        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600); // Refer to the fuelTime in AbstractFurnaceBlockEntity.java

        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}