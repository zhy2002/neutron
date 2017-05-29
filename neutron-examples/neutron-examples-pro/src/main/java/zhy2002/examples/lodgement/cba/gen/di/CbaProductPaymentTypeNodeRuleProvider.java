package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProductPaymentTypeNodeScope
public class CbaProductPaymentTypeNodeRuleProvider extends ProductPaymentTypeNodeRuleProvider {

    @Inject
    public CbaProductPaymentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductPaymentTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.PAYMENT_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
