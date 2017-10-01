package zhy2002.neutron.core;

public class UiNodeNotification {

    private UiNode<?> origin;
    private String name;
    private Object parameter;

    UiNodeNotification(UiNode<?> origin, String name, Object parameter) {
        assert origin != null;
        assert name != null;

        this.origin = origin;
        this.name = name;
        this.parameter = parameter;
    }

    public UiNode<?> getOrigin() {
        return origin;
    }

    public void setOrigin(UiNode<?> origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    void send() {
        for(UiNodeNotificationListener listener : origin.getNotificationListeners(name)) {
            listener.onNotify(parameter);
        }
    }
}
