package zhy2002.neutron;

/**
 * Created by john.zhang on 27/11/2016.
 */
public abstract class StateChangeEventFactory<T> {

    public abstract StateChangeEvent<T> create(UiNode<?> target, String key, T oldValue, T newValue);
}