package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CreditCheckFlagNodeFactory implements ChildNodeFactory<CreditCheckFlagNode, PersonPrivacyNode> {

    @Override
    public CreditCheckFlagNode create(PersonPrivacyNode parent, String name) {
        return new CreditCheckFlagNode(parent, name);
    }
}
