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

public class PersonListNode extends ListUiNode<ApplicationNode,PersonNode>
{
    private PersonListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(PersonListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonListNode.class;
    }

    public PersonListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PersonNode> getItemClass() {
        return PersonNode.class;
    }

    public NodeAddEvent<PersonNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<PersonNode> createItemRemoveEvent(PersonNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedIndex(0);
        setNodeLabel("Person Applicant");
    }

}
