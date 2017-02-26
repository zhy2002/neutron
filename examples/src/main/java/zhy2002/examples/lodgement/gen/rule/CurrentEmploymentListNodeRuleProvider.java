package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CurrentEmploymentListNode;


@CurrentEmploymentListNodeScope
public class CurrentEmploymentListNodeRuleProvider
    extends ListUiNodeRuleProvider<CurrentEmploymentListNode> {

    @Inject
    public CurrentEmploymentListNodeRuleProvider() {}

    @Override
    public void initializeState(CurrentEmploymentListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
