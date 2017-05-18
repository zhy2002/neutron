package zhy2002.neutron.data;


import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;

/**
 * Instance of this class is used to obtain
 * node data, such as value, id.
 * To be implemented.
 */
public class NodeDataStore {

    private final String contextId;
    private final NodeIdentity nodeIdentity;

    @JsIgnore
    public NodeDataStore() {
        this(null, null);
    }

    @JsConstructor
    public NodeDataStore(String contextId, NodeIdentity nodeIdentity) {
        this.contextId = contextId;
        this.nodeIdentity = nodeIdentity;
    }

    @JsProperty
    public String getContextId() {
        return contextId;
    }

    @JsProperty
    public NodeIdentity getNodeIdentity() {
        return nodeIdentity;
    }
}
