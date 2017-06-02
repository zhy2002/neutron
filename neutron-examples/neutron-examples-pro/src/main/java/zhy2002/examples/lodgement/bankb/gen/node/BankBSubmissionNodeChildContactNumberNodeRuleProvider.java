package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_child_factory.ftl */
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


@ComponentScope
public class BankBSubmissionNodeChildContactNumberNodeRuleProvider implements RuleProvider<BrokerTelephoneNode> {

    @Inject
    public BankBSubmissionNodeChildContactNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerTelephoneNode node) {
        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
    }
}
