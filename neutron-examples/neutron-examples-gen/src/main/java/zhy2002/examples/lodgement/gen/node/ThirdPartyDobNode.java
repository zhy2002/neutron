package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyDobNode extends DobNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDobNode.class;
    }

    private ThirdPartyDobNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDobNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDobNodeModule(new ThirdPartyDobNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyDobNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyDobNodeRuleProvider();
    }

    public ThirdPartyDobNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}