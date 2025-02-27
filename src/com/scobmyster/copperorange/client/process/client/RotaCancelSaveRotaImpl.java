package com.scobmyster.copperorange.client.process.client;

import com.google.gwt.user.client.Window;
import com.scobmyster.copperorange.client.ScreenModelImpl;
import com.scobmyster.copperorange.client.process.ProcessModel;

public class RotaCancelSaveRotaImpl implements ProcessModel
{

    private ScreenModelImpl screenModel;

    @Override
    public void runProcess()
    {
        screenModel.getSavePop().hide();
    }

    public void setScreenModel(ScreenModelImpl screenModel) {
        this.screenModel = screenModel;
    }
}
