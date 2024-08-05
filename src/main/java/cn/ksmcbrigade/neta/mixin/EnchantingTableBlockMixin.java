package cn.ksmcbrigade.neta.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnchantingTableBlock.class)
public class EnchantingTableBlockMixin {
    @Inject(method = "randomDisplayTick",at = @At("HEAD"),cancellable = true)
    public void randomTick(BlockState state, World world, BlockPos pos, Random random, CallbackInfo ci){
        ci.cancel();
    }
}
