package zhy2002.neutron.core;

import jsinterop.annotations.JsType;
import zhy2002.neutron.core.config.NeutronConstants;

/**
 * The modes that determine when stage change events occur.
 */
@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public enum ChangeTrackingModeEnum {
    /**
     * As long as a new value is set.
     */
    Always,
    /**
     * As long as the new value is a different reference.
     */
    Reference,
    /**
     * As long as the new value does not equal to the old value.
     */
    Value,
    /**
     * State is constant.
     */
    None
}
