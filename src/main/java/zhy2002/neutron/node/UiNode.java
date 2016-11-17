package zhy2002.neutron.node;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.NodeLifeStateEnum;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.rule.UiNodeRule;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode<?>> {

    /**
     * The parent ui node.
     */
    private final P parent;
    /**
     * The name of this node. Name is immutable and it uniquely identify a node in parent.
     */
    private final String name;
    /**
     * The context instance shared by the whole UiNode tree.
     */
    private final UiNodeContext<?> context;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, ? super Object> state = new HashMap<>();
    /**
     * The unique id of this node. This is set when this node is added to the node tree.
     */
    private String uniqueId;
    /**
     * Life state of this node.
     */
    private NodeLifeStateEnum lifeState;

    private ChangeTrackModeEnum changeTrackMode = ChangeTrackModeEnum.Reference;

    private final List<UiNodeRule<?, ?>> hostedRules = new ArrayList<>();
    private final Map<EventTypeEnum, List<UiNodeRule<?, ?>>> attachedRuleMap = new HashMap<>();

    /**
     * The constructor for a child node.
     *
     * @param parent the parent node.
     * @param name   unique name within parent.
     */
    protected UiNode(@NotNull P parent, @NotNull String name) {
        this(parent, parent.getContext(), name);
    }

    /**
     * The constructor used for a root node.
     *
     * @param context the context instance.
     */
    protected UiNode(@NotNull UiNodeContext<?> context) {
        this(null, context, "");
    }

    private UiNode(P parent, UiNodeContext<?> context, String name) {
        this.parent = parent;
        this.context = context;
        this.name = name;
        this.lifeState = NodeLifeStateEnum.Detached;
    }

    public
    @NotNull
    P getParent() {
        return parent;
    }

    public
    @NotNull
    UiNodeContext<?> getContext() {
        return context;
    }

    //region state methods

    protected <T> T getStateValueInternal(String key) {
        return (T) state.get(key);
    }

    public void setStateValueInternal(String key, Object value) {
        state.put(key, value);
    }

    public ChangeTrackModeEnum getChangeTrackMode() {
        return changeTrackMode;
    }

    public void setChangeTrackMode(ChangeTrackModeEnum changeTrackMode) {
        this.changeTrackMode = changeTrackMode;
    }

    protected <T> T getStateValue(String key) {
        return getStateValueInternal(key);
    }

    protected <T> void setStateValue(String key, T value) {
        T oldValue = getStateValueInternal(key);
        boolean process = false;
        switch (this.changeTrackMode) {
            case Always:
                process = true;
                break;
            case Reference:
                process = oldValue != value;
                break;
            case Value:
                if (oldValue == null) {
                    process = value != null;
                } else {
                    process = !oldValue.equals(value);
                }
                break;
            case None:
                setStateValueInternal(key, value);
        }
        if (!process)
            return;
        StateChangeEvent<T> event = getStateChangeEvent(oldValue, value);
        getContext().processEvent(event);

    }

    private <T> StateChangeEvent<T> getStateChangeEvent(T oldValue, T value) {
        StateChangeEvent<T> event = new StateChangeEvent<>(this, DefaultUiNodeStateKeys.VALUE);
        event.setOldValue(oldValue);
        event.setNewValue(value);
        return event;
    }

    //endregion


    //region identity methods

    public String getUniqueId() {
        return uniqueId;
    }

    public int getIndex() {
        if (parent != null) {
            return parent.indexOf(this);
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    //endregion

    //region life cycle methods

    public NodeLifeStateEnum getLifeState() {
        return lifeState;
    }

    public void addToParent() {
        if (this.lifeState != NodeLifeStateEnum.Detached)
            return;

        this.uniqueId = context.getUniqueId();
        if (parent == null) {
            //todo root node establish relation with context
        } else {
            this.parent.addChild(this);
        }
        this.lifeState = NodeLifeStateEnum.Unload;
    }

    public void removeFromParent() {
        if (this.lifeState != NodeLifeStateEnum.Unload)
            return;

        if (parent == null) {

        } else {
            if (!parent.supportRemoveChild()) //does not support
                return;
            this.parent.removeChild(this);
        }
        this.lifeState = NodeLifeStateEnum.Detached;
    }

    /**
     * Calling this method with transition from Unloaded to Loaded.
     */
    public void load() {
        if (this.lifeState != NodeLifeStateEnum.Unload)
            return;
        doLoad();
        this.lifeState = NodeLifeStateEnum.Loaded;
    }

    /**
     * Life cycle method that make this node ready for interaction.
     */
    protected abstract void doLoad();

    /**
     * Calling this method will transition from Loaded to Unloaded.
     */
    public void unload() {
        if (this.lifeState != NodeLifeStateEnum.Loaded)
            return;
        doUnload();
        this.lifeState = NodeLifeStateEnum.Unload;
    }

    /**
     * Undo what initialize() did.
     */
    protected abstract void doUnload();

    public Iterable<UiNodeRule<?, ?>> getAttachedRules(EventTypeEnum eventType) {
        List<UiNodeRule<?, ?>> list = attachedRuleMap.get(eventType);
        return list == null ? Collections.emptyList() : list;
    }

    public <T extends UiNode<?>, E extends UiNodeEvent> void addRule(UiNodeRule<E, T> rule) {
        hostedRules.add(rule);
    }

    public <T extends UiNode<?>> void removeRule(UiNodeRule<?, T> rule) {
        hostedRules.remove(rule);
    }

    public <T extends UiNode<?>> void attachRule(UiNodeRule<?, T> rule) {
        assert rule.getHost() == this;
        List<UiNodeRule<?, ?>> list = attachedRuleMap.get(rule.getEventType());
        if (list == null) {
            list = new ArrayList<>();
            attachedRuleMap.put(rule.getEventType(), list);
        }
        list.add(rule);
    }

    public <T extends UiNode<?>> void detachRule(UiNodeRule<?, T> rule) {
        assert rule.getHost() == this;
        List<UiNodeRule<?, ?>> list = attachedRuleMap.get(rule.getEventType());
        if (list != null) {
            list.remove(rule);
        }
    }

    //endregion
}
