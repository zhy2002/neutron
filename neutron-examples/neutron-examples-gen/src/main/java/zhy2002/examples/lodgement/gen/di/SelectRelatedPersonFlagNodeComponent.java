package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SelectRelatedPersonFlagNodeScope
@Subcomponent(modules = {SelectRelatedPersonFlagNodeModule.class})
public interface SelectRelatedPersonFlagNodeComponent {

    SelectRelatedPersonFlagNodeRuleProvider getSelectRelatedPersonFlagNodeRuleProvider();
    Map<String, RuleProvider<SelectRelatedPersonFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNodeModule module);

        SelectRelatedPersonFlagNodeComponent build();
    }
}
