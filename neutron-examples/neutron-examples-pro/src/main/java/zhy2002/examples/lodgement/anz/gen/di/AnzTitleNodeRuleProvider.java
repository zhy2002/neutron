package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.anz.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@TitleNodeScope
public class AnzTitleNodeRuleProvider extends TitleNodeRuleProvider {

    @Inject
    public AnzTitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(TitleNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TITLE_TYPE);
        node.setRequired(true);
    }

    @Inject
    Provider<TitleGenderMatchRule> titleGenderMatchRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        TitleGenderMatchRule titleGenderMatchRule = titleGenderMatchRuleProvider.get();
        createdRules.add(titleGenderMatchRule);
    }

}
