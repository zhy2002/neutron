package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonListNode extends ListUiNode<ApplicationNode,PersonNode> {

    private PersonListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(PersonListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonListNode.class;
    }

    private PersonListNodeComponent component;

    @Inject
    void createComponent(PersonListNodeComponent.Builder builder) {
        this.component = builder.setPersonListNodeModule(new PersonListNodeModule(this)).build();
    }

    @Override
    protected PersonListNodeRuleProvider getRuleProvider() {
        return component.getPersonListNodeRuleProvider();
    }

    public PersonListNode(@NotNull ApplicationNode parent, String name) {
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