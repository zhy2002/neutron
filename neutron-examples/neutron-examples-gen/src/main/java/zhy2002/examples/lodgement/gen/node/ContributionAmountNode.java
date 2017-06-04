package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ContributionAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContributionAmountNode extends BaseCurrencyNode<ProductCustomerContributionNode> {

    @Inject
    protected ContributionAmountNode(@Owner ProductCustomerContributionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ContributionAmountNode.class;
    }

    protected final ContributionAmountNodeComponent getComponent() {
        return component;
    }


    private ContributionAmountNodeComponent component;

    @Inject
    void createComponent(ContributionAmountNodeComponent.Builder builder) {
        this.component = builder.setContributionAmountNodeModule(new ContributionAmountNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
