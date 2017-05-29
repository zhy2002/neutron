package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@OwnedOutrightFlagNodeScope
public class BankBOwnedOutrightFlagNodeRuleProvider extends OwnedOutrightFlagNodeRuleProvider {

    @Inject
    public BankBOwnedOutrightFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnedOutrightFlagNode node) {
        super.initializeState(node);

        node.setValue(null);
        node.setRequired(true);
    }

    @Inject
    Provider<BooleanEnableSiblingRule> booleanEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanEnableSiblingRule booleanEnableSiblingRule = booleanEnableSiblingRuleProvider.get();
        booleanEnableSiblingRule.setSiblingName("existingMortgageListNode");
        booleanEnableSiblingRule.setEnablingValue(false);
        createdRules.add(booleanEnableSiblingRule);
    }

}
