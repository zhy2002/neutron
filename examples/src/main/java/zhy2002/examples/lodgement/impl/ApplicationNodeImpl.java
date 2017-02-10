package zhy2002.examples.lodgement.impl;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.*;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

/**
 * Add additional methods for JSX.
 */
public class ApplicationNodeImpl extends ApplicationNode {

    @Inject
    ApplicationNodeImpl(@NotNull ApplicationNodeContext context) {
        super(context);
    }

    @JsMethod
    public void setContentNode(UiNode<?> descendant) {
        if (descendant == null)
            return;

        CycleModeEnum mode = getContext().getCycleMode();
        if (mode == CycleModeEnum.Auto) {
            getContext().setCycleMode(CycleModeEnum.Batched);
        } else {
            mode = null;
        }
        try {
            getContext().beginSession();
            int level = selectDescendant(descendant);
            if (level > 0) {
                setContentLevel(level);
            }
            getContext().commitSession();
        } finally {
            if (mode != null) {
                getContext().setCycleMode(mode);
            }
        }
    }

    private int selectDescendant(UiNode<?> descendant) {
        int level = 0;
        while (descendant != this) {
            level++;
            UiNode<?> parent = descendant.getParent();
            if (parent instanceof ListUiNode<?, ?, ?>) {
                ((ListUiNode) parent).setSelectedIndex(descendant.getIndex());
            } else if (parent instanceof ObjectUiNode<?>) {
                ((ObjectUiNode) parent).setSelectedName(descendant.getName());
            } else {
                throw new UiNodeException("Unsupported node type in path:" + parent.getClass().getName());
            }
            descendant = parent;
        }
        return level;
    }
}
