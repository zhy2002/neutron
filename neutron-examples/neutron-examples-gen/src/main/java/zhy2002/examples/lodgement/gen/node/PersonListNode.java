package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonListNode extends ListUiNode<ApplicationNode,PersonNode> {
    private PersonListNodeItemFactory itemFactory;
    private PersonListNodeComponent component;

    public PersonListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonListNode.class;
    }

    @Inject
    void receiveNodeProvider(PersonListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

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
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<PersonNode> createItemRemoveEvent(PersonNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
