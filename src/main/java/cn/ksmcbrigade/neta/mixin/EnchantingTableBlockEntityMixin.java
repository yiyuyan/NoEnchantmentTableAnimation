package cn.ksmcbrigade.neta.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.EnchantingTableBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnchantingTableBlockEntity.class)
public class EnchantingTableBlockEntityMixin {
    @Inject(method = "tick",at = @At("HEAD"),cancellable = true)
    private static void tick(World world, BlockPos pos, BlockState state, EnchantingTableBlockEntity blockEntity, CallbackInfo ci){
        ci.cancel();
    }
}
