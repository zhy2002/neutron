package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ResponsibleRepaymentDifficultyNode;


@ResponsibleRepaymentDifficultyNodeScope
public class ResponsibleRepaymentDifficultyNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<ResponsibleRepaymentDifficultyNode> {

    @Inject
    public ResponsibleRepaymentDifficultyNodeRuleProvider() {}

    @Override
    public void initializeState(ResponsibleRepaymentDifficultyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
