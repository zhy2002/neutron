package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AddNewPersonHolderRule extends UiNodeRule<SelectAccountHolderListNode<?>> {

    public AddNewPersonHolderRule(SelectAccountHolderListNode<?> owner) {
        super(owner);
    }

    protected SelectAccountHolderListNode<?> getSelectAccountHolderListNode() {
        return getOwner();
    }
}
