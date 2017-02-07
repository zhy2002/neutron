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

public  class PersonResponsibleLendNode extends ObjectUiNode<PersonNode>
{
    private PersonTypeOfChangeNode personTypeOfChangeNode;
    private PersonMitigationMethodNode personMitigationMethodNode;
    private PersonSignificantChangeFlagNode personSignificantChangeFlagNode;
    private PersonRepaymentDifficultyNode personRepaymentDifficultyNode;

    public PersonResponsibleLendNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public PersonTypeOfChangeNode getPersonTypeOfChangeNode() {
        return personTypeOfChangeNode;
    }

    @JsMethod
    public PersonMitigationMethodNode getPersonMitigationMethodNode() {
        return personMitigationMethodNode;
    }

    @JsMethod
    public PersonSignificantChangeFlagNode getPersonSignificantChangeFlagNode() {
        return personSignificantChangeFlagNode;
    }

    @JsMethod
    public PersonRepaymentDifficultyNode getPersonRepaymentDifficultyNode() {
        return personRepaymentDifficultyNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        personTypeOfChangeNode = context.createChildNode(PersonTypeOfChangeNode.class, this, "personTypeOfChangeNode");
        children.add(personTypeOfChangeNode);
        personMitigationMethodNode = context.createChildNode(PersonMitigationMethodNode.class, this, "personMitigationMethodNode");
        children.add(personMitigationMethodNode);
        personSignificantChangeFlagNode = context.createChildNode(PersonSignificantChangeFlagNode.class, this, "personSignificantChangeFlagNode");
        children.add(personSignificantChangeFlagNode);
        personRepaymentDifficultyNode = context.createChildNode(PersonRepaymentDifficultyNode.class, this, "personRepaymentDifficultyNode");
        children.add(personRepaymentDifficultyNode);
        return children;
    }



}
