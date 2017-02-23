package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@ApplicationTypeNodeScope
public class ApplicationTypeNodeRuleProvider extends StringUiNodeRuleProvider {

    @Inject
    public ApplicationTypeNodeRuleProvider() {}

    @Inject
    Provider<ChangeApplicationTypeRule> changeApplicationTypeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(changeApplicationTypeRuleProvider.get());
    }

}
