package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.List;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected ReferenceUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public UiNode<?> getReferencedNode() {
        return getContext().getNodeFinder().findNodeByPath(getValue());
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    @Override
    public final String getValue() {
        return super.getValue();
    }

    @Override
    public final void setValue(String value) {
        super.setValue(String.class, value);
    }

    @Inject
    ReferenceUiNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
