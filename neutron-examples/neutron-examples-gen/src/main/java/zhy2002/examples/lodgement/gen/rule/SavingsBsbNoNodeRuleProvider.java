package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsBsbNoNode;


@SavingsBsbNoNodeScope
public class SavingsBsbNoNodeRuleProvider
    extends StringUiNodeRuleProvider<SavingsBsbNoNode> {

    @Inject
    public SavingsBsbNoNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsBsbNoNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
