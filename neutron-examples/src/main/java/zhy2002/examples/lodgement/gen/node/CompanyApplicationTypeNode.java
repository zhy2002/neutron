package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyApplicationTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyApplicationTypeNode.class;
    }

    private CompanyApplicationTypeNodeComponent component;

    @Inject
    void createComponent(CompanyApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyApplicationTypeNodeModule(new CompanyApplicationTypeNodeModule(this)).build();
    }

    @Override
    protected CompanyApplicationTypeNodeRuleProvider getRuleProvider() {
        return component.getCompanyApplicationTypeNodeRuleProvider();
    }

    public CompanyApplicationTypeNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
