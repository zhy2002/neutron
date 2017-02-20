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

public class PersonOtherIncomeListNode extends ListUiNode<PersonNode,PersonOtherIncomeNode>
{
    private PersonOtherIncomeListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(PersonOtherIncomeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeListNode.class;
    }

    public PersonOtherIncomeListNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PersonOtherIncomeNode> getItemClass() {
        return PersonOtherIncomeNode.class;
    }

    public NodeAddEvent<PersonOtherIncomeNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<PersonOtherIncomeNode> createItemRemoveEvent(PersonOtherIncomeNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Other Incomes");
    }

}
