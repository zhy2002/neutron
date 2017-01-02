package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * Base class for all ui nodes.
 * You should only access a node property via its getter and setter.
 */
public abstract class UiNode<P extends ParentUiNode<?>> implements UiNodeProperties {

    private static final ChangeTrackingModeEnum DEFAULT_CHANGE_TRACKING_MODE = ChangeTrackingModeEnum.Reference;

    private final P parent;
    private final String name;
    private String uniqueId;
    private final UiNodeContext<?> context;
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

    private boolean forceChangeTracking;

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
    }

    /**
     * The parent ui node.
     */
    @JsMethod
    public
    @NotNull
    P getParent() {
        return parent;
    }

    /**
     * The name of this node. Name is immutable and it uniquely identify a node in parent.
     */
    @JsMethod
    @NotNull
    public String getName() {
        return name;
    }

    /**
     * The unique id of this node. This is setInstance when this node is added to the node tree.
     */
    @JsMethod
    @NotNull
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(@NotNull String id) {
        if (nodeStatus != NodeStatusEnum.Detached)
            throw new UiNodeException("Cannot set unique id if the node is not detached.");
        //todo ensure id is not already used and will not be used by other nodes.
        this.uniqueId = id;
    }

    /**
     * The context instance shared by the whole UiNode tree.
     */
    @JsMethod
    public
    @NotNull
    UiNodeContext<?> getContext() {
        return context;
    }


    @JsMethod
    public int getIndex() {
        if (parent != null) {
            return parent.indexOf(this);
        }
        return -1;
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

    @JsMethod
    public void alwaysTrackChangeOnce() {
        this.forceChangeTracking = true;
    }

    public <T> void setStateValue(String key, Class<T> valueClass, T value) {

        if (shouldChangeWithoutEvent()) {
            setStateValueInternal(key, value);
            return;
        }

        //default logic
        T oldValue = getStateValueInternal(key);
        boolean process = false;
        ChangeTrackingModeEnum nodeChangeTrackingMode = getChangeTrackingMode();
        if (this.forceChangeTracking) {
            nodeChangeTrackingMode = ChangeTrackingModeEnum.Always;
            this.forceChangeTracking = false;
        }
        switch (nodeChangeTrackingMode) {
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

    /**
     * Life state of this node.
     */
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

        ValidationErrorList validationErrors = this.getValidationErrorList();
        if (validationErrors != null) {
            for (ValidationError validationError : validationErrors) {
                UiNode<?> errorNode = validationError.getErrorNode();
                if (errorNode != null) {
                    if (errorNode.getParent() instanceof ListUiNode<?, ?, ?>) {
                        ListUiNode<?, ?, ?> parent = (ListUiNode<?, ?, ?>) errorNode.getParent();
                        parent.removeByName(errorNode.getName());
                    } else {
                        errorNode.detach();
                    }
                }
            }
        }

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

    @JsMethod
    @Override
    public String getNodeLabel() {
        String label = getStateValue(PredefinedEventSubjects.NODE_LABEL);
        if (label != null)
            return label;

        return ValueUtil.nodeNameToLabel(this.getName());
    }

    @JsMethod
    @Override
    public void setNodeLabel(String value) {
        setStateValue(PredefinedEventSubjects.NODE_LABEL, String.class, value);
    }

    @JsMethod
    @Override
    public String getPathLabel() {
        String label = getStateValue(PredefinedEventSubjects.PATH_LABEL);
        if (label != null)
            return label;

        return createDefaultNodeLabel();
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
                result.append(" > ");
            }
            result.append(nodeLabels.pop());
        }
        return result.toString();
    }

    @JsMethod
    @Override
    public void setPathLabel(String value) {
        setStateValue(PredefinedEventSubjects.PATH_LABEL, String.class, value);
    }

    @JsMethod
    @Override
    public ValidationErrorList getValidationErrorList() {
        return getStateValue(PredefinedEventSubjects.VALIDATION_ERROR_LIST, ValidationErrorList.EMPTY);
    }

    @Override
    public void setValidationErrorList(ValidationErrorList errors) {
        setStateValue(PredefinedEventSubjects.VALIDATION_ERROR_LIST, ValidationErrorList.class, errors);
    }

//endregion
}
