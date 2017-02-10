package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class PersonOtherIncomeNode extends ObjectUiNode<PersonOtherIncomeListNode>
{
    private PersonAddBackTypeNode personAddBackTypeNode;
    private PersonOtherIncomeAmountNode personOtherIncomeAmountNode;
    private PersonOtherIncomeDescriptionNode personOtherIncomeDescriptionNode;
    private PersonOtherIncomePreviousYearNode personOtherIncomePreviousYearNode;
    private PersonOtherIncomeTypeNode personOtherIncomeTypeNode;

    private PersonOtherIncomeNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonOtherIncomeNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonOtherIncomeNode> config = classRegistry.getUiNodeConfig(PersonOtherIncomeNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonOtherIncomeNode(PersonOtherIncomeListNode parent, String name) {
        super(parent, name);
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
    public PersonOtherIncomeDescriptionNode getPersonOtherIncomeDescriptionNode() {
        return personOtherIncomeDescriptionNode;
    }

    @JsMethod
    public PersonOtherIncomePreviousYearNode getPersonOtherIncomePreviousYearNode() {
        return personOtherIncomePreviousYearNode;
    }

    @JsMethod
    public PersonOtherIncomeTypeNode getPersonOtherIncomeTypeNode() {
        return personOtherIncomeTypeNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        personAddBackTypeNode = childFactory.createPersonAddBackTypeNode();
        children.add(personAddBackTypeNode);
        personOtherIncomeAmountNode = childFactory.createPersonOtherIncomeAmountNode();
        children.add(personOtherIncomeAmountNode);
        personOtherIncomeDescriptionNode = childFactory.createPersonOtherIncomeDescriptionNode();
        children.add(personOtherIncomeDescriptionNode);
        personOtherIncomePreviousYearNode = childFactory.createPersonOtherIncomePreviousYearNode();
        children.add(personOtherIncomePreviousYearNode);
        personOtherIncomeTypeNode = childFactory.createPersonOtherIncomeTypeNode();
        children.add(personOtherIncomeTypeNode);
        return children;
    }



}
