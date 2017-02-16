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

public class SavingsAccountNoNode extends StringUiNode<SavingsAccountNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountNoNode.class;
    }

    public SavingsAccountNoNode(SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
