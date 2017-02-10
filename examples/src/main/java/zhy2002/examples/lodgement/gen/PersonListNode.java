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

public class PersonListNode extends ListUiNode<ApplicationNode,PersonListNode,PersonNode>
{
    private PersonListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(PersonListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonListNode> config = classRegistry.getUiNodeConfig(PersonListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PersonNode> getItemClass() {
        return PersonNode.class;
    }

    @Override
    protected <M extends PersonNode> PersonNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createPersonNode(name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedIndex(0);
        setNodeLabel("Person Applicant");
    }



}
