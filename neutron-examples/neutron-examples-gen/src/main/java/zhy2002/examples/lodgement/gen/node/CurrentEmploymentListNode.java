package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CurrentEmploymentListNode extends ListUiNode<PersonNode,CurrentEmploymentNode> {

    private CurrentEmploymentListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CurrentEmploymentListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CurrentEmploymentListNode.class;
    }

    private CurrentEmploymentListNodeComponent component;

    @Inject
    void createComponent(CurrentEmploymentListNodeComponent.Builder builder) {
        this.component = builder.setCurrentEmploymentListNodeModule(new CurrentEmploymentListNodeModule(this)).build();
    }

    private CurrentEmploymentListNodeRuleProvider getRuleProvider() {
        return component.getCurrentEmploymentListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CurrentEmploymentListNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CurrentEmploymentNode> getItemClass() {
        return CurrentEmploymentNode.class;
    }

    public NodeAddEvent<CurrentEmploymentNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<CurrentEmploymentNode> createItemRemoveEvent(CurrentEmploymentNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
