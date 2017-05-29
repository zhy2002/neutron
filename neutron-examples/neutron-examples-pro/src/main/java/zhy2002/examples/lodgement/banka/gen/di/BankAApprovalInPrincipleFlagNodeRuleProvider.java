package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ApprovalInPrincipleFlagNodeScope
public class BankAApprovalInPrincipleFlagNodeRuleProvider extends ApprovalInPrincipleFlagNodeRuleProvider {

    @Inject
    public BankAApprovalInPrincipleFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApprovalInPrincipleFlagNode node) {
        super.initializeState(node);

        node.setValue(null);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}