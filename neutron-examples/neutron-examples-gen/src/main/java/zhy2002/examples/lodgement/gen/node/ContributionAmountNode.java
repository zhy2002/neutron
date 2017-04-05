package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContributionAmountNode extends BaseCurrencyNode<ProductCustomerContributionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContributionAmountNode.class;
    }

    private ContributionAmountNodeComponent component;

    @Inject
    void createComponent(ContributionAmountNodeComponent.Builder builder) {
        this.component = builder.setContributionAmountNodeModule(new ContributionAmountNodeModule(this)).build();
    }

    private RuleProvider<ContributionAmountNode> getRuleProvider() {
        return component.getContributionAmountNodeRuleProvider();
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

    private RuleProvider<ContributionAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ContributionAmountNode(@NotNull ProductCustomerContributionNode parent, String name) {
        super(parent, name);
    }

}
