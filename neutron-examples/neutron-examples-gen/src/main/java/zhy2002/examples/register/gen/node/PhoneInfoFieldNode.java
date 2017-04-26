package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;

public abstract class PhoneInfoFieldNode extends StringUiNode<PhoneInfoNode> {


    public PhoneInfoFieldNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}
