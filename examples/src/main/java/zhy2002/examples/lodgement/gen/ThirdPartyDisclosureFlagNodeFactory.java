package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ThirdPartyDisclosureFlagNodeFactory implements ChildNodeFactory<ThirdPartyDisclosureFlagNode, PersonPrivacyNode> {

    @Override
    public ThirdPartyDisclosureFlagNode create(PersonPrivacyNode parent, String name) {
        return new ThirdPartyDisclosureFlagNode(parent, name);
    }
}
