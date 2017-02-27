package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyContactNode extends ObjectUiNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactNode.class;
    }

    private CompanyContactNodeComponent component;

    @Inject
    void createComponent(CompanyContactNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactNodeModule(new CompanyContactNodeModule(this)).build();
    }

    @Override
    protected CompanyContactNodeRuleProvider getRuleProvider() {
        return component.getCompanyContactNodeRuleProvider();
    }

    public CompanyContactNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}
