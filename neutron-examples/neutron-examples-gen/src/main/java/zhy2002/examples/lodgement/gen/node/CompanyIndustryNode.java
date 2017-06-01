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
    public CompanyIndustryNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
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

}
