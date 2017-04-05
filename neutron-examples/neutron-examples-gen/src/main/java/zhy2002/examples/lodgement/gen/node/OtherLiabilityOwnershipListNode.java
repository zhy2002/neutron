package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityOwnershipListNode extends OwnershipListNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityOwnershipListNode.class;
    }

    private OtherLiabilityOwnershipListNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityOwnershipListNodeModule(new OtherLiabilityOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityOwnershipListNode> getRuleProvider() {
        return component.getOtherLiabilityOwnershipListNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherLiabilityOwnershipListNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
