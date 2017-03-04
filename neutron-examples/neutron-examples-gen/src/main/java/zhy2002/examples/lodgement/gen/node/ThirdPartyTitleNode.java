package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ThirdPartyTitleNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyTitleNode.class;
    }

    private ThirdPartyTitleNodeComponent component;

    @Inject
    void createComponent(ThirdPartyTitleNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyTitleNodeModule(new ThirdPartyTitleNodeModule(this)).build();
    }

    @Override
    protected ThirdPartyTitleNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyTitleNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ThirdPartyTitleNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
