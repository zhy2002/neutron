package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherLiabilityTypeNode extends StringUiNode<OtherLiabilityNode> {
    private OtherLiabilityTypeNodeComponent component;

    public OtherLiabilityTypeNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityTypeNode.class;
    }

    @Inject
    void createComponent(OtherLiabilityTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityTypeNodeModule(new OtherLiabilityTypeNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityTypeNode> getRuleProvider() {
        return component.getOtherLiabilityTypeNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
