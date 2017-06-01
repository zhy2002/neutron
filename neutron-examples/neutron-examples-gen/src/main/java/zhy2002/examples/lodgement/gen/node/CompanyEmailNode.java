package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyEmailNode extends EmailNode<CompanyContactNode> {

    private CompanyEmailNodeComponent component;

    @Inject
    public CompanyEmailNode(@Owner CompanyContactNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyEmailNode.class;
    }

    @Inject
    void createComponent(CompanyEmailNodeComponent.Builder builder) {
        this.component = builder.setCompanyEmailNodeModule(new CompanyEmailNodeModule(this)).build();
    }

    private RuleProvider<CompanyEmailNode> getRuleProvider() {
        return component.getCompanyEmailNodeRuleProvider();
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

    private RuleProvider<CompanyEmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
