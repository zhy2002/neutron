package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherAssetMarketValueNodeFactory implements ChildNodeFactory<OtherAssetMarketValueNode, OtherAssetNode> {

    @Override
    public OtherAssetMarketValueNode create(OtherAssetNode parent, String name) {
        return new OtherAssetMarketValueNode(parent, name);
    }
}
