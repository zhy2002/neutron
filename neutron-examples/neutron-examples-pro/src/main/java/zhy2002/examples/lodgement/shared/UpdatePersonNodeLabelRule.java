package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.di.PersonNodeScope;
import zhy2002.examples.lodgement.gen.node.FirstNameNode;
import zhy2002.examples.lodgement.gen.node.LastNameNode;
import zhy2002.examples.lodgement.gen.node.PersonNode;
import zhy2002.examples.lodgement.gen.node.TitleNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UpdateItemNodeLabelRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;

@PersonNodeScope
public class UpdatePersonNodeLabelRule extends UpdateItemNodeLabelRule<PersonNode> {

    @Inject
    public UpdatePersonNodeLabelRule(@Owner PersonNode owner) {
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

    private TitleNode getTitleNode() {
        return getPersonNode().getPersonGeneralNode().getTitleNode();
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
        String title = getTitleNode().getValue();

        String label;
        if (!ValueUtil.isEmpty(firstName) || !ValueUtil.isEmpty(lastName)) {
            label = firstName + " " + lastName;
            if (!ValueUtil.isEmpty(title)) {
                label = title + " " + label;
            }
        } else {
            label = "[Person " + (getPersonNode().getIndex() + 1) + "]";
        }
        getPersonNode().setNodeLabel(label);
    }
}
