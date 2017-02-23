package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@PersonOtherIncomeTypeNodeScope
public class PersonOtherIncomeTypeNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public PersonOtherIncomeTypeNodeRuleProvider() {}

    @Inject
    Provider<PersonOtherIncomeTypeChangeRule> personOtherIncomeTypeChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(personOtherIncomeTypeChangeRuleProvider.get());
    }

}
