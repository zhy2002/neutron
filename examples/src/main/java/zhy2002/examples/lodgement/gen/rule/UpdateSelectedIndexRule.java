package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class UpdateSelectedIndexRule extends UiNodeRule<PersonListNode> {

    public UpdateSelectedIndexRule(PersonListNode owner) {
        super(owner);
    }

    protected PersonListNode getPersonListNode() {
        return getOwner();
    }
}
