package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MaritalStatusNodeScope
public class BankCMaritalStatusNodeRuleProvider extends MaritalStatusNodeRuleProvider {

    @Inject
    public BankCMaritalStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(MaritalStatusNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.MARITAL_STATUS);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
