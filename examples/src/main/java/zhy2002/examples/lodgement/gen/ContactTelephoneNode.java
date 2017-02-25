package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ContactTelephoneNode extends TelephoneNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContactTelephoneNode.class;
    }

    private ContactTelephoneNodeComponent component;

    @Inject
    void createComponent(ContactTelephoneNodeComponent.Builder builder) {
        this.component = builder.setContactTelephoneNodeModule(new ContactTelephoneNodeModule(this)).build();
    }

    @Override
    protected ContactTelephoneNodeRuleProvider getRuleProvider() {
        return component.getContactTelephoneNodeRuleProvider();
    }

    public ContactTelephoneNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
