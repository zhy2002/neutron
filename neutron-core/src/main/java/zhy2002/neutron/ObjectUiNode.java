package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @JsMethod
    public String getSelectedName() {
        return getStateValue(NeutronEventSubjects.SELECTED_NAME);
    }

    @JsMethod
    public void setSelectedName(String value) {
        setStateValue(NeutronEventSubjects.SELECTED_NAME, String.class, value);
    }

    @Override
    protected void initializeChildren() {
        List<UiNode<?>> children = createChildren();
        children.forEach(UiNode::addToParent);
        for (int i = 0; i < children.size(); i++) {
            children.get(i).setIndex(i);
        }
        children.forEach(node -> {
            if (node.getLoadWithParent()) {
                node.load();
            }
        });
    }

    protected
    @NotNull
    List<UiNode<?>> createChildren() {
        return new ArrayList<>();
    }

    @JsMethod
    @Override
    public int getChildCount() {
        return super.getChildCount();
    }

    @JsMethod
    public UiNode<?> getChildByName(String name) {
        return super.getChild(name);
    }

    @Override
    public boolean hasValue() {
        return getStateValue(NeutronEventSubjects.HAS_VALUE, Boolean.FALSE);
    }

}
