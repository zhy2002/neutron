package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.node.*;
import zhy2002.examples.register.data.ProductPlan;
import zhy2002.examples.register.gen.rule.UpdatePlanRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventBinding;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UpdatePlanRuleImpl extends UpdatePlanRule {

    private static final BigDecimal ADULT_AGE = new BigDecimal("18");

    private static final List<ProductPlan> ADULT_PLANS = Arrays.asList(
            new ProductPlan("", ""),
            new ProductPlan("Plan C", "C"),
            new ProductPlan("Plan D", "D")
    );

    private static final List<ProductPlan> CHILD_PLANS = Arrays.asList(
            new ProductPlan("", ""),
            new ProductPlan("Plan A", "A"),
            new ProductPlan("Plan B", "B")
    );

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
        List<ProductPlan> plans;
        if (getOwner().getValue() == null || getOwner().getValidationErrorList() != null && !getOwner().getValidationErrorList().isEmpty()) {
            plans = Collections.emptyList();
        } else if (getOwner().getValue().compareTo(ADULT_AGE) >= 0) {
            plans = ADULT_PLANS;
        } else {
            plans = CHILD_PLANS;
        }

        getPlanNode().setOptions(plans.toArray());
        String value = getPlanNode().getValue();
        if (ValueUtil.isEmpty(value))
            return;
        for (ProductPlan plan : plans) {
            if (value.equals(plan.getValue()))
                return;
        }
        getPlanNode().setValue("");
    }
}
