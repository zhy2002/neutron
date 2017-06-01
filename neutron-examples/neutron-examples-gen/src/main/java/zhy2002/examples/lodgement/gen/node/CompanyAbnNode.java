package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyAbnNode extends StringUiNode<CompanyGeneralNode> {

    private CompanyAbnNodeComponent component;

    @Inject
    public CompanyAbnNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAbnNode.class;
    }

    @Inject
    void createComponent(CompanyAbnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbnNodeModule(new CompanyAbnNodeModule(this)).build();
    }

    private RuleProvider<CompanyAbnNode> getRuleProvider() {
        return component.getCompanyAbnNodeRuleProvider();
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

    private RuleProvider<CompanyAbnNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
