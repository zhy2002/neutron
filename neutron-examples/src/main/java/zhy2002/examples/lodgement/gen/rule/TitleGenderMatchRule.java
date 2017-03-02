package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class TitleGenderMatchRule extends ValidationRule<TitleNode> {

    public TitleGenderMatchRule(TitleNode owner) {
        super(owner);
    }

    protected TitleNode getTitleNode() {
        return getOwner();
    }
}
