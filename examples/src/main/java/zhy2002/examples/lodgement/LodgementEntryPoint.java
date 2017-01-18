package zhy2002.examples.lodgement;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import zhy2002.examples.interop.Window;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LodgementEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("LodgementEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "Loading test GWT module...");

        buildGwtUi();
    }

    private void buildGwtUi() {
        Window.startLodgement();
    }


}
