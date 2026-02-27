package net.herbert.myfirstmod;

import net.fabricmc.api.ModInitializer;

import net.herbert.myfirstmod.block.ModBlocks;
import net.herbert.myfirstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstMod implements ModInitializer {
    public static final String MOD_ID = "myfirstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}