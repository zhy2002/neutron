package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.OtherAssetNode;
import zhy2002.neutron.NodeAddEvent;


public class OtherAssetNodeAddEvent extends NodeAddEvent<OtherAssetNode> {

    public OtherAssetNodeAddEvent(OtherAssetNode target) {
        super(target);
    }
}
