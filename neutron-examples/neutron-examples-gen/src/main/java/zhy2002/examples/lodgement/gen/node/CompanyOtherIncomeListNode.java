package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyOtherIncomeListNode extends BaseOtherIncomeListNode<CompanyNode> {

    @Inject
    public CompanyOtherIncomeListNode(@Owner CompanyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyOtherIncomeListNode.class;
    }

    private CompanyOtherIncomeListNodeComponent component;

    @Inject
    void createComponent(CompanyOtherIncomeListNodeComponent.Builder builder) {
        this.component = builder.setCompanyOtherIncomeListNodeModule(new CompanyOtherIncomeListNodeModule(this)).build();
    }

    private RuleProvider<CompanyOtherIncomeListNode> getRuleProvider() {
        return component.getCompanyOtherIncomeListNodeRuleProvider();
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

    private RuleProvider<CompanyOtherIncomeListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
