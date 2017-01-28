package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.OtherAssetNode;
import zhy2002.neutron.NodeRemoveEvent;


public class OtherAssetNodeRemoveEvent extends NodeRemoveEvent<OtherAssetNode> {
    public OtherAssetNodeRemoveEvent(OtherAssetNode target) {
        super(target);
    }
}