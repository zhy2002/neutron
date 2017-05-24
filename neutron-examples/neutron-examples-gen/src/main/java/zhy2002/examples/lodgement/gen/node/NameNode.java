package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class NameNode<P extends ParentUiNode<?>> extends StringUiNode<P> {


    public NameNode(@NotNull P parent, String name) {
        super(parent, name);
    }

}
