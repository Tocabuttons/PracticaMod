package tocabotones.mod.objects.items;

import tocabotones.mod.Plantilla;
import tocabotones.mod.init.ItemInit;

import tocabotones.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Plantilla.proxy.registerItemRenderer(this,0, "inventory");
    }
}
