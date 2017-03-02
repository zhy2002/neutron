package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.YearNode;


@YearNodeScope
public class YearNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<YearNode> {

    @Inject
    public YearNodeRuleProvider() {}

    @Override
    public void initializeState(YearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
