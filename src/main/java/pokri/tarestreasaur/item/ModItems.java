package pokri.tarestreasaur.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pokri.tarestreasaur.Tarestreasaur;

public class ModItems {

    /*
    this is the structure to create a new item (replace testitem with item name)
     ps. you can ctrl click on a method to find out what you can do with it

                             ⬇ (must be capatilized)   ⬇ (must be lowercase)
    public static final Item TESTITEM = registerItem("testitem", new Item(new FabricItemSettings()));

     */
    public static final Item TESTITEM = registerItem("testitem", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Tarestreasaur.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Tarestreasaur.LOGGER.info("Registering Mod Items for" + Tarestreasaur.MOD_ID);


    }
}
