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


public  class PasswordNode extends StringUiNode<RegisterNode>
{
    protected PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public String getMessage() {
        return getStateValue(RegisterNodeConstants.MESSAGE);
    }

    @JsMethod
    public void setMessage(String value) {
        setStateValue(RegisterNodeConstants.MESSAGE, String.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(PasswordIsStrongRule.class, this))
        ;
    }
}
