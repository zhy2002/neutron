package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherLiabilityListNode extends ListUiNode<LiabilitiesNode,OtherLiabilityNode> {

    private OtherLiabilityListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherLiabilityListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityListNode.class;
    }

    private OtherLiabilityListNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityListNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityListNodeModule(new OtherLiabilityListNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityListNode> getRuleProvider() {
        return component.getOtherLiabilityListNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OtherLiabilityListNode(@NotNull LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherLiabilityNode> getItemClass() {
        return OtherLiabilityNode.class;
    }

    @Override
    public NodeAddEvent<OtherLiabilityNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<OtherLiabilityNode> createItemRemoveEvent(OtherLiabilityNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
