package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PreviousEmploymentNode;


@PreviousEmploymentNodeScope
public class PreviousEmploymentNodeRuleProvider
    extends EmploymentNodeRuleProvider<PreviousEmploymentNode> {

    @Inject
    public PreviousEmploymentNodeRuleProvider() {}

    @Override
    public void initializeState(PreviousEmploymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
