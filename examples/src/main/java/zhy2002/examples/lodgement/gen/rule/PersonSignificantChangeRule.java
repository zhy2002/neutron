package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class PersonSignificantChangeRule extends UiNodeRule<PersonSignificantChangeFlagNode> {

    public PersonSignificantChangeRule(PersonSignificantChangeFlagNode owner) {
        super(owner);
    }

    protected PersonSignificantChangeFlagNode getPersonSignificantChangeFlagNode() {
        return getOwner();
    }
}
