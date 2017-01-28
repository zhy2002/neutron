package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherAssetNodeFactory implements ChildNodeFactory<OtherAssetNode, OtherAssetListNode> {

    @Override
    public OtherAssetNode create(OtherAssetListNode parent, String name) {
        return new OtherAssetNode(parent, name);
    }
}
