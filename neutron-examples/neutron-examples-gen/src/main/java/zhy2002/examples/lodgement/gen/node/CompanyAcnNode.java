package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyAcnNode extends StringUiNode<CompanyGeneralNode> {

    private CompanyAcnNodeComponent component;

    @Inject
    public CompanyAcnNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAcnNode.class;
    }

    @Inject
    void createComponent(CompanyAcnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAcnNodeModule(new CompanyAcnNodeModule(this)).build();
    }

    private RuleProvider<CompanyAcnNode> getRuleProvider() {
        return component.getCompanyAcnNodeRuleProvider();
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

    private RuleProvider<CompanyAcnNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
