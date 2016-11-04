package zhy2002.neutron.uinode.factoryregistry;

import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNode;

/**
 * Created by john.zhang on 28/10/2016.
 */
public interface UiNodeFactoryRegistry {

    <N extends UiNode<P>, P extends ParentUiNode<?>, F extends UiNodeFactory<N, P>> F getInstance(Class<N> factoryClass);
}
