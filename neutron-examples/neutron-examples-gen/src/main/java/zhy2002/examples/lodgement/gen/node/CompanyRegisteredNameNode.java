package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyRegisteredNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyRegisteredNameNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyRegisteredNameNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyRegisteredNameNode.class;
    }

    protected final CompanyRegisteredNameNodeComponent getComponent() {
        return component;
    }


    private CompanyRegisteredNameNodeComponent component;

    @Inject
    void createComponent(CompanyRegisteredNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegisteredNameNodeModule(new CompanyRegisteredNameNodeModule(this)).build();
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
