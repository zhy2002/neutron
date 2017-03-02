package zhy2002.examples.lodgement;

import com.google.gwt.core.client.EntryPoint;
import zhy2002.examples.lodgement.interop.Window;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LodgementEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("LodgementEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "Loading test GWT module...");
        Window.startLodgement();
    }
}
