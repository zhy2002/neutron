package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RelatedPartyListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RelatedPartyListNode extends ListUiNode<AdditionalNode,RelatedPartyNode> {

    @Inject
    public RelatedPartyListNode(@Owner AdditionalNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RelatedPartyListNode.class;
    }

    private RelatedPartyListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(RelatedPartyListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    protected final RelatedPartyListNodeComponent getComponent() {
        return component;
    }


    private RelatedPartyListNodeComponent component;

    @Inject
    void createComponent(RelatedPartyListNodeComponent.Builder builder) {
        this.component = builder.setRelatedPartyListNodeModule(new RelatedPartyListNodeModule(this)).build();
    }

    private RuleProvider<RelatedPartyListNode> getRuleProvider() {
        return component.getRelatedPartyListNodeRuleProvider();
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

    private RuleProvider<RelatedPartyListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<RelatedPartyNode> getItemClass() {
        return RelatedPartyNode.class;
    }

    @Override
    public NodeAddEvent<RelatedPartyNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<RelatedPartyNode> createItemRemoveEvent(RelatedPartyNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
