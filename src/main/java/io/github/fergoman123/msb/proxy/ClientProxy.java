package io.github.fergoman123.msb.proxy;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.msb.event.MSBEventHandler;
import io.github.fergoman123.msb.init.ModelRegister;
import io.github.fergoman123.msb.init.VariantRegister;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities() {

    }

    @Override
    public void registerRenderers() {
    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(new MSBEventHandler());
    }


}
