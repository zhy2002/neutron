package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PrimarySecurityFlagNodeScope
public class BankBPrimarySecurityFlagNodeRuleProvider extends PrimarySecurityFlagNodeRuleProvider {

    @Inject
    public BankBPrimarySecurityFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(PrimarySecurityFlagNode node) {
        super.initializeState(node);

        node.setValue(null);
        node.setDisabled(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
