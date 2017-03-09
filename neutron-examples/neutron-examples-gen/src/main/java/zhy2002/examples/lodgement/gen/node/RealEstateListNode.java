package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RealEstateListNode extends ListUiNode<ApplicationNode,RealEstateNode> {

    private RealEstateListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(RealEstateListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RealEstateListNode.class;
    }

    private RealEstateListNodeComponent component;

    @Inject
    void createComponent(RealEstateListNodeComponent.Builder builder) {
        this.component = builder.setRealEstateListNodeModule(new RealEstateListNodeModule(this)).build();
    }

    private RealEstateListNodeRuleProvider getRuleProvider() {
        return component.getRealEstateListNodeRuleProvider();
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

    private RuleProvider<RealEstateListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public RealEstateListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<RealEstateNode> getItemClass() {
        return RealEstateNode.class;
    }

    public NodeAddEvent<RealEstateNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<RealEstateNode> createItemRemoveEvent(RealEstateNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
