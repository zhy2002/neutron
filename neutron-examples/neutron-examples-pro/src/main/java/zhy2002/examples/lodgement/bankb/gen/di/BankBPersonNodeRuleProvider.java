package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PersonNodeScope
public class BankBPersonNodeRuleProvider extends PersonNodeRuleProvider {

    @Inject
    public BankBPersonNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<UpdatePersonNodeLabelRule> updatePersonNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UpdatePersonNodeLabelRule updatePersonNodeLabelRule = updatePersonNodeLabelRuleProvider.get();
        createdRules.add(updatePersonNodeLabelRule);
    }

}
