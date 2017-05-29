package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ThirdPartyFirstNameNodeScope
public class BankAThirdPartyFirstNameNodeRuleProvider extends ThirdPartyFirstNameNodeRuleProvider {

    @Inject
    public BankAThirdPartyFirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyFirstNameNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}