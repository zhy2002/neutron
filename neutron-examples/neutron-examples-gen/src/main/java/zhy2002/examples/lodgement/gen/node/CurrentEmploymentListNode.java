package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CurrentEmploymentListNode extends ListUiNode<PersonNode,CurrentEmploymentNode> {

    @Inject
    public CurrentEmploymentListNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CurrentEmploymentListNode.class;
    }

    private CurrentEmploymentListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CurrentEmploymentListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    private CurrentEmploymentListNodeComponent component;

    @Inject
    void createComponent(CurrentEmploymentListNodeComponent.Builder builder) {
        this.component = builder.setCurrentEmploymentListNodeModule(new CurrentEmploymentListNodeModule(this)).build();
    }

    private RuleProvider<CurrentEmploymentListNode> getRuleProvider() {
        return component.getCurrentEmploymentListNodeRuleProvider();
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

    private RuleProvider<CurrentEmploymentListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<CurrentEmploymentNode> getItemClass() {
        return CurrentEmploymentNode.class;
    }

    @Override
    public NodeAddEvent<CurrentEmploymentNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<CurrentEmploymentNode> createItemRemoveEvent(CurrentEmploymentNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
