package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyDescriptionNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDescriptionNode.class;
    }

    private ThirdPartyDescriptionNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDescriptionNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDescriptionNodeModule(new ThirdPartyDescriptionNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyDescriptionNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyDescriptionNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ThirdPartyDescriptionNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
