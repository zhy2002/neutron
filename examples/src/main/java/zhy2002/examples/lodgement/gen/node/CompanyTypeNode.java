package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyTypeNode.class;
    }

    private CompanyTypeNodeComponent component;

    @Inject
    void createComponent(CompanyTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyTypeNodeModule(new CompanyTypeNodeModule(this)).build();
    }

    @Override
    protected CompanyTypeNodeRuleProvider getRuleProvider() {
        return component.getCompanyTypeNodeRuleProvider();
    }

    public CompanyTypeNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
