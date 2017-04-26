package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyAbnNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAbnNode.class;
    }

    private CompanyAbnNodeComponent component;

    @Inject
    void createComponent(CompanyAbnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbnNodeModule(new CompanyAbnNodeModule(this)).build();
    }

    private RuleProvider<CompanyAbnNode> getRuleProvider() {
        return component.getCompanyAbnNodeRuleProvider();
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

    private RuleProvider<CompanyAbnNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public CompanyAbnNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
