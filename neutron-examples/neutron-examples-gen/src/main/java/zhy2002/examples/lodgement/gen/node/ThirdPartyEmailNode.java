package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ThirdPartyEmailNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyEmailNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ThirdPartyEmailNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
