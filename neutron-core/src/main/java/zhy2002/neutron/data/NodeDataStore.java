package zhy2002.neutron.data;


import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

/**
 * Instance of this class is used to obtain
 * node data, such as value, id.
 * To be implemented.
 */
@JsType(name = NeutronConstants.JS_NAMESPACE)
public class NodeDataStore {

    private final String contextId;
    private final NodeIdentity nodeIdentity;

    @JsIgnore
    public NodeDataStore() {
        this(null, null);
    }

    public NodeDataStore(String contextId, NodeIdentity nodeIdentity) {
        this.contextId = contextId;
        this.nodeIdentity = nodeIdentity;
    }

    public String getContextId() {
        return contextId;
    }

    public NodeIdentity getNodeIdentity() {
        return nodeIdentity;
    }
}
