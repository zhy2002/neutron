package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SelectRelatedPersonFlagNodeModule.class})
public interface SelectRelatedPersonFlagNodeComponent {


    RuleProvider<SelectRelatedPersonFlagNode> getSelectRelatedPersonFlagNodeRuleProvider();
    Map<String, RuleProvider<SelectRelatedPersonFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNodeModule module);

        SelectRelatedPersonFlagNodeComponent build();
    }

}
