package imnotjahan.mod.torture;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Items that can be used in crafting, eg. the knife or beef stew
  */
public class UsableItem extends Item
{
    public UsableItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();
        stack.hurt(1, random, null);
        return stack;
    }
}
