package pokri.tarestreasaur.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pokri.tarestreasaur.Tarestreasaur;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups {

    // Use a list to store your modded items
    private static final List<Item> moddedItemsList = new ArrayList<>();

    public static final ItemGroup TARESTREASUAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Tarestreasaur.MOD_ID, "tarestreasaur"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.tarestreasaur"))
                    .icon(() -> new ItemStack(ModItems.TESTITEM))
                    .entries((displayContext, entries) -> {
                        // Add all items from the list
                        for (Item item : moddedItemsList) {
                            entries.add(item);
                        }
                    }).build());

    public static void addItem(Item item) {
        moddedItemsList.add(item);
    }

    public static void registerItemGroups() {
        Tarestreasaur.LOGGER.info("Registering Item Groups for " + Tarestreasaur.MOD_ID);
    }
}

