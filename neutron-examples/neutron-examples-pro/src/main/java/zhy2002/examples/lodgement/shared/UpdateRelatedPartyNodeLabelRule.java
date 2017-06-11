package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.RelatedPartyNode;
import zhy2002.examples.lodgement.gen.node.ThirdPartyFirstNameNode;
import zhy2002.examples.lodgement.gen.node.ThirdPartyLastNameNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UpdateItemNodeLabelRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;


public class UpdateRelatedPartyNodeLabelRule extends UpdateItemNodeLabelRule<RelatedPartyNode> {

    @Inject
    public UpdateRelatedPartyNodeLabelRule(@Owner RelatedPartyNode owner) {
        super(owner);
    }

    protected RelatedPartyNode getRelatedPartyNode() {
        return getOwner();
    }

    private ThirdPartyFirstNameNode getFirstNameNode() {
        return getRelatedPartyNode().getThirdPartyFirstNameNode();
    }

    private ThirdPartyLastNameNode getLastNameNode() {
        return getRelatedPartyNode().getThirdPartyLastNameNode();
    }

    @Owner
    protected boolean filter(UiNodeEvent event) {
        ThirdPartyFirstNameNode firstNameNode = getFirstNameNode();
        ThirdPartyLastNameNode lastNameNode = getLastNameNode();
        return event.getOrigin() == firstNameNode || event.getOrigin() == lastNameNode;
    }

    @Owner
    protected void updateLabel(UiNodeEvent event) {
        String firstName = getFirstNameNode().getValue();
        String lastName = getLastNameNode().getValue();

        if (!ValueUtil.isEmpty(firstName) || !ValueUtil.isEmpty(lastName)) {
            getRelatedPartyNode().setNodeLabel(firstName + " " + lastName);
        } else {
            getRelatedPartyNode().setNodeLabel("[Related Party " + (Integer.parseInt(getRelatedPartyNode().getName()) + 1) + "]");
        }
    }
}
