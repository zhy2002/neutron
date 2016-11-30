package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.*;
import zhy2002.neutron.NotImplementedException;
import zhy2002.neutron.StringUiNode;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        getContext().getInstance(UsernameLengthRule.Factory.class).create(this).addToOwner();
        getContext().getInstance(UsernameInvalidCharRule.Factory.class).create(this).addToOwner();
        getContext().getInstance(UsernameIsRequiredRule.Factory.class).create(this).addToOwner();
    }

}
