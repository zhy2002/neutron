package zhy2002.neutron.core;

import jsinterop.annotations.JsType;
import zhy2002.neutron.core.config.NeutronConstants;

/**
 * The life cycle states of a node.
 */
@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public enum NodeStatusEnum {
    /**
     * Node is created but not added to the node tree.
     */
    Detached,
    /**
     * Node is added to the node tree but its content has not been loaded.
     */
    Unloaded,
    /**
     * Node is fully functional.
     */
    Loaded


}
