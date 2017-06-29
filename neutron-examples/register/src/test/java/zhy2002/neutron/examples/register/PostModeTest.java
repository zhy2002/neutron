package zhy2002.neutron.examples.register;

import org.junit.Ignore;
import org.junit.Test;
import zhy2002.neutron.examples.register.gen.RegisterNodeContext;
import zhy2002.neutron.EngineEventModeEnum;

import java.util.Set;

/**
 * Post version of SendModeTest.
 */
public class PostModeTest extends SendModeTest {

    @Override
    protected RegisterNodeContext createContext() {
        RegisterNodeContext context = super.createContext();
        context.setEventMode(EngineEventModeEnum.Post);
        return context;
    }

    /**
     * exclude test that will not work in post mode.
     */
    @Ignore
    public void emailIsRequiredIfCleared(){}



}