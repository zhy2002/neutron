package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyTrustNode extends ObjectUiNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyTrustNode.class;
    }

    private CompanyTrustNodeComponent component;

    @Inject
    void createComponent(CompanyTrustNodeComponent.Builder builder) {
        this.component = builder.setCompanyTrustNodeModule(new CompanyTrustNodeModule(this)).build();
    }

    @Override
    protected CompanyTrustNodeRuleProvider getRuleProvider() {
        return component.getCompanyTrustNodeRuleProvider();
    }

    public CompanyTrustNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}
