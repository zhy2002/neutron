package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyRegistrationStateNode extends StringUiNode<CompanyGeneralNode> {

    private CompanyRegistrationStateNodeComponent component;

    @Inject
    public CompanyRegistrationStateNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyRegistrationStateNode.class;
    }

    @Inject
    void createComponent(CompanyRegistrationStateNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegistrationStateNodeModule(new CompanyRegistrationStateNodeModule(this)).build();
    }

    private RuleProvider<CompanyRegistrationStateNode> getRuleProvider() {
        return component.getCompanyRegistrationStateNodeRuleProvider();
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

    private RuleProvider<CompanyRegistrationStateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
