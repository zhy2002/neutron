package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SelectRelatedPersonFlagNodeModule.class})
public interface SelectRelatedPersonFlagNodeComponent {

    List<RuleProvider<SelectRelatedPersonFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNodeModule module);

        SelectRelatedPersonFlagNodeComponent build();
    }

}
