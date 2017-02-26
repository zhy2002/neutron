package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PreviousEmploymentListNode;


@PreviousEmploymentListNodeScope
public class PreviousEmploymentListNodeRuleProvider
    extends ListUiNodeRuleProvider<PreviousEmploymentListNode> {

    @Inject
    public PreviousEmploymentListNodeRuleProvider() {}

    @Override
    public void initializeState(PreviousEmploymentListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
