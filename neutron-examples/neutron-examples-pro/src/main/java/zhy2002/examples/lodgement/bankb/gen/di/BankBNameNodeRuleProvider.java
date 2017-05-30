package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankBNameNodeRuleProvider extends NameNodeRuleProvider {

    @Inject
    public BankBNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(NameNode<?> node) {
        super.initializeState(node);

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
        super.createRules(createdRules);

        InvalidCharPreChangeRule invalidCharPreChangeRule = invalidCharPreChangeRuleProvider.get();
        createdRules.add(invalidCharPreChangeRule);
    }

}
