package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CurrentEmploymentListNodeModule.class})
public interface CurrentEmploymentListNodeComponent {

    List<RuleProvider<CurrentEmploymentListNode>> provideRuleProviders();

    CurrentEmploymentNode createCurrentEmploymentNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentListNodeModule(CurrentEmploymentListNodeModule module);

        CurrentEmploymentListNodeComponent build();
    }

}
