package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public  class ErrorListNode extends ListUiNode<ApplicationNode,ErrorListNode,ErrorNode>
{
    protected ErrorListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @JsMethod
    public String getFocus() {
        return getStateValue(ApplicationNodeConstants.FOCUS);
    }

    @JsMethod
    public void setFocus(String value) {
        setStateValue(ApplicationNodeConstants.FOCUS, String.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(ChangeFocusErrorRule.class, this))
        ;
    }
}
