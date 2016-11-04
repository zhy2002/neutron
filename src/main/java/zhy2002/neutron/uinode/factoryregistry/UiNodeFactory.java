package zhy2002.neutron.uinode.factoryregistry;

import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNode;

/**
 * Created by john.zhang on 1/11/2016.
 */
public abstract class UiNodeFactory<
        N extends UiNode<P>,
        P extends ParentUiNode<?>
        > {

    public abstract N create(P parent);
}
