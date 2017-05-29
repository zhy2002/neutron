package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherLiabilityLimitAmountNodeScope
public class AnzOtherLiabilityLimitAmountNodeRuleProvider extends OtherLiabilityLimitAmountNodeRuleProvider {

    @Inject
    public AnzOtherLiabilityLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityLimitAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
