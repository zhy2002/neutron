package zhy2002.neutron;

public enum SessionModeEnum {
    /**
     * Automatically commitSession when all root events are finished.
     */
    Auto,
    /**
     * Need to manually call commitSession method of the context.
     */
    Manual
}
