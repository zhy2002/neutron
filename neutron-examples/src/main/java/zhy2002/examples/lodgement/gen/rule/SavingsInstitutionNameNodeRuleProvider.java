package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsInstitutionNameNode;


@SavingsInstitutionNameNodeScope
public class SavingsInstitutionNameNodeRuleProvider
    extends StringUiNodeRuleProvider<SavingsInstitutionNameNode> {

    @Inject
    public SavingsInstitutionNameNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsInstitutionNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
