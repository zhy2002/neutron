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

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedIndex(0);
        setNodeLabel("Person Applicant");
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
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(UpdateSelectedIndexRule.class, this));
    }


}