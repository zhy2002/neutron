package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherAssetTypeNodeFactory implements ChildNodeFactory<OtherAssetTypeNode, OtherAssetNode> {

    @Override
    public OtherAssetTypeNode create(OtherAssetNode parent, String name) {
        return new OtherAssetTypeNode(parent, name);
    }
}
