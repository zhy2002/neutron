package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.di.PersonNodeScope;
import zhy2002.examples.lodgement.gen.node.FirstNameNode;
import zhy2002.examples.lodgement.gen.node.LastNameNode;
import zhy2002.examples.lodgement.gen.node.PersonNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UpdateItemNodeLabelRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;

@PersonNodeScope
public class UpdatePersonNodeLabelRuleImpl extends UpdateItemNodeLabelRule<PersonNode> {

    @Inject
    public UpdatePersonNodeLabelRuleImpl(@Owner PersonNode owner) {
        super(owner);
    }

    private PersonNode getPersonNode() {
        return getOwner();
    }

    private FirstNameNode getFirstNameNode() {
        return getPersonNode().getPersonGeneralNode().getFirstNameNode();
    }

    private LastNameNode getLastNameNode() {
        return getPersonNode().getPersonGeneralNode().getLastNameNode();
    }

    @Owner
    protected boolean filter(UiNodeEvent event) {
        FirstNameNode firstNameNode = getFirstNameNode();
        LastNameNode lastNameNode = getLastNameNode();
        return event.getOrigin() == firstNameNode || event.getOrigin() == lastNameNode;
    }

    @Owner
    protected void updateLabel(UiNodeEvent event) {
        String firstName = getFirstNameNode().getValue();
        String lastName = getLastNameNode().getValue();

        if (!ValueUtil.isEmpty(firstName) || !ValueUtil.isEmpty(lastName)) {
            getPersonNode().setNodeLabel(firstName + " " + lastName);
        } else {
            getPersonNode().setNodeLabel("[Person " + (getPersonNode().getIndex() + 1) + "]");
        }
    }
}
