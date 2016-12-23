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

public  class EmailNode extends StringUiNode<RegisterNode>
{
    EmailNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setPattern("\\w+@\\w+\\.[\\w.]+");
        setPatternMessage("Email format is invalid.");
        setRequiredMessage("Email is required.");
    }

    @JsMethod
    public String getTriggeredBy() {
        return getStateValue(RegisterNodeConstants.TRIGGERED_BY);
    }

    @JsMethod
    public void setTriggeredBy(String value) {
        setStateValue(RegisterNodeConstants.TRIGGERED_BY, String.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(EmailChangeReasonRule.class, this))
        ;
    }
}
