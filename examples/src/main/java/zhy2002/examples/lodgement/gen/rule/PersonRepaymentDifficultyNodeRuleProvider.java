package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonRepaymentDifficultyNode;


@PersonRepaymentDifficultyNodeScope
public class PersonRepaymentDifficultyNodeRuleProvider
    extends YesNoOptionNodeRuleProvider<PersonRepaymentDifficultyNode> {

    @Inject
    public PersonRepaymentDifficultyNodeRuleProvider() {}

    @Override
    public void initializeState(PersonRepaymentDifficultyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
