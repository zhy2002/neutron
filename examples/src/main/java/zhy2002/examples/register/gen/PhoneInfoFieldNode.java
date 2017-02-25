package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;

public abstract class PhoneInfoFieldNode extends StringUiNode<PhoneInfoNode> {

    @Override
    protected abstract PhoneInfoFieldNodeRuleProvider getRuleProvider();

    public PhoneInfoFieldNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}
