package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ContributionTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContributionTypeNode extends StringUiNode<ProductCustomerContributionNode> {

    @Inject
    protected ContributionTypeNode(@Owner ProductCustomerContributionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ContributionTypeNode.class;
    }

    protected final ContributionTypeNodeComponent getComponent() {
        return component;
    }


    private ContributionTypeNodeComponent component;

    @Inject
    void createComponent(ContributionTypeNodeComponent.Builder builder) {
        this.component = builder.setContributionTypeNodeModule(new ContributionTypeNodeModule(this)).build();
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
