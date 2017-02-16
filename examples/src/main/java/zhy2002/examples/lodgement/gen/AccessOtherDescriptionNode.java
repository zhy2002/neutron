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

public class AccessOtherDescriptionNode extends StringUiNode<AccessNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AccessOtherDescriptionNode.class;
    }

    public AccessOtherDescriptionNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
