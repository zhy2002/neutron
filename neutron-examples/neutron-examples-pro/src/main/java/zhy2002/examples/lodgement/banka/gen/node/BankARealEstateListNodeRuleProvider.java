package zhy2002.examples.lodgement.banka.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankARealEstateListNodeRuleProvider extends RealEstateListNodeRuleProvider {

    @Inject
    public BankARealEstateListNodeRuleProvider() {
    }

    @Override
    public void initializeState(RealEstateListNode node) {
        super.initializeState(node);

        node.setMinItemCount(1);
    }

    @Inject
    Provider<AutoCreateListItemRule> autoCreateListItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        AutoCreateListItemRule autoCreateListItemRule = autoCreateListItemRuleProvider.get();
        createdRules.add(autoCreateListItemRule);
    }

}