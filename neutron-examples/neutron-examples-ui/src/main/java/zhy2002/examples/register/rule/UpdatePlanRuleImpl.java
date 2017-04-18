package zhy2002.examples.register.rule;

import zhy2002.examples.register.gen.node.AgeNode;
import zhy2002.examples.register.gen.node.PlanNode;
import zhy2002.examples.register.gen.rule.UpdatePlanRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class UpdatePlanRuleImpl extends UpdatePlanRule {

    private static final BigDecimal ADULT_AGE = new BigDecimal("18");

    private static final StringOption[] ADULT_PLANS = {
            new StringOption("", ""),
            new StringOption("C", "Plan C"),
            new StringOption("D", "Plan D")
    };

    private static final StringOption[] CHILD_PLANS = {
            new StringOption("", ""),
            new StringOption("A", "Plan A"),
            new StringOption("B", "Plan B")
    };

    @Inject
    public UpdatePlanRuleImpl(@Owner AgeNode owner) {
        super(owner);
    }

    private PlanNode getPlanNode() {
        return getOwner().getParent().getPlanNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BigDecimalStateChangeEventBinding(
                        e -> updatePlanOptions()
                ),
                new ValidationErrorListStateChangeEventBinding(
                        e -> updatePlanOptions()
                )
        );
    }

    private void updatePlanOptions() {
        StringOption[] plans;
        if (getOwner().getValue() == null || getOwner().getValidationErrorList() != null && !getOwner().getValidationErrorList().isEmpty()) {
            plans = new StringOption[0];
        } else if (getOwner().getValue().compareTo(ADULT_AGE) >= 0) {
            plans = ADULT_PLANS;
        } else {
            plans = CHILD_PLANS;
        }

        getPlanNode().setOptions(plans);
        String value = getPlanNode().getValue();
        if (ValueUtil.isEmpty(value))
            return;
        for (StringOption plan : plans) {
            if (value.equals(plan.getValue()))
                return;
        }
        getPlanNode().setValue("");
    }
}
