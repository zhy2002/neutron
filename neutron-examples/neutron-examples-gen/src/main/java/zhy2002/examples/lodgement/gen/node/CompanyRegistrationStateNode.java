package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyRegistrationStateNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyRegistrationStateNode.class;
    }

    private CompanyRegistrationStateNodeComponent component;

    @Inject
    void createComponent(CompanyRegistrationStateNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegistrationStateNodeModule(new CompanyRegistrationStateNodeModule(this)).build();
    }

    @Override
    protected CompanyRegistrationStateNodeRuleProvider getRuleProvider() {
        return component.getCompanyRegistrationStateNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyRegistrationStateNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
