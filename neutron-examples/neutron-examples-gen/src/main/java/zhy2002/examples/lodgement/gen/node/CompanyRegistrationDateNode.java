package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyRegistrationDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyRegistrationDateNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyRegistrationDateNode(@Owner CompanyGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyRegistrationDateNode.class;
    }

    protected final CompanyRegistrationDateNodeComponent getComponent() {
        return component;
    }


    private CompanyRegistrationDateNodeComponent component;

    @Inject
    void createComponent(CompanyRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegistrationDateNodeModule(new CompanyRegistrationDateNodeModule(this)).build();
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
