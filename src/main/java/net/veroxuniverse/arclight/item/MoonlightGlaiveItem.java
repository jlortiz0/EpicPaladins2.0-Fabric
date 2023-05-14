package net.veroxuniverse.arclight.item;

import com.google.common.collect.ImmutableMultimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.UUID;
import java.util.function.Consumer;

public class MoonlightGlaiveItem extends SwordItem implements IAnimatable {

    // TODO: Change these
    private static final UUID REACH_MODIFIER_ID = UUID.fromString("E70BE4E9-B163-4CC1-8848-F860B0BC02FC");
    private static final UUID ATTACK_RANGE_MODIFIER_ID = UUID.fromString("7CB7BC58-D3BA-40AE-BC95-F8C38fE144FF");

    private final AnimationFactory FACTORY = GeckoLibUtil.createFactory(this);

    public MoonlightGlaiveItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(this.getAttributeModifiers(EquipmentSlot.MAINHAND));
        builder.put(ReachEntityAttributes.REACH, new EntityAttributeModifier(REACH_MODIFIER_ID, "Weapon modifier", 6, EntityAttributeModifier.Operation.ADDITION));
        builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier(ATTACK_RANGE_MODIFIER_ID, "Weapon modifier", 4, EntityAttributeModifier.Operation.ADDITION));
        builder.putAll(this.attributeModifiers);
        this.attributeModifiers = builder.build();
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        //event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.STOP;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.FACTORY;
    }
}
