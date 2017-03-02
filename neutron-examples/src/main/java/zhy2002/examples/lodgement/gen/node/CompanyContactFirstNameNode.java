package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyContactFirstNameNode extends StringUiNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactFirstNameNode.class;
    }

    private CompanyContactFirstNameNodeComponent component;

    @Inject
    void createComponent(CompanyContactFirstNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactFirstNameNodeModule(new CompanyContactFirstNameNodeModule(this)).build();
    }

    @Override
    protected CompanyContactFirstNameNodeRuleProvider getRuleProvider() {
        return component.getCompanyContactFirstNameNodeRuleProvider();
    }

    public CompanyContactFirstNameNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
