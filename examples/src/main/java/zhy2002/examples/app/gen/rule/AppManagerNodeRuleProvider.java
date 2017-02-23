package zhy2002.examples.app.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.app.gen.di.*;
import javax.inject.*;

@AppManagerNodeScope
public class AppManagerNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public AppManagerNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
