package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityDescriptionNode extends StringUiNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityDescriptionNode.class;
    }

    private OtherLiabilityDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityDescriptionNodeModule(new OtherLiabilityDescriptionNodeModule(this)).build();
    }

    private OtherLiabilityDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityDescriptionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<OtherLiabilityDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherLiabilityDescriptionNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
