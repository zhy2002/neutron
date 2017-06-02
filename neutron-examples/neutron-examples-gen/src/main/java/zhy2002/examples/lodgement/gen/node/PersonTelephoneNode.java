package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonTelephoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonTelephoneNode extends TelephoneNode<PersonContactNode> {

    @Inject
    protected PersonTelephoneNode(@Owner PersonContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonTelephoneNode.class;
    }

    protected final PersonTelephoneNodeComponent getComponent() {
        return component;
    }


    private PersonTelephoneNodeComponent component;

    @Inject
    void createComponent(PersonTelephoneNodeComponent.Builder builder) {
        this.component = builder.setPersonTelephoneNodeModule(new PersonTelephoneNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
