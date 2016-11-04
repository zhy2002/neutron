package zhy2002.neutron.uinode;

import zhy2002.neutron.uinode.factoryregistry.UiNodeFactory;

/**
 * Created by john.zhang on 1/11/2016.
 */
public class UiNodeCreator {

    public <N extends UiNode<P>, F extends UiNodeFactory<N, P>, P extends ParentUiNode<?>>
    N create(Class<N> nodeClass, P parent) {
        F factory = parent.getContext().getInstance(nodeClass);
        return factory.create(parent);
    }
}
