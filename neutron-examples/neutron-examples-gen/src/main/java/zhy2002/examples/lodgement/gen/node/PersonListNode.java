package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class PersonListNode extends ListUiNode<ApplicationNode,PersonNode> {

    @Inject
    public PersonListNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonListNode.class;
    }

    protected final PersonListNodeComponent getComponent() {
        return component;
    }


    private PersonListNodeComponent component;

    @Inject
    void createComponent(PersonListNodeComponent.Builder builder) {
        this.component = builder.setPersonListNodeModule(new PersonListNodeModule(this)).build();
    }

    private RuleProvider<PersonListNode> getRuleProvider() {
        return component.getPersonListNodeRuleProvider();
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

    private RuleProvider<PersonListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<PersonNode> getItemClass() {
        return PersonNode.class;
    }

    @Override
    public NodeAddEvent<PersonNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        PersonNode item = getComponent().createPersonNode();
        setNameOfChildBeingCreated(null);
        return new PersonNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<PersonNode> createItemRemoveEvent(PersonNode item) {
        return new PersonNodeRemoveEvent(item);
    }

}
