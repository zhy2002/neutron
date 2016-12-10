package zhy2002.neutron;

/**
 * A rule is linked to a set of event keys.
 * It can only fire if the event also matches the event key.
 */
public final class UiNodeEventKey {

    private final Class<? extends UiNodeEvent> eventClass;
    private final String ruleGroup;

    public UiNodeEventKey(Class<? extends UiNodeEvent> eventClass, String ruleGroup) {
        this.eventClass = eventClass;
        this.ruleGroup = ruleGroup;
    }

    public Class<? extends UiNodeEvent> getEventClass() {
        return eventClass;
    }

    public String getRuleGroup() {
        return ruleGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UiNodeEventKey that = (UiNodeEventKey) o;

        if (!eventClass.equals(that.eventClass)) return false;
        return ruleGroup.equals(that.ruleGroup);
    }

    @Override
    public int hashCode() {
        int result = eventClass.hashCode();
        result = 31 * result + ruleGroup.hashCode();
        return result;
    }
}
