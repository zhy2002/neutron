package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyDescriptionNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyDescriptionNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyDescriptionNode.class;
    }

    protected final CompanyDescriptionNodeComponent getComponent() {
        return component;
    }


    private CompanyDescriptionNodeComponent component;

    @Inject
    void createComponent(CompanyDescriptionNodeComponent.Builder builder) {
        this.component = builder.setCompanyDescriptionNodeModule(new CompanyDescriptionNodeModule(this)).build();
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
