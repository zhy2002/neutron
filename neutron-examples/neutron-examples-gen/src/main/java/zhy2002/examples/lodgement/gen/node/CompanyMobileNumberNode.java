package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyMobileNumberNode extends BaseMobileNumberNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyMobileNumberNode.class;
    }

    private CompanyMobileNumberNodeComponent component;

    @Inject
    void createComponent(CompanyMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setCompanyMobileNumberNodeModule(new CompanyMobileNumberNodeModule(this)).build();
    }

    @Override
    protected CompanyMobileNumberNodeRuleProvider getRuleProvider() {
        return component.getCompanyMobileNumberNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyMobileNumberNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
