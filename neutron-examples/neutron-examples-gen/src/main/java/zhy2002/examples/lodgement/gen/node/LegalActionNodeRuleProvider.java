package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@LegalActionNodeScope
public class LegalActionNodeRuleProvider implements RuleProvider<LegalActionNode> {

    @Inject
    YesNoOptionNodeRuleProvider parentRuleProvider;

    @Inject
    public LegalActionNodeRuleProvider() {
    }

    @Override
    public void initializeState(LegalActionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
