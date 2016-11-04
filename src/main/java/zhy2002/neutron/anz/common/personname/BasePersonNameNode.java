package zhy2002.neutron.anz.common.personname;

import zhy2002.neutron.anz.common.personname.firstname.BaseFirstNameNode;
import zhy2002.neutron.anz.common.personname.surname.BaseSurnameNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * @param <P> Type of the parent node.
 * @param <T> Type of the implementation node.
 */
public abstract class BasePersonNameNode<P extends CompositeUiNode<?>, T extends BasePersonNameNode<P, T>> extends CompositeUiNode<P> {

    public abstract BaseFirstNameNode<T> getFirstName();
    public abstract BaseSurnameNode<T> getSurname();

    protected BasePersonNameNode(P parent) {
        super(parent);
    }

    protected BasePersonNameNode(UiNodeContext context) {
        super(context);
    }
}
