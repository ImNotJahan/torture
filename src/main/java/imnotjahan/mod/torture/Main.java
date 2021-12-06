package imnotjahan.mod.torture;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Main
{
    public static final ItemGroup GROUP =
            new MenuGroup(Reference.MODID, () -> new ItemStack(Items.IRON_SWORD));
}
