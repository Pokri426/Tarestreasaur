package pokri.tarestreasaur.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pokri.tarestreasaur.Tarestreasaur;

public class ModItemGroups {

    public static final ItemGroup TARESTREASUAR_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Tarestreasaur.MOD_ID, "tarestreasaur"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tarestreasaur"))
                    .icon(() -> new ItemStack(ModItems.TESTITEM)).entries((displayContext, entries) -> {
                        //add items in here for the coustom creative tab
                /*example
                entries.add(Moditems.TESTITEM);
                 */
                    }).build());

    public static void registerItemGroups(){
        Tarestreasaur.LOGGER.info("Registering Item Groups for " + Tarestreasaur.MOD_ID);
    }
}
