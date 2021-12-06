package imnotjahan.mod.torture;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class EventSubscriber
{
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                setup(new Horns(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(Main.GROUP)), "crown"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "sliced_bread"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "toast"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "toast_beef_stew"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "toast_butter"),
                setup(new UsableItem(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1]).durability(5)), "butter"),
                setup(new UsableItem(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[4]).durability(25)), "beef_stew"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "takoyaki"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "takoyaki_coated"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "takoyaki_cheese_flavored"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "octopus"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "tako"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "oil"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "cheese"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "cup_noodles"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "cup_noodles_curry"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "gorilla_cookies"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "anpan"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "ramen"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "rice_bowl"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[2])), "rice_flavored"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[0])), "soybean_paste"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "garlic"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[0])), "nori"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[0])), "spinach"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "char_siu"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[3])), "xiaolongbao"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[4])), "xiaolongbao_flavored"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.BEER)), "cheap_beer"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                /*
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                setup(new Item(new Item.Properties().tab(Main.GROUP).food(Foods.JUST_NUTRITION[1])), "marshmellow_toasted"),
                */
                setup(new UsableItem(new Item.Properties().tab(Main.GROUP).durability(500)), "knife"),
                setup(new Item(new Item.Properties().tab(Main.GROUP)), "excalibur"),
                setup(new Item(new Item.Properties().tab(Main.GROUP)), "bubble_wrap")
            );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name)
    {
        return setup(entry, new ResourceLocation(Reference.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
    {
        entry.setRegistryName(registryName);
        return entry;
    }
}