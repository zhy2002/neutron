package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PropertyTypeNodeScope
public class BankBPropertyTypeNodeRuleProvider extends PropertyTypeNodeRuleProvider {

    @Inject
    public BankBPropertyTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.PROPERTY_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
