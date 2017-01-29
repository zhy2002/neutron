package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LegalActionNodeFactory implements ChildNodeFactory<LegalActionNode, PersonPrivacyNode> {

    @Override
    public LegalActionNode create(PersonPrivacyNode parent, String name) {
        return new LegalActionNode(parent, name);
    }
}
