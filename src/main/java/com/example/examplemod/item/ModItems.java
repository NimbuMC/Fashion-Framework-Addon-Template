package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MOD_ID);

//    //Default Clothing:
//    public static final DeferredItem<Item> SNEAKERS = ITEMS.register("sneakers",
//            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.BOOTS,
//                    new Item.Properties()
//                            .durability(ArmorItem.Type.BOOTS.getDurability(10)),
//                    0xFFFFFFF));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
