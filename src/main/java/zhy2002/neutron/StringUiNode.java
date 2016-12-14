package zhy2002.neutron;

import jsinterop.annotations.JsType;
import zhy2002.neutron.rule.PatternValidationRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);

        init();
    }

    protected StringUiNode(AbstractUiNodeContext context) {
        super(context);

        init();
    }

    private void init() {
        setChangeTrackingMode(ChangeTrackingModeEnum.Value);
        this.setValue("");
    }

    @Override
    public final String getValue() {
        return super.getValue();
    }

    @Override
    public final void setValue(String value) {
        super.setValue(String.class, value);
    }

    public void setPattern(String value) {
        super.setStateValue(PredefinedUiNodeStateKeys.PATTERN, String.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(PatternValidationRule.class, this));
    }
}
