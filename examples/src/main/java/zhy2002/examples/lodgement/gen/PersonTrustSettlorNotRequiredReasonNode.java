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

public class PersonTrustSettlorNotRequiredReasonNode extends StringUiNode<PersonTrustNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustSettlorNotRequiredReasonNode.class;
    }

    private PersonTrustSettlorNotRequiredReasonNodeComponent component;

    @Inject
    void createComponent(PersonTrustSettlorNotRequiredReasonNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustSettlorNotRequiredReasonNodeModule(new PersonTrustSettlorNotRequiredReasonNodeModule(this)).build();
    }

    @Override
    protected PersonTrustSettlorNotRequiredReasonNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustSettlorNotRequiredReasonNodeRuleProvider();
    }

    public PersonTrustSettlorNotRequiredReasonNode(PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
