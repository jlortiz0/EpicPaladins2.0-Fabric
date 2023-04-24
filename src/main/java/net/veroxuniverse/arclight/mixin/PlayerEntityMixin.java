package net.veroxuniverse.arclight.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.veroxuniverse.arclight.init.ArmorMaterialsInit;
import net.veroxuniverse.arclight.util.ArmorUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Shadow public abstract Iterable<ItemStack> getArmorItems();

    @Inject(method="checkFallFlying", at=@At("TAIL"), cancellable = true)
    private void checkAngelWing(CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValueZ()) return;
        if (ArmorUtils.hasCorrectArmorOn(ArmorMaterialsInit.ANGEL, (PlayerEntity) (Object) this)) {
            cir.setReturnValue(true);
        }
    }
}
