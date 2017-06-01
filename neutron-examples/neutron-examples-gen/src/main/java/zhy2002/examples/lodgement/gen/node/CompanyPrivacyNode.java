package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyPrivacyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyPrivacyNode extends BasePrivacyNode<CompanyNode> {

    @Inject
    public CompanyPrivacyNode(@Owner CompanyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyPrivacyNode.class;
    }

    protected final CompanyPrivacyNodeComponent getComponent() {
        return component;
    }


    private CompanyPrivacyNodeComponent component;

    @Inject
    void createComponent(CompanyPrivacyNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrivacyNodeModule(new CompanyPrivacyNodeModule(this)).build();
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
