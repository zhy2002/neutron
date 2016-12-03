package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.register.UiNodeChangeListener;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode<?>> {

    private static final ChangeTrackingModeEnum DEFAULT_CHANGE_TRACKING_MODE = ChangeTrackingModeEnum.Reference;

    /**
     * The parent ui node.
     */
    private final P parent;
    /**
     * The name of this node. Name is immutable and it uniquely identify a node in parent.
     */
    private final String name;
    /**
     * The unique id of this node. This is setInstance when this node is added to the node tree.
     */
    private String uniqueId;
    /**
     * The context instance shared by the whole UiNode tree.
     */
    private final AbstractUiNodeContext<?> context;
    /**
     * Life state of this node.
     */
    private NodeStatusEnum nodeStatus;
    /**
     * Determines what is perceived as 'change' for this node.
     * This is the configured value.
     */
    private ChangeTrackingModeEnum changeTrackingMode = ChangeTrackingModeEnum.Inherited;
    /**
     * This is the computed value.
     */
    private ChangeTrackingModeEnum effectiveChangeTrackingMode;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, Object> state = new HashMap<>();
    /**
     * Rules owned by this node.
     */
    private final List<UiNodeRule<?, ?>> ownRules = new ArrayList<>();
    /**
     * Rules attached to this (host) node. Keyed by event class name.
     */
    private final Map<Class<?>, List<UiNodeRule<?, ?>>> attachedRuleMap = new HashMap<>();
    /**
     * Listeners that to be notified when this node changes.
     * At the moment node change means state change, add child or remove child.
     */
    private final List<UiNodeChangeListener> changeListeners = new ArrayList<>();

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
    protected UiNode(@NotNull AbstractUiNodeContext<?> context) {
        this(null, context, "");
    }

    private UiNode(P parent, AbstractUiNodeContext<?> context, String name) {
        this.parent = parent;
        this.context = context;
        this.name = name;
        this.nodeStatus = NodeStatusEnum.Detached;
    }

    @JsMethod
    public
    @NotNull
    P getParent() {
        return parent;
    }

    public
    @NotNull
    AbstractUiNodeContext<?> getContext() {
        return context;
    }

    @JsMethod
    @NotNull
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(@NotNull String id) {
        if (nodeStatus != NodeStatusEnum.Detached)
            throw new UiNodeException("Cannot set unique id if the node is not detached.");
        this.uniqueId = id;
    }

    @JsMethod
    public int getIndex() {
        if (parent != null) {
            return parent.indexOf(this);
        }
        return -1;
    }

    @JsMethod
    @NotNull
    public String getName() {
        return name;
    }

    public
    @NotNull
    ChangeTrackingModeEnum getChangeTrackingMode() {
        if (effectiveChangeTrackingMode == null) {
            if (changeTrackingMode != ChangeTrackingModeEnum.Inherited) {
                effectiveChangeTrackingMode = changeTrackingMode;
            } else {
                ParentUiNode<?> parent = getParent();
                while (parent != null && parent.getChangeTrackingMode() == ChangeTrackingModeEnum.Inherited) {
                    parent = parent.getParent();
                }
                if (parent == null) {
                    effectiveChangeTrackingMode = DEFAULT_CHANGE_TRACKING_MODE;
                } else {
                    effectiveChangeTrackingMode = parent.getChangeTrackingMode();
                }
            }
        }
        return effectiveChangeTrackingMode;
    }

    public void setChangeTrackingMode(@NotNull ChangeTrackingModeEnum changeTrackingMode) {
        if (this.changeTrackingMode != changeTrackingMode) {
            this.changeTrackingMode = changeTrackingMode;
            this.effectiveChangeTrackingMode = null;
        }
    }

    //region state methods

    @SuppressWarnings("unchecked")
    protected <T> T getStateValueInternal(String key) {
        return (T) state.get(key);
    }

    /**
     * Bypass event processing and set the value directly.
     *
     * @param key   state property key.
     * @param value state property value.
     */
    protected void setStateValueInternal(String key, Object value) {
        state.put(key, value);
    }

    protected <T> T getStateValue(String key) {
        return getStateValueInternal(key);
    }

    protected <T> void setStateValue(String key, Class<T> valueClass, T value) {

        if (this.getNodeStatus() != NodeStatusEnum.Loaded) {
            setStateValueInternal(key, value);
            return;
        }

        TickPhase phase = getContext().getCurrentPhase();
        if (phase != null) {
            ChangeModeEnum changeMode = phase.getChangeMode();
            switch (changeMode) {
                case DIRECT:
                    setStateValueInternal(key, value);
                    return;
                case IGNORED:
                    return;
                case PROHIBITED:
                    throw new UiNodeEventException(); //todo specialized exception type
            }
        }

        //default logic
        T oldValue = getStateValueInternal(key);
        boolean process = false;
        switch (getChangeTrackingMode()) {
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
        StateChangeEvent<T> event;
        event = context.createStateChangeEvent(this, key, valueClass, oldValue, value);
        getContext().processEvent(event);
    }

    //endregion

    //region life cycle methods

    public
    @NotNull
    NodeStatusEnum getNodeStatus() {
        return nodeStatus;
    }

    /**
     * The second step of adding a node to its parent.
     * When this is done the node still needs to be loaded (its own content, rules, children and initial values).
     */
    protected void addToParent() {
        if (this.nodeStatus != NodeStatusEnum.Detached)
            return;

        if (this.uniqueId == null) {
            this.uniqueId = context.getUniqueId();
        } else {
            //todo if uniqueId is not unique, throw an exception
        }

        if (parent == null) {
            //do nothing for root
        } else {
            this.parent.addChild(this);
        }
        this.nodeStatus = NodeStatusEnum.Unloaded;
    }

    /**
     * Return to step 1 status.
     */
    protected void removeFromParent() {
        if (this.nodeStatus != NodeStatusEnum.Unloaded || parent == null)
            return;

        this.parent.removeChild(this);
        this.nodeStatus = NodeStatusEnum.Detached;
    }

    /**
     * Calling this method with transition from Unloaded to Loaded.
     */
    public final void load() {
        if (this.nodeStatus != NodeStatusEnum.Unloaded)
            return;
        doLoad();
        this.nodeStatus = NodeStatusEnum.Loaded;
    }

    protected void doLoad() {
        initializeState();
        createOwnRules().forEach(UiNodeRule::addToOwner);
    }

    protected void initializeState() {
    }

    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return new ArrayList<>();
    }

    /**
     * Calling this method will transition from Loaded to Unloaded.
     */
    public final void unload() {
        if (this.nodeStatus != NodeStatusEnum.Loaded)
            return;
        doUnload();
        this.nodeStatus = NodeStatusEnum.Unloaded;
    }

    protected void doUnload() {
        List<UiNodeRule<?, ?>> ownRules = new ArrayList<>(this.ownRules);
        ownRules.forEach(UiNodeRule::removeFromOwner);
        this.state.clear();
    }

    public void attach() {
        addToParent();
        load();
    }

    public void detach() {
        unload();
        removeFromParent();
    }

    <T extends UiNode<?>, E extends UiNodeEvent> void addRule(@NotNull UiNodeRule<E, T> rule) {
        assert this == rule.getOwner();
        ownRules.add(rule);
    }

    <T extends UiNode<?>> void removeRule(@NotNull UiNodeRule<?, T> rule) {
        assert this == rule.getOwner();
        ownRules.remove(rule);
    }

    <T extends UiNode<?>> void attachRule(UiNodeRule<?, T> rule) {
        assert rule.getHost() == this;
        for (Class<?> eventType : rule.observedEventTypes()) {
            List<UiNodeRule<?, ?>> list = attachedRuleMap.computeIfAbsent(eventType, k -> new ArrayList<>());
            list.add(rule);
        }
    }

    <T extends UiNode<?>> void detachRule(UiNodeRule<?, T> rule) {
        assert rule.getHost() == this;
        for (Class<?> eventType : rule.observedEventTypes()) {
            List<UiNodeRule<?, ?>> list = attachedRuleMap.get(eventType);
            if (list != null) {
                list.remove(rule);
            }
        }
    }

    Iterable<UiNodeRule<?, ?>> getAttachedRules(Class<?> clazz) {
        List<UiNodeRule<?, ?>> list = attachedRuleMap.get(clazz);
        return list == null ? Collections.emptyList() : list;
    }

    @JsMethod
    public void refresh() {
        RefreshUiNodeEvent refreshUiNodeEvent = new RefreshUiNodeEvent(this);
        getContext().processEvent(refreshUiNodeEvent);
    }

    @JsMethod
    public void addChangeListener(UiNodeChangeListener listener) {
        this.changeListeners.add(listener);
    }

    void notifyChange() {
        for (UiNodeChangeListener listener : changeListeners) {
            listener.onUiNodeChanged();
        }
    }

    //endregion

}
