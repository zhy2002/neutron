package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyIndustryNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyIndustryNode.class;
    }

    private CompanyIndustryNodeComponent component;

    @Inject
    void createComponent(CompanyIndustryNodeComponent.Builder builder) {
        this.component = builder.setCompanyIndustryNodeModule(new CompanyIndustryNodeModule(this)).build();
    }

    @Override
    protected CompanyIndustryNodeRuleProvider getRuleProvider() {
        return component.getCompanyIndustryNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyIndustryNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
