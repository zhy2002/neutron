package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyIndustryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyIndustryNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyIndustryNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyIndustryNode.class;
    }

    protected final CompanyIndustryNodeComponent getComponent() {
        return component;
    }


    private CompanyIndustryNodeComponent component;

    @Inject
    void createComponent(CompanyIndustryNodeComponent.Builder builder) {
        this.component = builder.setCompanyIndustryNodeModule(new CompanyIndustryNodeModule(this)).build();
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
