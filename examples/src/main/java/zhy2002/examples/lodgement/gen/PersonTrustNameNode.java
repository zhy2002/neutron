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

public class PersonTrustNameNode extends StringUiNode<PersonTrustNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustNameNode.class;
    }

    private PersonTrustNameNodeComponent component;

    @Inject
    void createComponent(PersonTrustNameNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustNameNodeModule(new PersonTrustNameNodeModule(this)).build();
    }

    @Override
    protected PersonTrustNameNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustNameNodeRuleProvider();
    }

    public PersonTrustNameNode(PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
