package zhy2002.examples.lodgement;

import com.google.gwt.core.client.EntryPoint;
import zhy2002.examples.interop.JsMethods;


import java.util.logging.Level;
import java.util.logging.Logger;

public class LodgementEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("LodgementEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "GWT module will call JsMethods.startLodgement.");
        JsMethods.startLodgement();
    }
}
