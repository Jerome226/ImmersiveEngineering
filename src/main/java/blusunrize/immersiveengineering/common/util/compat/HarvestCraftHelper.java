package blusunrize.immersiveengineering.common.util.compat;

import blusunrize.immersiveengineering.api.energy.DieselHandler;
import blusunrize.immersiveengineering.common.IEContent;
import net.minecraftforge.fluids.FluidStack;

public class HarvestCraftHelper extends IECompatModule {
    @Override
    public void preInit() {}

    @Override
    public void init() {
        DieselHandler.addSqueezerRecipe("listAllseed", 80, new FluidStack(IEContent.fluidPlantoil, 80), null);
        DieselHandler.addFermenterRecipe("listAllfruit", 80, new FluidStack(IEContent.fluidEthanol, 80), null);
        DieselHandler.addFermenterRecipe("listAllgrain", 80, new FluidStack(IEContent.fluidEthanol, 80), null);
    }

    @Override
    public void postInit() {}
}
