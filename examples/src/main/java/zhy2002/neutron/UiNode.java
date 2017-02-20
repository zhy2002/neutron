package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.data.NodeReference;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.logging.Logger;

/**
 * Base class for all ui nodes.
 * You should only access a node property via its getter and setter.
 */
public abstract class UiNode<P extends ParentUiNode<?>> implements UiNodeProperties {

    private static final Logger logger = Logger.getLogger("UiNode");
    private static final ChangeTrackingModeEnum DEFAULT_CHANGE_TRACKING_MODE = ChangeTrackingModeEnum.Reference;

    private final P parent;
    private final String name;
    private String uniqueId;
    private final UiNodeContext<?> context;
    private NodeStatusEnum nodeStatus;

    /**
     * Override property change tracking mode.
     */
    private final Map<String, ChangeTrackingModeEnum> propertyChangeTrackingMode = new HashMap<>();
    /**
     * A copy of state before loading.
     */
    private Map<String, Object> preState;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, Object> state = new HashMap<>();
    /**
     * Rules added to this node before its loading time.
     * These rules are cached here until this node is loaded.
     */
    private final List<UiNodeRule<?>> createdRules = new ArrayList<>();
    /**
     * Rules owned by this node.
     */
    private final List<UiNodeRule<?>> ownRules = new ArrayList<>();
    /**
     * Rules attached to this (host) node. Keyed by event class name.
     */
    private final Map<UiNodeEventKey<?>, List<EventBinding>> attachedEventBindings = new HashMap<>();
    /**
     * Offers a chance to run custom code on life cycle events.
     */
    private UiNodeStatusListener statusListener;
    /**
     * Listeners that to be notified when this node changes.
     * At the moment node change means state change, add child or remove child.
     */
    protected final List<UiNodeChangeListener> changeListeners = new ArrayList<>();
    /**
     * Cache the node reference.
     */
    private NodeReference nodeReference;

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

