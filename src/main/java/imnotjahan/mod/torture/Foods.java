package imnotjahan.mod.torture;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods
{
    /**
     *     Simple foods that just provide nutrition and no other saturation or effects
      */
    public static final Food JUST_NUTRITION[] = new Food[10];
    static // Appends foods with varing levels of nutrition
    {
        for(int k = 0; k < 10; k++)
        {
            JUST_NUTRITION[k] = (new Food.Builder()).nutrition(k).build();
        }
    }

    public static final Food BEER = (new Food.Builder()).alwaysEat().effect(
            new EffectInstance(Effects.CONFUSION, 300), 1).build();
}
