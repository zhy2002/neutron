package zhy2002.neutron.anz.common.personname.surname;

import zhy2002.neutron.anz.common.personname.BasePersonNameNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 22/10/2016.
 */
public abstract class BaseSurnameNode<P extends BasePersonNameNode<?, ?>> extends StringUiNode<P> {

    protected BaseSurnameNode(P parent) {
        super(parent);
    }

    protected BaseSurnameNode(UiNodeContext context) {
        super(context);
    }
}
