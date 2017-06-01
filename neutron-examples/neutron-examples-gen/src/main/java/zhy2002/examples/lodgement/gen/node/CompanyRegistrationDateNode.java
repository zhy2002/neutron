package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyRegistrationDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyRegistrationDateNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyRegistrationDateNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyRegistrationDateNode.class;
    }

    protected final CompanyRegistrationDateNodeComponent getComponent() {
        return component;
    }


    private CompanyRegistrationDateNodeComponent component;

    @Inject
    void createComponent(CompanyRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegistrationDateNodeModule(new CompanyRegistrationDateNodeModule(this)).build();
    }

    private RuleProvider<CompanyRegistrationDateNode> getRuleProvider() {
        return component.getCompanyRegistrationDateNodeRuleProvider();
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

    private RuleProvider<CompanyRegistrationDateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
