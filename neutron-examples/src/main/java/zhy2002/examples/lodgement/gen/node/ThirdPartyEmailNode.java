package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyEmailNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyEmailNode.class;
    }

    private ThirdPartyEmailNodeComponent component;

    @Inject
    void createComponent(ThirdPartyEmailNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyEmailNodeModule(new ThirdPartyEmailNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyEmailNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyEmailNodeRuleProvider();
    }

    public ThirdPartyEmailNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
