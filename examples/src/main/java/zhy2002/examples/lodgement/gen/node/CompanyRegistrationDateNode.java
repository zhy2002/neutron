package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected CompanyRegistrationDateNodeRuleProvider getRuleProvider() {
        return component.getCompanyRegistrationDateNodeRuleProvider();
    }

    public CompanyRegistrationDateNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
