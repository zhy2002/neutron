package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class TitleGenderMatchRule extends ValidationRule<TitleNode> {

    public TitleGenderMatchRule(TitleNode owner) {
        super(owner);
    }

    protected TitleNode getTitleNode() {
        return getOwner();
    }
}
