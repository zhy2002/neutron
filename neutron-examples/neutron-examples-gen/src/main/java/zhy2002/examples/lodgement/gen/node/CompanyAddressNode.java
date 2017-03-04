package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyAddressNode extends AddressNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAddressNode.class;
    }

    private CompanyAddressNodeComponent component;

    @Inject
    void createComponent(CompanyAddressNodeComponent.Builder builder) {
        this.component = builder.setCompanyAddressNodeModule(new CompanyAddressNodeModule(this)).build();
    }

    @Override
    protected CompanyAddressNodeRuleProvider getRuleProvider() {
        return component.getCompanyAddressNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyAddressNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
