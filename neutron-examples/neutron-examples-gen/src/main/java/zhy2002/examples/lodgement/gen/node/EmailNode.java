package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class EmailNode<P extends ParentUiNode<?>> extends StringUiNode<P> {

    public EmailNode(P parent) {
        super(parent);
    }


}
