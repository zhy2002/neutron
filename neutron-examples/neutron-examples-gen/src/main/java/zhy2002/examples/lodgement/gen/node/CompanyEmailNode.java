package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyEmailNode extends EmailNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyEmailNode.class;
    }

    private CompanyEmailNodeComponent component;

    @Inject
    void createComponent(CompanyEmailNodeComponent.Builder builder) {
        this.component = builder.setCompanyEmailNodeModule(new CompanyEmailNodeModule(this)).build();
    }

    private RuleProvider<CompanyEmailNode> getRuleProvider() {
        return component.getCompanyEmailNodeRuleProvider();
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

    private RuleProvider<CompanyEmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CompanyEmailNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
