package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull AbstractUiNodeContext<?> context) {
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
        children.forEach(node -> {
            if (node.getLoadWithParent()) {
                node.load();
            }
        });
    }

    @Override
    protected void uninitializeChildren() {
        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].unload();
        }
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].removeFromParent();
        }
    }

    protected
    @NotNull
    abstract List<UiNode<?>> createChildren();

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

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(ObjectValueRequiredValidationRule.class, this));
        createdRules.add(context.createUiNodeRule(UpdateObjectHasValueRule.class, this));
    }
}
