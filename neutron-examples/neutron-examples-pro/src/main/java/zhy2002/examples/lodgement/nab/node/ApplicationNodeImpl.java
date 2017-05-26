package zhy2002.examples.lodgement.nab.node;

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
