package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class EmailNode<P extends ParentUiNode<?>> extends StringUiNode<P> {


    public EmailNode(@NotNull P parent, String name) {
        super(parent, name);
    }

}
