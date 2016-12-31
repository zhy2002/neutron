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


public  class PersonListNode extends ListUiNode<ApplicationNode,PersonListNode,PersonNode>
{
    protected PersonListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    public Class<PersonNode> getItemClass() {
        return PersonNode.class;
    }

    @JsMethod
    public int getSelectedIndex() {
        return getStateValue(ApplicationNodeConstants.SELECTED_INDEX, 0);
    }

    @JsMethod
    public void setSelectedIndex(int value) {
        setStateValue(ApplicationNodeConstants.SELECTED_INDEX, Integer.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(UpdateSelectedIndexRule.class, this))
        ;
    }
}
