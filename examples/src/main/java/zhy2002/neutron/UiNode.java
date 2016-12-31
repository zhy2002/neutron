package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode<?>> implements UiNodeProperties {

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
    private final UiNodeContext<?> context;
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
     * A copy of state before load happens.
     */
    private Map<String, Object> preState;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, Object> state = new HashMap<>();
    /**
     * Rules owned by this node.
     */
    private final List<UiNodeRule<?>> ownRules = new ArrayList<>();
    /**
     * Rules attached to this (host) node. Keyed by event class name.
     */
    private final Map<UiNodeEventKey<?>, List<EventBinding>> attachedEventBindings = new HashMap<>();
    /**
     * Listeners that to be notified when this node changes.
     * At the moment node change means state change, add child or remove child.
     */
    private final List<UiNodeChangeListener> changeListeners = new ArrayList<>();

    private UiNodeStatusListener statusListener;

    protected final String defaultNodeLabel;

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
        this.nodeStatus = NodeStatusEnum.Detached;

        this.defaultNodeLabel = createDefaultNodeLabel();
    }

    private String createDefaultNodeLabel() {

        Stack<String> nodeLabels = new Stack<>();

        UiNode<?> node = this;
        do {
            nodeLabels.push(ValueUtil.nodeNameToLabel(node.getName()));
            node = node.getParent();
        } while (node != null);

        StringBuilder result = new StringBuilder();
        while (!nodeLabels.isEmpty()) {
            if (result.length() > 0) {
                result.append(" / ");
            }
            result.append(nodeLabels.pop());
        }
        return result.toString();
    }

    @JsMethod
    public
    @NotNull
    P getParent() {
        return parent;
    }

    @JsMethod
    public
    @NotNull
    UiNodeContext<?> getContext() {
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

    void setStatusListener(UiNodeStatusListener listener) {
        this.statusListener = listener;
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

    public boolean getLoadWithParent() {
        Object value = this.getStateValueInternal(PredefinedEventSubjects.LOAD_WITH_PARENT);
        return !Boolean.FALSE.equals(value);
    }

    public void setLoadWithParent(boolean value) {
        this.setStateValueInternal(PredefinedEventSubjects.LOAD_WITH_PARENT, value);
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

    @JsMethod
    public <T> T getStateValue(String key) {
        return getStateValue(key, null);
    }

    public <T> T getStateValue(String key, T defaultValue) {
        T value = getStateValueInternal(key);
        return value == null ? defaultValue : value;
    }

    protected final boolean shouldChangeWithoutEvent() {
        if (this.getNodeStatus() != NodeStatusEnum.Loaded) {
            return true;
        }

        TickPhase phase = getContext().getCurrentPhase();
        if (phase != null) {
            ChangeModeEnum changeMode = phase.getChangeMode();
            switch (changeMode) {
                case DIRECT:
                    return true;
                case PROHIBITED:
                    throw new UiNodeEventException(); //todo specialized exception type
            }
        }
        return false;
    }

    protected <T> void setStateValue(String key, Class<T> valueClass, T value) {

        if (shouldChangeWithoutEvent()) {
            setStateValueInternal(key, value);
            return;
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

    @JsMethod
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
        if (statusListener != null) {
            statusListener.onAddedToParent();
        }
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
        if (preState == null) {
            preState = new HashMap<>(state);
        }
        doLoad();
        this.nodeStatus = NodeStatusEnum.Loaded;
    }

    protected void doLoad() {
        initializeState();
        createOwnRules().forEach(UiNodeRule::addToOwner);
    }

    protected void initializeState() {
    }

    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return new EnhancedLinkedList<>();
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
        List<UiNodeRule<?>> ownRules = new ArrayList<>(this.ownRules);
        ownRules.forEach(UiNodeRule::removeFromOwner);
        this.state.clear();
        assert this.preState != null;
        this.state.putAll(this.preState);
    }

    void attach() {
        addToParent();
        load();
    }

    void detach() {
        unload();
        removeFromParent();
    }

    <T extends UiNode<?>> void addRule(@NotNull UiNodeRule<T> rule) {
        assert this == rule.getOwner();
        ownRules.add(rule);
    }

    <T extends UiNode<?>> void removeRule(@NotNull UiNodeRule<T> rule) {
        assert this == rule.getOwner();
        ownRules.remove(rule);
    }

    <T extends UiNode<?>> void attachRule(UiNodeRule<T> rule) {
        assert rule.getHost() == this;

        for (EventBinding binding : rule.getEventBindings()) {
            for (UiNodeEventKey<?> eventKey : binding.getEventKeys()) {
                List<EventBinding> bindingList = attachedEventBindings.computeIfAbsent(eventKey, k -> new ArrayList<>());
                bindingList.add(binding);
            }
        }
    }

    <T extends UiNode<?>> void detachRule(UiNodeRule<T> rule) {
        assert rule.getHost() == this;

        for (EventBinding binding : rule.getEventBindings()) {
            for (UiNodeEventKey<?> eventKey : binding.getEventKeys()) {
                List<EventBinding> bindingList = attachedEventBindings.get(eventKey);
                if (bindingList != null) {
                    bindingList.remove(binding);
                }
            }

        }
    }

    Iterable<EventBinding> getAttachedEventBindings(UiNodeEventKey<?> eventKey) {
        List<EventBinding> list = attachedEventBindings.get(eventKey);
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

    @JsMethod
    public void removeChangeListener(UiNodeChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    //endregion

    //region ui node properties

    @JsMethod
    @Override
    public String getVisibility() {
        return getStateValue(PredefinedEventSubjects.VISIBILITY, "visible");
    }

    @JsMethod
    @Override
    public void setVisibility(String value) {
        setStateValue(PredefinedEventSubjects.VISIBILITY, String.class, value);
    }

    /**
     * @return true if this Node if disabled in the ui.
     * This does not affect the node's ability to process
     * events in anyway though rules might behave differently
     * for different values.
     */
    @JsMethod
    @Override
    public boolean isDisabled() {
        return getStateValue(PredefinedEventSubjects.DISABLED, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setDisabled(boolean value) {
        setStateValue(PredefinedEventSubjects.DISABLED, Boolean.class, value);
    }

    @JsMethod
    @Override
    public boolean isReadonly() {
        return getStateValue(PredefinedEventSubjects.READONLY, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setReadonly(boolean value) {
        setStateValue(PredefinedEventSubjects.READONLY, Boolean.class, value);
    }

    /**
     * @return true if the content of this node is KNOWN to be invalid.
     */
    @JsMethod
    @Override
    public boolean isInvalid() {
        return getStateValue(PredefinedEventSubjects.INVALID, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setInvalid(boolean value) {
        setStateValue(PredefinedEventSubjects.INVALID, Boolean.class, value);
    }

    @JsMethod
    @Override
    public boolean isDirty() {
        return getStateValue(PredefinedEventSubjects.DIRTY, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setDirty(boolean value) {
        setStateValue(PredefinedEventSubjects.DIRTY, Boolean.class, value);
    }

    //endregion

    @JsMethod
    public ValidationErrorList getValidationErrorList() {
        return getStateValue(PredefinedEventSubjects.VALIDATION_ERROR_LIST);
    }

    public void setValidationErrorList(ValidationErrorList errors) {
        setStateValue(PredefinedEventSubjects.VALIDATION_ERROR_LIST, ValidationErrorList.class, errors);
    }

}
