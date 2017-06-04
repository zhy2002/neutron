package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyAbnNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAbnNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyAbnNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAbnNode.class;
    }

    protected final CompanyAbnNodeComponent getComponent() {
        return component;
    }


    private CompanyAbnNodeComponent component;

    @Inject
    void createComponent(CompanyAbnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbnNodeModule(new CompanyAbnNodeModule(this)).build();
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
