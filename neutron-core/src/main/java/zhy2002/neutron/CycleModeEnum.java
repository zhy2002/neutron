package zhy2002.neutron;

import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public enum CycleModeEnum {

    /**
     * trigger a cycle when a root change happens.
     */
    Auto,
    /**
     * queue up all root changes until a cycle is processed manually.
     */
    Batched,
    /**
     * all changes are temporarily applied without triggering any rules.
     * The changes are officially applied when flush.
     */
    Debouncing
}