        setChangeTrackingMode(NeutronEventSubjects.HAS_VALUE, ChangeTrackingModeEnum.Value);
        setChangeTrackingMode(NeutronEventSubjects.REQUIRED, ChangeTrackingModeEnum.Value);
        setChangeTrackingMode(NeutronEventSubjects.DISABLED, ChangeTrackingModeEnum.Value);
    }

    /**
     * The parent ui node.
     */
    @JsMethod
    @NotNull
    public final P getParent() {
        return parent;
    }

    /**
     * The name of this node. Name is immutable and it uniquely identify a node in parent.
     */
    @JsMethod
    @NotNull
    public final String getName() {
        return name;
    }

    /**
     * The unique id of this node. This is setInstance when this node is added to the node tree.
     */
    @JsMethod
    @NotNull
    public final String getUniqueId() {
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
    @NotNull
    public final UiNodeContext<?> getContext() {
        return context;
    }

    /**
     * Life state of this node.
     */
    @JsMethod
    @NotNull
    public final NodeStatusEnum getNodeStatus() {
        return nodeStatus;
    }

    @NotNull
    private ChangeTrackingModeEnum getChangeTrackingMode(String propertyName) {
        ChangeTrackingModeEnum mode = propertyChangeTrackingMode.get(propertyName);
        if (mode == null)
            return DEFAULT_CHANGE_TRACKING_MODE;
        return mode;
    }

    protected final void setChangeTrackingMode(String propertyName, ChangeTrackingModeEnum changeTrackingMode) {
        this.propertyChangeTrackingMode.put(propertyName, changeTrackingMode);
    }

    final void setStatusListener(UiNodeStatusListener listener) {
        this.statusListener = listener;
    }

    final void addCreatedRule(UiNodeRule<?> createdRule) {
        createdRules.add(createdRule);
    }

    /**
     * @return the index in parent.
     */
    @JsMethod
    public final int getIndex() {
        Integer index = getStateValue(NeutronEventSubjects.INDEX);
        return index == null ? -1 : index;
    }

    //set by parent node
    final void setIndex(Integer index) {
        setStateValue(NeutronEventSubjects.INDEX, Integer.class, index);
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

    public <T> T getStateValue(String key, T defaultValue) {
        T value = getStateValueInternal(key);
        return value == null ? defaultValue : value;
    }

    @JsMethod
    public abstract boolean hasValue();

    @JsMethod
    public String getConcreteClassName() {
        return getConcreteClass().getName();
    }

    /**
     * The implementation is generated in code.
     *
     * @return the concrete class (the first without the parent type parameter) of this node.
     */
    public abstract Class<?> getConcreteClass();

    public NodeReference toNodeReference() {
        if (nodeReference == null) {
            nodeReference = new NodeReference(getConcreteClassName(), getName());
        }
        return nodeReference;
    }

    protected void setHasValue(boolean value) {
        setStateValue(NeutronEventSubjects.HAS_VALUE, Boolean.class, value);
    }

    @JsMethod
    public final <T> T getStateValue(String key) {
        return getStateValue(key, null);
    }

    @SuppressWarnings("unchecked")
    protected final <T> T getPreStateValue(String key) {
        return (T) preState.get(key);
    }

    /**
     * Trigger a state value change.
     *
     * @param key        identifier of the state value to change.
     * @param valueClass the class of the state value. This decides what type of state change event to trigger.
     * @param value      the new state value.
     * @param mode       a one time override of ChangeTrackingMode.
     * @param <T>        declared type of the value.
     */
    public <T> void setStateValue(String key, Class<T> valueClass, T value, ChangeTrackingModeEnum mode) {
        if (shouldChangeWithoutEvent()) {
            setStateValueInternal(key, value);
            return;
        }

        ChangeTrackingModeEnum nodeChangeTrackingMode = mode;
        if (nodeChangeTrackingMode == null) {
            nodeChangeTrackingMode = getChangeTrackingMode(key);
        }

        boolean process = false;
        T oldValue = getStateValueInternal(key);
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

    public final <T> void setStateValue(String key, Class<T> valueClass, T value) {
        setStateValue(key, valueClass, value, null);
    }

    /**
     * @return true if changes should be applied directly (i.e. bypass event processing).
     */
    final boolean shouldChangeWithoutEvent() {
        if (this.getNodeStatus() != NodeStatusEnum.Loaded || this.getParent() != null && this.getParent().getNodeStatus() != NodeStatusEnum.Loaded) {
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

    //endregion

    //region life cycle methods

    /**
     * The second step of adding a node to its parent.
     * When this is done the node still needs to be loaded (its own content, rules, children and initial values).
     */
    final void addToParent() {
        if (this.nodeStatus != NodeStatusEnum.Detached)
            return;

        if (this.uniqueId == null) {
            this.uniqueId = context.getUniqueId();
        } else {
            //todo check if pre-assigned id is truely unique.
        }

        if (parent == null) {
            //do nothing for root
        } else {
            this.parent.addChild(this);
        }

        if (statusListener != null) {
            statusListener.postAddToParent();
        }
        this.nodeStatus = NodeStatusEnum.Unloaded;
        getContext().getNodeFinder().registerNode(this);
    }

    /**
     * Return to step 1 status.
     * This method cannot be overridden because we need to notify
     * status listener at the end of this event.
     */
    final void removeFromParent() {
        if (this.nodeStatus != NodeStatusEnum.Unloaded || parent == null)
            return;

        this.parent.removeChild(this);

        //todo removed from parent status listener

        this.nodeStatus = NodeStatusEnum.Detached;
        getContext().getNodeFinder().deregisterNode(this);
        getContext().getNodeReferenceRegistry().postRemoveFromParent(this);
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

        initializeState();

        doLoad();
        if (statusListener != null) {
            statusListener.postLoad();
        }

        loadRules();

        this.nodeStatus = NodeStatusEnum.Loaded;
    }

    /**
     * Override this to run code before rules and children are loaded.
     */
    protected void initializeState() {
    }

    private void loadRules() {
        createRules(createdRules);
        if (statusListener != null) {
            statusListener.postCreateRules(createdRules);
        }

        createdRules.forEach(UiNodeRule::addToOwner);
        createdRules.clear();
    }

    @Inject
    UiNodeRuleProvider ruleProvider;

    /**
     * Override this method to add rules to be loaded.
     * The rules added to this list does not have to be owned by this node.
     * You can add rules to any node and they will be added
     *
     * @param createdRules the list of rule that will be loaded.
     */
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.addAll(ruleProvider.createRules(this));
    }

    /**
     * Override this method to run code at load time.
     */
    protected void doLoad() {
    }

    /**
     * Calling this method will transition from Loaded to Unloaded.
     */
    public final void unload() {
        if (this.nodeStatus != NodeStatusEnum.Loaded)
            return; //todo should return boolean to indicate this ro throw exception
        this.nodeStatus = NodeStatusEnum.Unloaded;
        doUnload();
    }

    /**
     * Override this method to do things before or after unload of this node.
     */
    protected void doUnload() {
        List<UiNodeRule<?>> ownRules = new ArrayList<>(this.ownRules);
        ownRules.forEach(UiNodeRule::removeFromOwner);
        clearValidationErrors();
        this.state.clear();
        assert this.preState != null;
        this.state.putAll(this.preState);
    }

    public void clearValidationErrors() {
        //also unload all nodes representing validation errors of this node.
        ValidationErrorList validationErrors = this.getValidationErrorList();
        if (validationErrors != null) {
            for (ValidationError validationError : validationErrors) {
                UiNode<?> errorNode = validationError.getErrorNode();
                if (errorNode != null) {
                    if (errorNode.getParent() instanceof ListUiNode<?, ?>) {
                        ListUiNode<?, ?> parent = (ListUiNode<?, ?>) errorNode.getParent();
                        parent.removeByName(errorNode.getName());
                    } else {
                        errorNode.detach();
                    }
                }
            }
        }
        this.setValidationErrorList(null);
    }

    final void attach() {
        addToParent();
        load();
    }

    final void detach() {
        unload();
        removeFromParent();
    }

    final <T extends UiNode<?>> void addRule(@NotNull UiNodeRule<T> rule) {
        assert this == rule.getOwner();
        ownRules.add(rule);
    }

    final <T extends UiNode<?>> void removeRule(@NotNull UiNodeRule<T> rule) {
        assert this == rule.getOwner();
        ownRules.remove(rule);
    }

    final <T extends UiNode<?>> void attachRule(UiNodeRule<T> rule) {
        assert rule.getHost() == this;

        for (EventBinding binding : rule.getEventBindings()) {
            for (UiNodeEventKey<?> eventKey : binding.getEventKeys()) {
                List<EventBinding> bindingList = attachedEventBindings.computeIfAbsent(eventKey, k -> new ArrayList<>());
                bindingList.add(binding);
            }
        }
    }

    final <T extends UiNode<?>> void detachRule(UiNodeRule<T> rule) {
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

    final Iterable<EventBinding> getAttachedEventBindings(UiNodeEventKey<?> eventKey) {
        List<EventBinding> list = attachedEventBindings.get(eventKey);
        return list == null ? Collections.emptyList() : list;
    }

    @JsMethod
    public final void refresh() {
        RefreshUiNodeEvent refreshUiNodeEvent = new RefreshUiNodeEvent(this);
        getContext().processEvent(refreshUiNodeEvent);
    }

    public final void refreshWithReason(String reason) {
        RefreshUiNodeEvent refreshUiNodeEvent = new RefreshUiNodeEvent(this, reason);
        EngineEventModeEnum currentMode = getContext().getEventMode();
        getContext().setEventMode(EngineEventModeEnum.Post);
        if (!currentMode.equals(EngineEventModeEnum.Post)) {
            try {
                getContext().processEvent(refreshUiNodeEvent);
            } finally {
                getContext().setEventMode(currentMode);
            }
        }

    }

    @JsMethod
    public final void addChangeListener(UiNodeChangeListener listener) {
        this.changeListeners.add(listener);
    }

    @JsMethod
    public final void removeChangeListener(UiNodeChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    final void notifyChange() {
        logger.warning(this.getClass().getSimpleName() + " notifying change.");
        for (UiNodeChangeListener listener : changeListeners) {
            listener.onUiNodeChanged();
        }
    }

    //endregion

    //region ui node properties

    @JsMethod
    @Override
    public String getVisibility() {
        return getStateValue(NeutronEventSubjects.VISIBILITY, "visible");
    }

    @JsMethod
    @Override
    public void setVisibility(String value) {
        setStateValue(NeutronEventSubjects.VISIBILITY, String.class, value);
    }

    @JsMethod
    @Override
    public boolean isDisabled() {
        return getStateValue(NeutronEventSubjects.DISABLED, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setDisabled(boolean value) {
        setStateValue(NeutronEventSubjects.DISABLED, Boolean.class, value);
    }

    @JsMethod
    @Override
    public boolean isReadonly() {
        return getStateValue(NeutronEventSubjects.READONLY, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setReadonly(boolean value) {
        setStateValue(NeutronEventSubjects.READONLY, Boolean.class, value);
    }

    @JsMethod
    @Override
    public boolean isDirty() {
        return getStateValue(NeutronEventSubjects.DIRTY, Boolean.FALSE);
    }

    @JsMethod
    @Override
    public void setDirty(boolean value) {
        setStateValue(NeutronEventSubjects.DIRTY, Boolean.class, value);
    }

    @JsMethod
    @Override
    public String getNodeLabel() {
        String label = getStateValue(NeutronEventSubjects.NODE_LABEL);
        if (label != null)
            return label;

        return ValueUtil.nodeNameToLabel(this.getName());
    }

    @JsMethod
    @Override
    public void setNodeLabel(String value) {
        setStateValue(NeutronEventSubjects.NODE_LABEL, String.class, value);
    }

    @JsMethod
    @Override
    public String getPathLabel() {
        String label = getStateValue(NeutronEventSubjects.PATH_LABEL);
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
        setStateValue(NeutronEventSubjects.PATH_LABEL, String.class, value);
    }

    @JsMethod
    @Override
    public ValidationErrorList getValidationErrorList() {
        return getStateValue(NeutronEventSubjects.VALIDATION_ERROR_LIST, ValidationErrorList.EMPTY);
    }

    @Override
    public void setValidationErrorList(ValidationErrorList errors) {
        setStateValue(NeutronEventSubjects.VALIDATION_ERROR_LIST, ValidationErrorList.class, errors);
    }

    @JsMethod
    @Override
    public boolean getLoadWithParent() {
        Object value = this.getStateValueInternal(NeutronEventSubjects.LOAD_WITH_PARENT);
        return !Boolean.FALSE.equals(value);
    }

    @Override
    public void setLoadWithParent(boolean value) {
        this.setStateValueInternal(NeutronEventSubjects.LOAD_WITH_PARENT, value);
    }

    @JsMethod
    public Boolean getRequired() {
        Boolean result = getStateValue(NeutronEventSubjects.REQUIRED);
        return result == null ? Boolean.FALSE : result;
    }

    public void setRequired(Boolean required) {
        this.setStateValue(NeutronEventSubjects.REQUIRED, Boolean.class, required);
    }

    @JsMethod
    public String getRequiredMessage() {
        return getStateValue(NeutronEventSubjects.REQUIRED_MESSAGE, "Value is required");
    }

    public void setRequiredMessage(String message) {
        setStateValue(NeutronEventSubjects.REQUIRED_MESSAGE, String.class, message);
    }

    @JsMethod
    public String getSimpleClassName() {
        return this.getClass().getSimpleName();
    }

    @JsMethod
    public boolean inheritsFrom(String simpleName) {
        Class<?> clazz = this.getClass();
        do {
            if (clazz.getSimpleName().equals(simpleName))
                return true;
            clazz = clazz.getSuperclass();
        } while (clazz != null);

        return false;
    }
//endregion
}
