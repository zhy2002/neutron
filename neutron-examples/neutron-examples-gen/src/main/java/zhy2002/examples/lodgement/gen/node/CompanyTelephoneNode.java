package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyTelephoneNode extends TelephoneNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyTelephoneNode.class;
    }

    private CompanyTelephoneNodeComponent component;

    @Inject
    void createComponent(CompanyTelephoneNodeComponent.Builder builder) {
        this.component = builder.setCompanyTelephoneNodeModule(new CompanyTelephoneNodeModule(this)).build();
    }

    @Override
    protected CompanyTelephoneNodeRuleProvider getRuleProvider() {
        return component.getCompanyTelephoneNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyTelephoneNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
