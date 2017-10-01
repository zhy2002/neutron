package zhy2002.neutron.examples.register;

import org.junit.Ignore;
import zhy2002.neutron.core.EngineEventModeEnum;
import zhy2002.neutron.examples.register.gen.RegisterNodeContext;

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
    public void emailIsRequiredIfCleared() {
    }


}