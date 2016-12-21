package zhy2002.neutron;

/**
 * Built in properties for all UiNode.
 * Values of these properties are guaranteed not to be null.
 * Setting them to null is the same to setting them to their initial value.
 */
public interface UiNodeProperties {

    /**
     * @return one of visible, hidden, none.
     */
    String getVisibility();

    void setVisibility(String value);

    /**
     * @return true if this Node if disabled in the ui.
     * This does not affect the node's ability to process
     * events in anyway though rules might behave differently
     * for different values.
     */
    boolean isDisabled();

    void setDisabled(boolean value);

    boolean isReadonly();

    void setReadonly(boolean value);

    /**
     * @return true if the content of this node is KNOWN to be invalid.
     */
    boolean isInvalid();

    void setInvalid(boolean value);

    boolean isDirty();

    void setDirty(boolean value);

}
