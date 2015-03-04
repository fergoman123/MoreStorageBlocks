package io.github.fergoman123.msb.proxy;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.msb.event.OnItemTooltipEvent;

import java.util.ArrayList;

public class ClientProxy extends CommonProxy{

    private static ArrayList<BlockModel> blocksToRegister = new ArrayList();

    @Override
    public void registerTileEntities() {

    }

    @Override
    public void registerRenderers() {
    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(OnItemTooltipEvent.instance);
    }


}
