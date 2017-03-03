package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyOtherIncomeListNode extends BaseOtherIncomeListNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyOtherIncomeListNode.class;
    }

    private CompanyOtherIncomeListNodeComponent component;

    @Inject
    void createComponent(CompanyOtherIncomeListNodeComponent.Builder builder) {
        this.component = builder.setCompanyOtherIncomeListNodeModule(new CompanyOtherIncomeListNodeModule(this)).build();
    }

    @Override
    protected CompanyOtherIncomeListNodeRuleProvider getRuleProvider() {
        return component.getCompanyOtherIncomeListNodeRuleProvider();
    }

    public CompanyOtherIncomeListNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}
