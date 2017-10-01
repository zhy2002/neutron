package zhy2002.neutron.core.interop;

import com.google.gwt.core.client.EntryPoint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NeutronEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("NeutronEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "GWT module will call JsMethods.createUI.");
        JsMethods.createUI();
    }
}
