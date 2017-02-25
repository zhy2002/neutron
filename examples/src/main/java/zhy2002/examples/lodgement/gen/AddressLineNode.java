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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class AddressLineNode extends StringUiNode<AddressNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return AddressLineNode.class;
    }

    private AddressLineNodeComponent component;

    @Inject
    void createComponent(AddressLineNodeComponent.Builder builder) {
        this.component = builder.setAddressLineNodeModule(new AddressLineNodeModule(this)).build();
    }

    @Override
    protected AddressLineNodeRuleProvider getRuleProvider() {
        return component.getAddressLineNodeRuleProvider();
    }

    public AddressLineNode(AddressNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
