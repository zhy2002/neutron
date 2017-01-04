package zhy2002.examples.register;

import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.neutron.EngineEventModeEnum;

/**
 * Post version of RegisterCommonSendTest.
 */
public class RegisterCommonPostTest extends RegisterCommonSendTest {

    @Override
    protected RegisterNodeContext createContext() {
        RegisterNodeContext context = super.createContext();
        context.setEventMode(EngineEventModeEnum.Post);
        return context;
    }

    public void emailIsRequiredIfCleared(){}
}