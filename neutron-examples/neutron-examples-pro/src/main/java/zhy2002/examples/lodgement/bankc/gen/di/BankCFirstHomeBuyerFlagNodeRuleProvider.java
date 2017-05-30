package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@FirstHomeBuyerFlagNodeScope
public class BankCFirstHomeBuyerFlagNodeRuleProvider extends FirstHomeBuyerFlagNodeRuleProvider {

    @Inject
    public BankCFirstHomeBuyerFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(FirstHomeBuyerFlagNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
