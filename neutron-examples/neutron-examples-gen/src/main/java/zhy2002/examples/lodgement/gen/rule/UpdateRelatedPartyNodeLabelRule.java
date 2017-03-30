package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class UpdateRelatedPartyNodeLabelRule extends UpdateItemNodeLabelRule<RelatedPartyNode> {

    public UpdateRelatedPartyNodeLabelRule(RelatedPartyNode owner) {
        super(owner);
    }

    protected RelatedPartyNode getRelatedPartyNode() {
        return getOwner();
    }
}
