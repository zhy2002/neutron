package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyOtherIncomeListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyOtherIncomeListNode extends BaseOtherIncomeListNode<CompanyNode> {

    @Inject
    public CompanyOtherIncomeListNode(@Owner CompanyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyOtherIncomeListNode.class;
    }

    protected final CompanyOtherIncomeListNodeComponent getComponent() {
        return component;
    }


    private CompanyOtherIncomeListNodeComponent component;

    @Inject
    void createComponent(CompanyOtherIncomeListNodeComponent.Builder builder) {
        this.component = builder.setCompanyOtherIncomeListNodeModule(new CompanyOtherIncomeListNodeModule(this)).build();
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
