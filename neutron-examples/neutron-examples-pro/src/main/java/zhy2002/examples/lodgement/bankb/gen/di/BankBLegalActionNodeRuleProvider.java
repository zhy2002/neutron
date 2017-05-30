package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LegalActionNodeScope
public class BankBLegalActionNodeRuleProvider extends LegalActionNodeRuleProvider {

    @Inject
    public BankBLegalActionNodeRuleProvider() {
    }

    @Override
    public void initializeState(LegalActionNode node) {
        super.initializeState(node);

        node.setValue("No");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
