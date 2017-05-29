package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@HousingStatusNodeScope
public class BankBHousingStatusNodeRuleProvider extends HousingStatusNodeRuleProvider {

    @Inject
    public BankBHousingStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(HousingStatusNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.HOUSING_STATUS);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
