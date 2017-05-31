package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyContactLastNameNode extends StringUiNode<CompanyContactNode> {
    private CompanyContactLastNameNodeComponent component;

    public CompanyContactLastNameNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactLastNameNode.class;
    }

    @Inject
    void createComponent(CompanyContactLastNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactLastNameNodeModule(new CompanyContactLastNameNodeModule(this)).build();
    }

    private RuleProvider<CompanyContactLastNameNode> getRuleProvider() {
        return component.getCompanyContactLastNameNodeRuleProvider();
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

    private RuleProvider<CompanyContactLastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
