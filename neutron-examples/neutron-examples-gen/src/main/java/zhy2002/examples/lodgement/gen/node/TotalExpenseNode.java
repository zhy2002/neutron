package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TotalExpenseNode extends BaseCurrencyNode<FinancialPositionNode> {
    private TotalExpenseNodeComponent component;

    public TotalExpenseNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return TotalExpenseNode.class;
    }

    @Inject
    void createComponent(TotalExpenseNodeComponent.Builder builder) {
        this.component = builder.setTotalExpenseNodeModule(new TotalExpenseNodeModule(this)).build();
    }

    private RuleProvider<TotalExpenseNode> getRuleProvider() {
        return component.getTotalExpenseNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<TotalExpenseNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
