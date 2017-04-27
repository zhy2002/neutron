package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.logging.Logger;

/**
 * Base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode<?>> {

    private static final Logger logger = Logger.getLogger("UiNode");

    //region basic properties

    /**
     * The node context this node belongs to.
     * Conceptually the context is the container of the whole node tree providing
     * shared resources and services.
     */
    private final UiNodeContext<?> context;
    /**
     * The parent node
     * or null if this node is a root node.
     */
    private final P parent;
    /**
     * Name of the node, which is unique among siblings.
     * Name of a list item node is its creation sequence number which is preserved when
     * node hierarchy is serialized.
     */
    private final String name;
    /**
     * Globally unique id (across all contexts). Unique id is assigned when
     * this node is added to the node tree. The unique id will not change thereafter.
     * In the same application there should not be two nodes with the same unique id.
     */
    private String uniqueId;
    /**
     * Cache the node path. Node path does not change with the node hierarchy structure.
     * This is not put into state for debugging convenience.
     */
    private String path;
    /**
     * The life cycle status of this node.
     */
    private NodeStatusEnum nodeStatus;
    /**
     * A copy of state before loading.
     * When the node unloads it will restore to this state.
     */
    private Map<String, Object> preState;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, Object> state = new HashMap<>();
    /**
     * Temporarily store debounced events.
     */
    private final Map<String, StateChangeEvent<?>> temporary = new HashMap<>();
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
     * Offers a chance to run custom code at life cycle stages.
     */
    private final List<UiNodeLifeCycleListener> lifeCycleListeners = new ArrayList<>();
    /**
     * Listeners that are notified when this node changes.
     * At the moment node change means state change, add child or remove child.
     */
    private final List<UiNodeChangeListener> changeListeners = new ArrayList<>();

    /**
     * Construct a child node.
     *
     * @param parent the parent node.
     * @param name   unique name within parent.
     */
    protected UiNode(@NotNull P parent, @NotNull String name) {
        this(parent, parent.getContext(), name);
    }

    /**
     * The construct a root node.
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

        //setChangeTrackingMode(NeutronEventSubjects.FORCE_UPDATE, ChangeTrackingModeEnum.Always);
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

    /**
     * The implementation is generated in code.
     *
     * @return the concrete class (the first without the parent type parameter) of this node.
     */
    public abstract Class<?> getConcreteClass();

    /**
     * Reset the dirty status of this node only.
     */
    abstract void resetDirty();

    /**
     * @return a simple string that identifies a type of node within its context.
     */
    @JsMethod
    public final String getConcreteClassName() {
        return getConcreteClass().getSimpleName();
    }

    /**
     * @return the path to a node within the node tree. Path does not change while the node is in the tree.
     */
    @JsMethod
    public String getPath() {
        if (getNodeStatus() == NodeStatusEnum.Detached)
            return path = null;

        if (path == null) {
            Stack<String> stack = new Stack<>();
            UiNode<?> node = this;
            do {
                stack.push(node.getName());
                node = node.getParent();
            } while (node != null);
            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.isEmpty()) {
                stringBuilder.append(stack.pop());
                if (!stack.isEmpty()) {
                    stringBuilder.append("/"); //node name cannot contain /
                }
            }
            path = stringBuilder.toString();
        }
        return path;
    }

    /**
     * Life state of this node.
     */
    @JsMethod
    @NotNull
    public final NodeStatusEnum getNodeStatus() {
        return nodeStatus;
    }

    final boolean addStatusListener(UiNodeLifeCycleListener listener) {
        return this.lifeCycleListeners.add(listener);
    }

    final boolean removeStatusListener(UiNodeLifeCycleListener listener) {
        return this.lifeCycleListeners.remove(listener);
    }

    final void addCreatedRule(UiNodeRule<?> createdRule) {
        createdRules.add(createdRule);
    }

    //endregion

    //region state methods

    /**
     * Wrapper method for state.
     *
     * @param key the state key.
     * @param <T> the type to cast state value to.
     * @return the state value.
     */
    @SuppressWarnings("unchecked")
    protected <T> T getStateValueDirectly(String key) {
        return (T) state.get(key);
    }

    /**
     * Bypass event processing and set the value directly.
     *
     * @param key   state property key.
     * @param value state property value.
     */
    protected void setStateValueDirectly(@NotNull String key, Object value) {
        if (value == null) {
            state.remove(key);
        } else {
            state.put(key, value);
        }
    }

    /**
     * Clear a state value.
     *
     * @param key the state key (derived from property name).
     */
    protected void clearStateValueDirectly(@NotNull String key) {
        state.remove(key);
    }

    @SuppressWarnings("unchecked")
    public <T> T getStateValue(@NotNull PropertyMetadata<T> propertyMetadata) {
        T value;

        if (propertyMetadata.getChangeMode() == ChangeModeEnum.CASCADE) {
            StateChangeEvent<T> event = (StateChangeEvent<T>) temporary.get(propertyMetadata.getStateKey());
            if (event != null) {
                value = event.getNewValue();
            } else {
                value = getStateValueDirectly(propertyMetadata.getStateKey());
            }
        } else {
            value = getStateValueDirectly(propertyMetadata.getStateKey());
        }

        return value == null ? propertyMetadata.getDefaultValue() : value;
    }

    public <T> void setStateValue(PropertyMetadata<T> propertyMetadata, T value) {
        String key = propertyMetadata.getStateKey();
        if (propertyMetadata.getChangeMode() == ChangeModeEnum.DIRECT || isInDirectChangeMode()) {
            setStateValueDirectly(key, value);
            return;
        }

        ChangeTrackingModeEnum changeTrackingMode = propertyMetadata.getChangeTrackingMode();
        boolean process = false;
        T oldValue = getStateValueDirectly(key);
        switch (changeTrackingMode) {
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
                process = false;
                break;
        }
        if (!process)
            return;

        StateChangeEvent<T> event = context.createStateChangeEvent(this, key, propertyMetadata.getValueClass(), oldValue, value);
        getContext().processEvent(event);
    }

    /**
     * @return true if changes should be applied directly (i.e. bypass event processing).
     */
    final boolean isInDirectChangeMode() {
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

    @SuppressWarnings("unchecked")
    final <T> StateChangeEvent<T> applyTemporary(StateChangeEvent<T> newEvent) {
        StateChangeEvent<T> oldEvent = (StateChangeEvent<T>) temporary.get(newEvent.getStateKey());
        if (oldEvent != null) {
            newEvent.setOldValue(oldEvent.getOldValue());
        }
        temporary.put(newEvent.getStateKey(), newEvent);
        if (!Objects.equals(newEvent.getNewValue(), newEvent.getOldValue())) {
            notifyChange();
        }
        return oldEvent;
    }

    final void clearTemporary() {
        temporary.clear();
    }

    /**
     * Determines if the content of this node is empty.
     * Empty is defined as no value is entered and there is no default value.
     *
     * @return true if is empty.
     */
    @JsMethod
    public abstract boolean hasValue();

    @JsMethod
    public abstract boolean hasError();

    @SuppressWarnings("unchecked")
    final <T> T getPreStateValue(String key) {
        return (T) preState.get(key);
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

        this.uniqueId = context.getUniqueId();

        if (parent == null) {
            //do nothing for root
        } else {
            this.parent.addChild(this);
        }

        for (UiNodeLifeCycleListener listener : lifeCycleListeners) {
            listener.exitAddToParent();
        }

        this.nodeStatus = NodeStatusEnum.Unloaded;
        getContext().getNodeFinder().registerNode(this);

        initializeState();
    }

    /**
     * Override at concrete node level.
     */
    protected abstract void initializeState();

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

        getContext().getNodeFinder().deregisterNode(this);
        getContext().getNodeReferenceRegistry().postRemoveFromParent(this);
        this.nodeStatus = NodeStatusEnum.Detached;
    }

    /**
     * Calling this method with transition from Unloaded to Loaded.
     * This loads the node directly no event will be emitted.
     */
    public final void loadDirectly() {
        if (this.nodeStatus != NodeStatusEnum.Unloaded)
            return;

        if (preState == null) {
            preState = new HashMap<>(state);
        }

        addContent();
        loadContent();

        for (UiNodeLifeCycleListener listener : lifeCycleListeners) {
            listener.exitLoad();
        }
        this.nodeStatus = NodeStatusEnum.Loaded;
    }

    protected void loadContent() {
        createdRules.forEach(UiNodeRule::onLoad);
        createdRules.clear();
    }

    /**
     * Implemented at concrete node level.
     *
     * @param createdRules the list of rule that will be loaded.
     */
    protected abstract void createRules(List<UiNodeRule<?>> createdRules);

    /**
     * Override this method to run code at load time.
     */
    protected void addContent() {
        createRules(createdRules);
        for (UiNodeLifeCycleListener listener : lifeCycleListeners) {
            listener.postCreateRules(createdRules);
        }
        createdRules.forEach(UiNodeRule::addToOwner);
    }

    /**
     * Calling this method will transition from Loaded to Unloaded.
     */
    public final void unloadDirectly() {
        if (this.nodeStatus != NodeStatusEnum.Loaded)
            return;
        this.nodeStatus = NodeStatusEnum.Unloaded;

        unloadContent();
        removeContent();

        this.state.clear();
        assert this.preState != null;
        this.state.putAll(this.preState);
    }

    protected void unloadContent() {
        this.ownRules.forEach(UiNodeRule::onUnload);
    }

    /**
     * Override this method to do things before or after unload of this node.
     */
    protected void removeContent() {
        List<UiNodeRule<?>> ownRules = new ArrayList<>();
        ownRules.forEach(UiNodeRule::removeFromOwner);
        clearValidationErrors();
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
        loadDirectly();
    }

    final void detach() {
        unloadDirectly();
        removeFromParent();
    }

    public final void load() {
        NodeLoadEvent<?> event = createNodeLoadEvent();
        getContext().processEvent(event);
    }

    public final void unLoad() {
        NodeUnloadEvent<?> event = createNodeUnloadEvent();
        getContext().processEvent(event);
    }

    /**
     * Only concrete node (generated) is allowed override this method.
     *
     * @return the load event for this node, not processed.
     */
    protected NodeLoadEvent<?> createNodeLoadEvent() {
        throw new NotImplementedException();
    }

    /**
     * Only concrete node (generated) is allowed to override this method.
     *
     * @return the unload event for this node, not processed.
     */
    protected NodeUnloadEvent<?> createNodeUnloadEvent() {
        throw new NotImplementedException();
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
            List<EventBinding> bindingList = attachedEventBindings.computeIfAbsent(binding.getEventKey(), k -> new ArrayList<>());
            bindingList.add(binding);
        }
    }

    final <T extends UiNode<?>> void detachRule(UiNodeRule<T> rule) {
        assert rule.getHost() == this;

        for (EventBinding binding : rule.getEventBindings()) {
            List<EventBinding> bindingList = attachedEventBindings.get(binding.getEventKey());
            if (bindingList != null) {
                bindingList.remove(binding);
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

    public static final PropertyMetadata<Boolean> LOAD_WITH_PARENT_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "loadWithParent", Boolean.class, Boolean.TRUE, ChangeModeEnum.DIRECT);
    public static final PropertyMetadata<Boolean> HAS_VALUE_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "hasValue", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> DISABLED_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "disabled", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> READONLY_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "readonly", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> REQUIRED_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "required", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> SELF_DIRTY_PROPERTY = MetadataRegistry.createProperty(LeafUiNode.class, "selfDirty", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Integer> INDEX_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "index", Integer.class, -1);
    public static final PropertyMetadata<Integer> DISABLED_ANCESTOR_COUNT = MetadataRegistry.createProperty(UiNode.class, "disabledAncestorCount", Integer.class, 0);
    public static final PropertyMetadata<String> VISIBILITY_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "visibility", String.class, "visible");
    public static final PropertyMetadata<String> NODE_LABEL_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "nodeLabel", String.class);
    public static final PropertyMetadata<String> PATH_LABEL_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "pathLabel", String.class);
    public static final PropertyMetadata<String> REQUIRED_MESSAGE_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "requiredMessage", String.class, "Value is required");
    public static final PropertyMetadata<ValidationErrorList> VALIDATION_ERROR_LIST_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "validationErrorList", ValidationErrorList.class, ValidationErrorList.EMPTY);
    public static final PropertyMetadata<Object> OPTIONS_PROPERTY = MetadataRegistry.createProperty(UiNode.class, "options", Object.class);

    public final boolean getHasValue() {
        return getStateValue(HAS_VALUE_PROPERTY);
    }

    public final void setHasValue(boolean value) {
        setStateValue(HAS_VALUE_PROPERTY, value);
    }

    @JsMethod
    public final int getIndex() {
        return getStateValue(INDEX_PROPERTY);
    }

    final void setIndex(Integer index) {
        setStateValue(INDEX_PROPERTY, index);
    }

    @JsMethod
    public String getVisibility() {
        return getStateValue(VISIBILITY_PROPERTY);
    }

    @JsMethod
    public void setVisibility(String value) {
        setStateValue(VISIBILITY_PROPERTY, value);
    }

    @JsMethod
    public boolean isDisabled() {
        return getStateValue(DISABLED_PROPERTY);
    }

    @JsMethod
    public void setDisabled(boolean value) {
        setStateValue(DISABLED_PROPERTY, value);
    }

    @JsMethod
    public final boolean isEffectivelyDisabled() {
        return isDisabled() || getDisabledAncestorCount() > 0;
    }

    public final int getDisabledAncestorCount() {
        return getStateValue(DISABLED_ANCESTOR_COUNT);
    }

    public final void setDisabledAncestorCount(int count) {
        setStateValue(DISABLED_ANCESTOR_COUNT, count);
    }

    @JsMethod
    public boolean isReadonly() {
        return getStateValue(READONLY_PROPERTY);
    }

    @JsMethod
    public void setReadonly(boolean value) {
        setStateValue(READONLY_PROPERTY, value);
    }

    @JsMethod
    public boolean isDirty() {
        return false;
    }

    @JsMethod
    public String getNodeLabel() {
        String label = getStateValue(NODE_LABEL_PROPERTY);
        if (label != null)
            return label;

        return ValueUtil.nodeNameToLabel(this.getName());
    }

    @JsMethod
    public void setNodeLabel(String value) {
        setStateValue(NODE_LABEL_PROPERTY, value);
    }

    @JsMethod
    public String getPathLabel() {
        String label = getStateValue(PATH_LABEL_PROPERTY);
        if (label != null)
            return label;

        return createDefaultPathLabel();
    }

    @JsMethod
    public void setPathLabel(String value) {
        setStateValue(PATH_LABEL_PROPERTY, value);
    }

    private String createDefaultPathLabel() {

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
    public ValidationErrorList getValidationErrorList() {
        return getStateValue(VALIDATION_ERROR_LIST_PROPERTY);
    }

    public void setValidationErrorList(ValidationErrorList errors) {
        setStateValue(VALIDATION_ERROR_LIST_PROPERTY, errors);
    }

    @JsMethod
    public boolean getLoadWithParent() {
        return getStateValue(LOAD_WITH_PARENT_PROPERTY);
    }

    public void setLoadWithParent(boolean value) {
        setStateValue(LOAD_WITH_PARENT_PROPERTY, value);
    }

    @JsMethod
    public Boolean getRequired() {
        return getStateValue(REQUIRED_PROPERTY);
    }

    public void setRequired(Boolean required) {
        setStateValue(REQUIRED_PROPERTY, required);
    }

    @JsMethod
    public String getRequiredMessage() {
        return getStateValue(REQUIRED_MESSAGE_PROPERTY);
    }

    public void setRequiredMessage(String message) {
        setStateValue(REQUIRED_MESSAGE_PROPERTY, message);
    }

//endregion

    //Internal rule are defined in the owning node class.
    //These rules are always added and are never referenced by client code.

    /**
     * When RESET_DIRTY_REFRESH_REASON refresh event occurs, clear the dirty state of this node.
     */
    static class ResetDirtyRule extends UiNodeRule<UiNode<?>> {

        @Inject
        protected ResetDirtyRule(@Owner UiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Collections.singletonList(
                    new RefreshEventBinding(
                            e -> getOwner().resetDirty(),
                            NeutronEventSubjects.RESET_DIRTY_REFRESH_REASON
                    )
            );
        }
    }

}
