package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyContactLastNameNode extends StringUiNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactLastNameNode.class;
    }

    private CompanyContactLastNameNodeComponent component;

    @Inject
    void createComponent(CompanyContactLastNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactLastNameNodeModule(new CompanyContactLastNameNodeModule(this)).build();
    }

    @Override
    protected CompanyContactLastNameNodeRuleProvider getRuleProvider() {
        return component.getCompanyContactLastNameNodeRuleProvider();
    }

    public CompanyContactLastNameNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}
