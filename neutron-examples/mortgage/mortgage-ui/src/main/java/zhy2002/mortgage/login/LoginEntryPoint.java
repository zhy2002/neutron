package zhy2002.mortgage.login;


import com.google.gwt.core.client.EntryPoint;
import zhy2002.mortgage.interop.JsMethods;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("LoginEntryPoint");

    @Override
    public void onModuleLoad() {
        logger.log(Level.INFO, "GWT module will call JsMethods.startLogin.");
        JsMethods.startLogin();
    }
}
