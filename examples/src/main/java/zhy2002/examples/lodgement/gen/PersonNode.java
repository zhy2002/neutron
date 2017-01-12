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
    private CurrentEmploymentListNode currentEmploymentListNode;
    private PreviousEmploymentListNode previousEmploymentListNode;

    protected PersonNode(PersonListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("generalNode");
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
    public CurrentEmploymentListNode getCurrentEmploymentListNode() {
        return currentEmploymentListNode;
    }

    @JsMethod
    public PreviousEmploymentListNode getPreviousEmploymentListNode() {
        return previousEmploymentListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        generalNode = context.createChildNode(GeneralNode.class, this, "generalNode");
        contactNode = context.createChildNode(ContactNode.class, this, "contactNode");
        currentEmploymentListNode = context.createChildNode(CurrentEmploymentListNode.class, this, "currentEmploymentListNode");
        previousEmploymentListNode = context.createChildNode(PreviousEmploymentListNode.class, this, "previousEmploymentListNode");

        return Arrays.asList(
            generalNode,
            contactNode,
            currentEmploymentListNode,
            previousEmploymentListNode
        );
    }



}
