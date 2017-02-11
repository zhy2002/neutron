package zhy2002.examples.lodgement.di;


import zhy2002.examples.lodgement.gen.PersonNode;
import zhy2002.examples.lodgement.gen.rule.PersonNodeRuleProvider;
import zhy2002.examples.lodgement.gen.rule.UpdatePersonNodeLabelRule;
import zhy2002.examples.lodgement.impl.UpdatePersonNodeLabelRuleImpl;

import javax.inject.Inject;

public class PersonNodeRuleProviderImpl extends PersonNodeRuleProvider {

    @Inject
    public PersonNodeRuleProviderImpl() {}

    @Override
    protected UpdatePersonNodeLabelRule newUpdatePersonNodeLabelRule(PersonNode node) {
        return new UpdatePersonNodeLabelRuleImpl(node);
    }
}
