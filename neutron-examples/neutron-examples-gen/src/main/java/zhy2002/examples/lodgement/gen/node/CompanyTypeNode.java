package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyTypeNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyTypeNode.class;
    }

    protected final CompanyTypeNodeComponent getComponent() {
        return component;
    }


    private CompanyTypeNodeComponent component;

    @Inject
    void createComponent(CompanyTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyTypeNodeModule(new CompanyTypeNodeModule(this)).build();
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
