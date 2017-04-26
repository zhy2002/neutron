package zhy2002.neutron.util;


/**
 * An enum that provides strong typing for framework state keys.
 */
public final class NeutronEventSubjects {


    private NeutronEventSubjects() {
    }

    public static final String VALUE = "value";
    public static final String ORIGINAL_VALUE = "original_value";
    public static final String VALUE_VALID = "value_valid";
    public static final String FIXED_VALUE = "fixed_value";
    public static final String READONLY = "readonly";
    public static final String SELF_DIRTY = "self_dirty";
    public static final String VALIDATION_ERROR_LIST = "validation_error_list";
    public static final String DEFAULT_REFRESH_REASON = "";
    public static final String NODE_LOADED_REFRESH_REASON = "NODE_LOADED";
    public static final String RESET_DIRTY_REFRESH_REASON = "RESET_DIRTY";
    public static final String MAX_LENGTH = "max_length";
    public static final String MIN_LENGTH = "min_length";
    public static final String INDEX = "index";
    public static final String MIN_ITEM_COUNT = "min_item_count";
    public static final String ADD_OR_REMOVE_NODE = "";
}
