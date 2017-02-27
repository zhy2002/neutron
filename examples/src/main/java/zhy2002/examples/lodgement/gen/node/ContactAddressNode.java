package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ContactAddressNode extends AddressNode<BaseContactNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContactAddressNode.class;
    }

    private ContactAddressNodeComponent component;

    @Inject
    void createComponent(ContactAddressNodeComponent.Builder builder) {
        this.component = builder.setContactAddressNodeModule(new ContactAddressNodeModule(this)).build();
    }

    @Override
    protected ContactAddressNodeRuleProvider getRuleProvider() {
        return component.getContactAddressNodeRuleProvider();
    }

    public ContactAddressNode(@NotNull BaseContactNode<?> parent, String name) {
        super(parent, name);
    }

}
