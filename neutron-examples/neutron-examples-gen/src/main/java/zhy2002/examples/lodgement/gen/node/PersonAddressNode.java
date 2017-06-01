package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonAddressNode extends AddressNode<PersonContactNode> {

    @Inject
    public PersonAddressNode(@Owner PersonContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonAddressNode.class;
    }

    protected final PersonAddressNodeComponent getComponent() {
        return component;
    }


    private PersonAddressNodeComponent component;

    @Inject
    void createComponent(PersonAddressNodeComponent.Builder builder) {
        this.component = builder.setPersonAddressNodeModule(new PersonAddressNodeModule(this)).build();
    }

    private RuleProvider<PersonAddressNode> getRuleProvider() {
        return component.getPersonAddressNodeRuleProvider();
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

    private RuleProvider<PersonAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
