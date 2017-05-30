package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ThirdPartyDescriptionNodeScope
public class BankAThirdPartyDescriptionNodeRuleProvider extends ThirdPartyDescriptionNodeRuleProvider {

    @Inject
    public BankAThirdPartyDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyDescriptionNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.NEXT_KIN_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
