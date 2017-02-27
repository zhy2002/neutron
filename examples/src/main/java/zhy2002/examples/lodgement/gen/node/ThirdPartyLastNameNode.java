package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyLastNameNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyLastNameNode.class;
    }

    private ThirdPartyLastNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyLastNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyLastNameNodeModule(new ThirdPartyLastNameNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyLastNameNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyLastNameNodeRuleProvider();
    }

    public ThirdPartyLastNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
