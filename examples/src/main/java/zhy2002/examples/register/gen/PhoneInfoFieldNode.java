package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;

public abstract class PhoneInfoFieldNode extends StringUiNode<PhoneInfoNode> {

    @Override
    protected abstract PhoneInfoFieldNodeRuleProvider getRuleProvider();

    public PhoneInfoFieldNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}
