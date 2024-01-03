package org.modogthedev.digestive.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.modogthedev.digestive.Digestive;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Digestive.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_CRAYON.get()))
                    .title(Component.translatable("itemgroup.digestive"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RED_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.PURPLE_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.MAGENTA_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.PINK_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.LIGHT_BLUE_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.CYAN_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.BLUE_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.LIME_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.GREEN_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.YELLOW_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.BROWN_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.BLACK_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.GRAY_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.LIGHT_GRAY_CRAYON.get().getDefaultInstance());
                        pOutput.accept(ModItems.WHITE_CRAYON.get().getDefaultInstance());
                    })
                    .build());
}
