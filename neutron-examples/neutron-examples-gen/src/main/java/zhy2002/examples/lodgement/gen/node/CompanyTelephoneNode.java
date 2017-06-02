package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyTelephoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTelephoneNode extends TelephoneNode<CompanyContactNode> {

    @Inject
    protected CompanyTelephoneNode(@Owner CompanyContactNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyTelephoneNode.class;
    }

    protected final CompanyTelephoneNodeComponent getComponent() {
        return component;
    }


    private CompanyTelephoneNodeComponent component;

    @Inject
    void createComponent(CompanyTelephoneNodeComponent.Builder builder) {
        this.component = builder.setCompanyTelephoneNodeModule(new CompanyTelephoneNodeModule(this)).build();
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
