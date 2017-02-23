package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@ErrorListNodeScope
public class ErrorListNodeRuleProvider extends ListUiNodeRuleProvider {

    @Inject
    public ErrorListNodeRuleProvider() {}

    @Inject
    Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(changeFocusErrorRuleProvider.get());
    }

}
