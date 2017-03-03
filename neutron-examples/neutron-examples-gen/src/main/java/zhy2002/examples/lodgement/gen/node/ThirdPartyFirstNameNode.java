package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyFirstNameNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyFirstNameNode.class;
    }

    private ThirdPartyFirstNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyFirstNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyFirstNameNodeModule(new ThirdPartyFirstNameNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyFirstNameNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyFirstNameNodeRuleProvider();
    }

    public ThirdPartyFirstNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
