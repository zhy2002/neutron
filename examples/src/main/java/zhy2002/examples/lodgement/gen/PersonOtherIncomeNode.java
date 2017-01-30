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

public  class PersonOtherIncomeNode extends ObjectUiNode<PersonOtherIncomeListNode>
{
    private PersonOtherIncomeTypeNode personOtherIncomeTypeNode;
    private PersonAddBackTypeNode personAddBackTypeNode;
    private PersonOtherIncomeAmountNode personOtherIncomeAmountNode;
    private PersonOtherIncomePreviousYearNode personOtherIncomePreviousYearNode;

    protected PersonOtherIncomeNode(PersonOtherIncomeListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public PersonOtherIncomeTypeNode getPersonOtherIncomeTypeNode() {
        return personOtherIncomeTypeNode;
    }

    @JsMethod
    public PersonAddBackTypeNode getPersonAddBackTypeNode() {
        return personAddBackTypeNode;
    }

    @JsMethod
    public PersonOtherIncomeAmountNode getPersonOtherIncomeAmountNode() {
        return personOtherIncomeAmountNode;
    }

    @JsMethod
    public PersonOtherIncomePreviousYearNode getPersonOtherIncomePreviousYearNode() {
        return personOtherIncomePreviousYearNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        personOtherIncomeTypeNode = context.createChildNode(PersonOtherIncomeTypeNode.class, this, "personOtherIncomeTypeNode");
        children.add(personOtherIncomeTypeNode);
        personAddBackTypeNode = context.createChildNode(PersonAddBackTypeNode.class, this, "personAddBackTypeNode");
        children.add(personAddBackTypeNode);
        personOtherIncomeAmountNode = context.createChildNode(PersonOtherIncomeAmountNode.class, this, "personOtherIncomeAmountNode");
        children.add(personOtherIncomeAmountNode);
        personOtherIncomePreviousYearNode = context.createChildNode(PersonOtherIncomePreviousYearNode.class, this, "personOtherIncomePreviousYearNode");
        children.add(personOtherIncomePreviousYearNode);
        return children;
    }



}
