package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherAssetDescriptionNodeFactory implements ChildNodeFactory<OtherAssetDescriptionNode, OtherAssetNode> {

    @Override
    public OtherAssetDescriptionNode create(OtherAssetNode parent, String name) {
        return new OtherAssetDescriptionNode(parent, name);
    }
}
