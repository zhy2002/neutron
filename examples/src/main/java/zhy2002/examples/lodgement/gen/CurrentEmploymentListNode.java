package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CurrentEmploymentListNode extends ListUiNode<PersonNode,CurrentEmploymentNode>
{
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

    @Override
    protected CurrentEmploymentListNodeRuleProvider getRuleProvider() {
        return component.getCurrentEmploymentListNodeRuleProvider();
    }

    public CurrentEmploymentListNode(PersonNode parent, String name) {
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

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Current Employment");
    }

}
