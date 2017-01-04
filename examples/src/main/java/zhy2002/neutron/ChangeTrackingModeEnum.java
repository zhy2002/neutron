package zhy2002.neutron;

import jsinterop.annotations.JsType;
import zhy2002.neutron.util.NeutronConstants;

/**
 * The behaviour when a state value is updated.
 */
@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public enum ChangeTrackingModeEnum {
    Always,
    Reference,
    Value,
    None
}
