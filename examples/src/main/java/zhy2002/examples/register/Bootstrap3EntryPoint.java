package zhy2002.examples.register;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import zhy2002.examples.interop.Window;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bootstrap3EntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("Bootstrap3EntryPoint");
    private boolean exampleLoaded;

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "Loading test GWT module...");

        buildGwtUi();
    }

    private void buildGwtUi() {
        FlowPanel panel = new FlowPanel();
        panel.setStyleName("alert alert-info");

        panel.add(new Button("Register", (ClickHandler) clickEvent -> {
            if (exampleLoaded) {
                com.google.gwt.user.client.Window.alert("Example is already loaded.");
                return;
            }
            exampleLoaded = true;
            Window.startRegister();
        }));

        RootPanel.get().add(panel);
    }


}