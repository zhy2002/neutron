package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonResponsibleLendNode extends ObjectUiNode<PersonNode> {

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

    private PersonResponsibleLendNodeComponent component;

    @Inject
    void createComponent(PersonResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setPersonResponsibleLendNodeModule(new PersonResponsibleLendNodeModule(this)).build();
    }

    @Override
    protected PersonResponsibleLendNodeRuleProvider getRuleProvider() {
        return component.getPersonResponsibleLendNodeRuleProvider();
    }

    public PersonResponsibleLendNode(@NotNull PersonNode parent, String name) {
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
