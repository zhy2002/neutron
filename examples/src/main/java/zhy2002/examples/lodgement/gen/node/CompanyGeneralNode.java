package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyGeneralNode extends ObjectUiNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyGeneralNode.class;
    }

    private CompanyGeneralNodeComponent component;

    @Inject
    void createComponent(CompanyGeneralNodeComponent.Builder builder) {
        this.component = builder.setCompanyGeneralNodeModule(new CompanyGeneralNodeModule(this)).build();
    }

    @Override
    protected CompanyGeneralNodeRuleProvider getRuleProvider() {
        return component.getCompanyGeneralNodeRuleProvider();
    }

    public CompanyGeneralNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}
