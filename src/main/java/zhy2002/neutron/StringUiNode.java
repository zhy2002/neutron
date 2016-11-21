package zhy2002.neutron;

import jsinterop.annotations.JsType;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);

        init();
    }

    protected StringUiNode(UiNodeContextImpl context) {
        super(context);

        init();
    }

    private void init() {
        this.setStateValueInternal(DefaultUiNodeStateKeys.VALUE, "");
    }

}
