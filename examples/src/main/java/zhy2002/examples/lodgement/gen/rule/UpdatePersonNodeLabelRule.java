package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class UpdatePersonNodeLabelRule extends UiNodeRule<PersonNode> {

    public UpdatePersonNodeLabelRule(PersonNode owner) {
        super(owner);
    }

    protected PersonNode getPersonNode() {
        return getOwner();
    }
}
