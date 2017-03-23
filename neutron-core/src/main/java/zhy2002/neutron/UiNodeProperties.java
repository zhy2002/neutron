package zhy2002.neutron;

import zhy2002.neutron.data.ValidationErrorList;

/**
 * A Collection of standard properties for all UiNode.
 * Values of these properties are guaranteed not to be null.
 * Setting them to null is the same to setting them to their initial value.
 */
public interface UiNodeProperties {

    /**
     * @return one of visible, hidden, none.
     * Use String type to facilitate JS interop.
     */
    String getVisibility();

    void setVisibility(String value);

    /**
     * @return true if this Node if disabled in the ui.
     * This does not affect the node's ability to process
     * events in anyway, though rules might behave differently
     * for different values.
     */
    boolean isDisabled();

    void setDisabled(boolean value);

    /**
     * @return true if the node is not editable.
     */
    boolean isReadonly();

    void setReadonly(boolean value);

    /**
     * @return true if the value of the node has changed since loaded.
     */
    boolean isDirty();

    /**
     * @return a label for the node itself.
     * Conceptually this is similar to the toString method.
     */
    String getNodeLabel();

    void setNodeLabel(String value);

    /**
     * @return a label (human readable text) that describes
     * the path to the node.
     */
    String getPathLabel();

    void setPathLabel(String value);

    /**
     * @return get the list of validation errors associated with this node.
     */
    ValidationErrorList getValidationErrorList();

    void setValidationErrorList(ValidationErrorList errors);

    /**
     * @return true if should load this node when the parent loads.
     */
    boolean getLoadWithParent();

    void setLoadWithParent(boolean value);
}
