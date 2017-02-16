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

public class PersonTrustAddressNode extends AddressNode<PersonTrustNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustAddressNode.class;
    }

    public PersonTrustAddressNode(PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
