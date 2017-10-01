package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.FirstNameNode;
import zhy2002.mortgage.application.gen.node.LastNameNode;
import zhy2002.mortgage.application.gen.node.PersonNode;
import zhy2002.mortgage.application.gen.node.TitleNode;
import zhy2002.neutron.core.UiNodeEvent;
import zhy2002.neutron.core.rule.AbstractUpdateItemNodeLabelRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;


public class UpdatePersonNodeLabelRule extends AbstractUpdateItemNodeLabelRule<PersonNode> {

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
            label = "[Person " + (Integer.parseInt(getOwner().getName()) + 1) + "]";
        }
        getPersonNode().setNodeLabel(label);
    }
}
