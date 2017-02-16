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

public class PersonResponsibleLendNode extends ObjectUiNode<PersonNode>
{
    private PersonTypeOfChangeNode personTypeOfChangeNode;
    private PersonMitigationMethodNode personMitigationMethodNode;
    private PersonSignificantChangeFlagNode personSignificantChangeFlagNode;
    private PersonRepaymentDifficultyNode personRepaymentDifficultyNode;

    private PersonResponsibleLendNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonResponsibleLendNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonResponsibleLendNode.class;
    }

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
        personTypeOfChangeNode = childFactory.createPersonTypeOfChangeNode();
        children.add(personTypeOfChangeNode);
        personMitigationMethodNode = childFactory.createPersonMitigationMethodNode();
        children.add(personMitigationMethodNode);
        personSignificantChangeFlagNode = childFactory.createPersonSignificantChangeFlagNode();
        children.add(personSignificantChangeFlagNode);
        personRepaymentDifficultyNode = childFactory.createPersonRepaymentDifficultyNode();
        children.add(personRepaymentDifficultyNode);
        return children;
    }

}
