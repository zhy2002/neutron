package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.EmailChangeReasonRule;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.StringUiNode;

@JsType
public class EmailNode extends StringUiNode<RegisterNode> {

    protected EmailNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        setStateValueInternal(PredefinedUiNodeStateKeys.DISABLED, false);

        EmailChangeReasonRule emailChangeReasonRule = new EmailChangeReasonRule(this);
        emailChangeReasonRule.addToOwner();
    }

    @Override
    protected void doUnload() {

    }

    public void setTriggeredBy(String triggeredBy) {
        this.setStateValue("triggeredBy", String.class, triggeredBy);
    }

    public void setValue(String email) {
        setValue(String.class, email);
    }

    public String getTriggeredBy() {
        return getStateValue("triggeredBy");
    }
}
