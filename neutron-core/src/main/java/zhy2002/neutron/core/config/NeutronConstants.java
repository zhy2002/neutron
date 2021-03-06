package zhy2002.neutron.core.config;

/**
 * An enum that provides strong typing for framework state keys.
 */
public final class NeutronConstants {


    private NeutronConstants() {
    }

    public static final String JS_NAMESPACE = "GWT";
    public static final String ANY_VALUE = "#value";
    public static final String ORIGINAL_VALUE = "original_value";
    public static final String DEFAULT_REFRESH_REASON = "";
    public static final String NODE_LOADED_REFRESH_REASON = "NODE_LOADED";
    public static final String RESET_DIRTY_REFRESH_REASON = "RESET_DIRTY";
    public static final String ADD_OR_REMOVE_NODE = "";
    public static final String PLACEHOLDER_RULE_PROVIDER = "PLACEHOLDER_RULE_PROVIDER";
    public static final String TYPE_RULE_PROVIDER = "TYPE_RULE_PROVIDER";
    public static final int DOMAIN_CONTEXT_CONFIGURER_ORDER = 100;
    public static final int PROFILE_CONTEXT_CONFIGURER_ORDER = 1000;
    public static final int CUSTOM_CONTEXT_CONFIGURER_ORDER = 10000;
    public static final String STATE_CHANGE_NOTIFICATION = "STATE_CHANGE_NOTIFICATION";
    public static final String ACCEPT_VALUE_ACTION = "AcceptValue";
}
