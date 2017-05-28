package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.YearNode;
import zhy2002.examples.lodgement.gen.di.*;

@YearNodeScope
public class YearNodeRuleProvider implements RuleProvider<YearNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public YearNodeRuleProvider() {
    }

    @Override
    public void initializeState(YearNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
