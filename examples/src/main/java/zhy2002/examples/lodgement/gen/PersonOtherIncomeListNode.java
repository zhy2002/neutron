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

public class PersonOtherIncomeListNode extends ListUiNode<PersonNode,PersonOtherIncomeListNode,PersonOtherIncomeNode>
{
    private PersonOtherIncomeListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(PersonOtherIncomeListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonOtherIncomeListNode> config = classRegistry.getUiNodeConfig(PersonOtherIncomeListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonOtherIncomeListNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PersonOtherIncomeNode> getItemClass() {
        return PersonOtherIncomeNode.class;
    }

    @Override
    protected <M extends PersonOtherIncomeNode> PersonOtherIncomeNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createPersonOtherIncomeNode(name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Other Incomes");
    }



}
