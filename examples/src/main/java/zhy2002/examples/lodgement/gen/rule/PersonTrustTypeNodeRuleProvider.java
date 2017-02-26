package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustTypeNode;


@PersonTrustTypeNodeScope
public class PersonTrustTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonTrustTypeNode> {

    @Inject
    public PersonTrustTypeNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustTypeNode node) {
    }


    @Inject
    Provider<TrustTypeChangedRule> trustTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(trustTypeChangedRuleProvider.get());
    }

}
