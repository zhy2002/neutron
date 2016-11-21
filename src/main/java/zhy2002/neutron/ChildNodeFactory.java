package zhy2002.neutron;

/**
 * Created by ZHY on 6/11/2016.
 */
public abstract class ChildNodeFactory<N extends UiNode<? extends P>, P extends ParentUiNode<?>> {

    public abstract N create(P parent, String name);

}
