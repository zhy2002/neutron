package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyTrustNode extends BaseTrustNode<CompanyNode> {

    private CompanyTrustNodeComponent component;

    @Inject
    public CompanyTrustNode(@Owner CompanyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyTrustNode.class;
    }

    @Inject
    void createComponent(CompanyTrustNodeComponent.Builder builder) {
        this.component = builder.setCompanyTrustNodeModule(new CompanyTrustNodeModule(this)).build();
    }

    private RuleProvider<CompanyTrustNode> getRuleProvider() {
        return component.getCompanyTrustNodeRuleProvider();
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

    private RuleProvider<CompanyTrustNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
