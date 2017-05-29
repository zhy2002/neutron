package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ContributionDescriptionNodeScope
public class AnzContributionDescriptionNodeRuleProvider extends ContributionDescriptionNodeRuleProvider {

    @Inject
    public AnzContributionDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContributionDescriptionNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
