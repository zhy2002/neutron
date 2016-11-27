package zhy2002.examples.register;

import zhy2002.neutron.*;
import zhy2002.neutron.event.StringStateChangeEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Context and Root are a pair. This whole class is generated.
 */
public class RegisterNodeContext extends UiNodeContextImpl<RegisterNode> {

    public RegisterNodeContext(FactoryRegistry factoryRegistry) {
        super(factoryRegistry);
        initializeFactoryMap();
        initializeStateChangeEventFactory();
    }

    //region default node factories

    private void initializeFactoryMap() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
    }

    private static abstract class StateChangeEventFactory<T> {

        public abstract StateChangeEvent<T> create(UiNode<?> target, String key, T oldValue, T newValue);
    }

    private Map<Class, StateChangeEventFactory> stateChangeEventFactoryMap = new HashMap<>();

    private void initializeStateChangeEventFactory() {
        stateChangeEventFactoryMap.put(String.class, new StateChangeEventFactory<String>() {
            @Override
            public StateChangeEvent<String> create(UiNode target, String key, String oldValue, String newValue) {
                StringStateChangeEvent event = new StringStateChangeEvent(target, key);
                event.setOldValue(oldValue);
                event.setNewValue(newValue);
                return event;
            }
        });
    }

    //endregion

    protected RegisterNode createRootNode() {
        return new RegisterNode(this);
    }


    @Override
    public <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<? super T> valueClass, T oldValue, T newValue) {
        StateChangeEventFactory<T> factory = (StateChangeEventFactory<T>)stateChangeEventFactoryMap.get(valueClass);
        return factory.create(target, key, oldValue, newValue);
    }
}
