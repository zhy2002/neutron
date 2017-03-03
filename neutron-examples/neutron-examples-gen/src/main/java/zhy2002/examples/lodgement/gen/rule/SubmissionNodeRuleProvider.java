package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SubmissionNode;


@SubmissionNodeScope
public class SubmissionNodeRuleProvider
    extends ObjectUiNodeRuleProvider<SubmissionNode> {

    @Inject
    public SubmissionNodeRuleProvider() {}

    @Override
    public void initializeState(SubmissionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
