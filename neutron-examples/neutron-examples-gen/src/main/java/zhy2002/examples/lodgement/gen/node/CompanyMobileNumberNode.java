package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyMobileNumberNode extends BaseMobileNumberNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyMobileNumberNode.class;
    }

    private CompanyMobileNumberNodeComponent component;

    @Inject
    void createComponent(CompanyMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setCompanyMobileNumberNodeModule(new CompanyMobileNumberNodeModule(this)).build();
    }

    private RuleProvider<CompanyMobileNumberNode> getRuleProvider() {
        return component.getCompanyMobileNumberNodeRuleProvider();
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

    private RuleProvider<CompanyMobileNumberNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public CompanyMobileNumberNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
