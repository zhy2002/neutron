package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyRegistrationDateNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyRegistrationDateNode.class;
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

    public CompanyRegistrationDateNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
