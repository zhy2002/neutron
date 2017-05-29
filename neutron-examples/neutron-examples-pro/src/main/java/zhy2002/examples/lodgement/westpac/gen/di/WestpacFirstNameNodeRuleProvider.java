package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@FirstNameNodeScope
public class WestpacFirstNameNodeRuleProvider extends FirstNameNodeRuleProvider {

    @Inject
    public WestpacFirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(FirstNameNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setPattern(ApplicationNodeConstants.NAME_PATTERN);
        node.setMaxLength(20);
        node.setInvalidChars("#");
        node.setInvalidCharsMessage("Username cannot contain '#'.");
    }

    @Inject
    Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        InvalidCharPreChangeRule invalidCharPreChangeRule = invalidCharPreChangeRuleProvider.get();
        createdRules.add(invalidCharPreChangeRule);
    }

}
