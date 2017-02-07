package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class OtherAssetListNode extends ListUiNode<AssetsNode,OtherAssetListNode,OtherAssetNode>
{
    public OtherAssetListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherAssetNode> getItemClass() {
        return OtherAssetNode.class;
    }



}
