package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;
import zhy2002.examples.lodgement.gen.di.*;


public class YesNoOptionNodeRuleProvider implements RuleProvider<YesNoOptionNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public YesNoOptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(YesNoOptionNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
