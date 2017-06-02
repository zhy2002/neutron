package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyTrustNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTrustNode extends BaseTrustNode<CompanyNode> {

    @Inject
    protected CompanyTrustNode(@Owner CompanyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyTrustNode.class;
    }

    protected final CompanyTrustNodeComponent getComponent() {
        return component;
    }


    private CompanyTrustNodeComponent component;

    @Inject
    void createComponent(CompanyTrustNodeComponent.Builder builder) {
        this.component = builder.setCompanyTrustNodeModule(new CompanyTrustNodeModule(this)).build();
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
