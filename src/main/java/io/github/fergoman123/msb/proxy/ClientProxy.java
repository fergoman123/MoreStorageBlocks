package io.github.fergoman123.msb.proxy;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.msb.MSB;
import io.github.fergoman123.msb.event.OnItemTooltipEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities() {

    }

    @Override
    public void registerRenderers() {
        MSB.instance.getModelRegister().registerModels();
    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(OnItemTooltipEvent.instance);
    }


}
