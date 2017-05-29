package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MaritalStatusNodeScope
public class WestpacMaritalStatusNodeRuleProvider extends MaritalStatusNodeRuleProvider {

    @Inject
    public WestpacMaritalStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(MaritalStatusNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.MARITAL_STATUS);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
