package zhy2002.examples.register;

import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.rule.RangeValidationRule;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class AgeNode extends BigDecimalUiNode<RegisterNode> {

    protected AgeNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
        setMaxValue(new BigDecimal("120"));
        setStateValueInternal(PredefinedEventSubjects.RANGE_MESSAGE, "Age must be between 0 and 120.");

    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(RangeValidationRule.class, this));
    }
}
