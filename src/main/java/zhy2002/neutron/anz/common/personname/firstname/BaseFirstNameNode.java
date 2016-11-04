package zhy2002.neutron.anz.common.personname.firstname;

import zhy2002.neutron.anz.common.personname.BasePersonNameNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 22/10/2016.
 */
public abstract class BaseFirstNameNode<P extends BasePersonNameNode<?, ?>> extends StringUiNode<P> {

    protected BaseFirstNameNode(P parent) {
        super(parent);
    }

    protected BaseFirstNameNode(UiNodeContext context) {
        super(context);
    }
}
