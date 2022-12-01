package net.coderang.tutorialmod.effect;

import net.coderang.tutorialmod.TutorialMod;
import net.coderang.tutorialmod.effect.custom.SpeedStatusEffect;
import net.minecraft.entity.effect.StatusEffect;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModStatusEffect {
    public static final StatusEffect SPEED_STATUS_EFFECT = registerStatusEffect("speed_status_effect", new SpeedStatusEffect());
    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(TutorialMod.MOD_ID, name), statusEffect);
    }
    public static void registerModStatusEffect() {
        TutorialMod.LOGGER.info("Registering mod status effect for " + TutorialMod.MOD_ID);
    }

}
