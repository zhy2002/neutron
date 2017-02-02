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

public  class AddressListNode extends ListUiNode<ApplicationNode,AddressListNode,AddressRefUiNode>
{
    protected AddressListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<AddressRefUiNode> getItemClass() {
        return AddressRefUiNode.class;
    }



}
