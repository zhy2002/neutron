package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<CompanyIndustryNode> getRuleProvider() {
        return component.getCompanyIndustryNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<CompanyIndustryNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public CompanyIndustryNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
