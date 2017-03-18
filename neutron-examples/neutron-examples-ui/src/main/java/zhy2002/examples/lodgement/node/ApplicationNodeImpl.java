package zhy2002.examples.lodgement.node;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Add additional methods for JSX.
 */
public class ApplicationNodeImpl extends ApplicationNode {

    private static final Logger logger = Logger.getLogger("ApplicationNodeImpl");

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
            if (parent instanceof ListUiNode<?, ?>) {
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

    @JsMethod
    public String[] getApplicants() {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < getPersonListNode().getItemCount(); i++) {
            PersonNode personNode = getPersonListNode().getItem(i);
            result.add(personNode.getNodeLabel());
        }

        String[] array = new String[result.size()];
        result.toArray(array);
        return array;
    }

    @JsMethod
    public double getTotalLoanAmount() {
        double result = 0;
        ProductListNode productListNode = getProductsNode().getProductListNode();
        for (int i = 0; i < productListNode.getItemCount(); i++) {
            ProductNode productNode = productListNode.getItem(i);
            ProductRequestedAmountNode amountNode = productNode.getProductDescriptionNode().getProductRequestedAmountNode();
            if (amountNode.hasValue()) {
                result += amountNode.getValue().doubleValue();
            }
        }
        return result;
    }
}
