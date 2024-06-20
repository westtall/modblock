package net.west.modblockmod.item;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.west.modblockmod.ModblockMod;
import net.west.modblockmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModblockMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODBLOCKMOD_TAB = CREATIVE_MODE_TABS.register("modblockmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MODSTICK.get()))
                    .title(Component.translatable("creativetab.modblockmod_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.MODSTICK.get());
                        pOutput.accept(ModBlocks.MODOAK_PLANKS.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
