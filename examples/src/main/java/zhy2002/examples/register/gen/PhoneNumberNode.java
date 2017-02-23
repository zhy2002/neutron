package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class PhoneNumberNode extends PhoneInfoFieldNode
{
    @Override
    public final Class<?> getConcreteClass() {
        return PhoneNumberNode.class;
    }

    private PhoneNumberNodeComponent component;

    @Inject
    void createComponent(PhoneNumberNodeComponent.Builder builder) {
        this.component = builder.setPhoneNumberNodeModule(new PhoneNumberNodeModule(this)).build();
    }

    @Override
    protected PhoneNumberNodeRuleProvider getRuleProvider() {
        return component.getPhoneNumberNodeRuleProvider();
    }

    public PhoneNumberNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Phone number is required.");
    }

}
