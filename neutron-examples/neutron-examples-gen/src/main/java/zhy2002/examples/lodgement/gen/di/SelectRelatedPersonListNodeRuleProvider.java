package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectRelatedPersonListNodeRuleProvider implements RuleProvider<SelectRelatedPersonListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectRelatedPersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonListNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
