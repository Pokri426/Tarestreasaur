package pokri.tarestreasaur.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pokri.tarestreasaur.Tarestreasaur;

public class ModItems {

    public static Item createBasicItem(String name){
        Item item = createAndRegisterItem(name, new FabricItemSettings());
        return item;
    }

    // Register the item and add it to the creative tab
    private static Item createAndRegisterItem(String name, FabricItemSettings settings) {
        Item item = new Item(settings);
        Registry.register(Registries.ITEM, new Identifier(Tarestreasaur.MOD_ID, name), item);

        // Add to creative tab
        ModItemGroups.addItem(item);

        return item;
    }

    public static void registerModItems() {
        Tarestreasaur.LOGGER.info("Registering Mod Items for " + Tarestreasaur.MOD_ID);

        // Nothing else is needed here if all registration happens in the static fields above
    }

    // Example item
    public static final Item TESTITEM = createBasicItem("testitem");

    //usage shown bellow if you want to crete an item with properties
    //public static final Item TESTITEM = createAndRegisterItem("testitem", new FabricItemSettings());

    // Put all Item instances bellow
}



