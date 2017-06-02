package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyEmailNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyEmailNode extends EmailNode<CompanyContactNode> {

    @Inject
    protected CompanyEmailNode(@Owner CompanyContactNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyEmailNode.class;
    }

    protected final CompanyEmailNodeComponent getComponent() {
        return component;
    }


    private CompanyEmailNodeComponent component;

    @Inject
    void createComponent(CompanyEmailNodeComponent.Builder builder) {
        this.component = builder.setCompanyEmailNodeModule(new CompanyEmailNodeModule(this)).build();
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
