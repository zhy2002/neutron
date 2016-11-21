package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.EmailChangeReasonRule;
import zhy2002.neutron.DefaultUiNodeStateKeys;
import zhy2002.neutron.StringUiNode;

@JsType
public class EmailNode extends StringUiNode<RegisterNode> {

    protected EmailNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        setStateValueInternal(DefaultUiNodeStateKeys.DISABLED, false);

        EmailChangeReasonRule emailChangeReasonRule = new EmailChangeReasonRule(this);
        emailChangeReasonRule.addToOwner();
    }

    @Override
    protected void doUnload() {

    }


}
