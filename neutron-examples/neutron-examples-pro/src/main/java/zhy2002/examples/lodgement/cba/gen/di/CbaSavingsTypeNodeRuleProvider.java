package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@SavingsTypeNodeScope
public class CbaSavingsTypeNodeRuleProvider extends SavingsTypeNodeRuleProvider {

    @Inject
    public CbaSavingsTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.SAVINGS_ACCOUNT_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
