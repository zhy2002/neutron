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

public  class PersonNode extends ObjectUiNode<PersonListNode>
{
    private GeneralNode generalNode;
    private ContactNode contactNode;
    private CurrentEmploymentNode currentEmploymentNode;

    protected PersonNode(PersonListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("generalNode");
    }

    @JsMethod
    public String getSelectedName() {
        return getStateValue(ApplicationNodeConstants.SELECTED_NAME, "generalNode");
    }

    @JsMethod
    public void setSelectedName(String value) {
        setStateValue(ApplicationNodeConstants.SELECTED_NAME, String.class, value);
    }

    @JsMethod
    public GeneralNode getGeneralNode() {
        return generalNode;
    }

    @JsMethod
    public ContactNode getContactNode() {
        return contactNode;
    }

    @JsMethod
    public CurrentEmploymentNode getCurrentEmploymentNode() {
        return currentEmploymentNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        generalNode = context.createChildNode(GeneralNode.class, this, "generalNode");
        contactNode = context.createChildNode(ContactNode.class, this, "contactNode");
        currentEmploymentNode = context.createChildNode(CurrentEmploymentNode.class, this, "currentEmploymentNode");

        return Arrays.asList(
            generalNode,
            contactNode,
            currentEmploymentNode
        );
    }


}
