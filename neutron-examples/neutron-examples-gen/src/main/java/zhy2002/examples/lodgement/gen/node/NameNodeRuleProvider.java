package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class NameNodeRuleProvider implements RuleProvider<NameNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public NameNodeRuleProvider() {
    }

    @Override
    public void initializeState(NameNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setPattern(ApplicationNodeConstants.NAME_PATTERN);
        node.setMaxLength(25);
        node.setLengthMessage("Cannot exceed 25 characters.");
        node.setInvalidChars("#");
        node.setInvalidCharsMessage("Name cannot contain '#'.");
    }

    @Inject
    Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        InvalidCharPreChangeRule invalidCharPreChangeRule = invalidCharPreChangeRuleProvider.get();
        createdRules.add(invalidCharPreChangeRule);
    }

}
