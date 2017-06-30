package zhy2002.mortgage.manager;

import com.google.gwt.core.client.EntryPoint;
import zhy2002.mortgage.interop.JsMethods;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("ManagerEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "GWT module will call JsMethods.startManager.");
        JsMethods.startManager();
    }
}
