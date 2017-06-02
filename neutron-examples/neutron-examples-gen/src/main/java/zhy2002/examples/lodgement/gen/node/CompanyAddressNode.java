package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAddressNode extends AddressNode<CompanyContactNode> {

    @Inject
    protected CompanyAddressNode(@Owner CompanyContactNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAddressNode.class;
    }

    protected final CompanyAddressNodeComponent getComponent() {
        return component;
    }


    private CompanyAddressNodeComponent component;

    @Inject
    void createComponent(CompanyAddressNodeComponent.Builder builder) {
        this.component = builder.setCompanyAddressNodeModule(new CompanyAddressNodeModule(this)).build();
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
