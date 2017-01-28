package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherAssetListNodeFactory implements ChildNodeFactory<OtherAssetListNode, AssetsNode> {

    @Override
    public OtherAssetListNode create(AssetsNode parent, String name) {
        return new OtherAssetListNode(parent, name);
    }
}
