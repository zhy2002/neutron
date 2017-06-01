package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SavingsTypeNodeModule.class})
public interface SavingsTypeNodeComponent {

    List<RuleProvider<SavingsTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsTypeNodeModule(SavingsTypeNodeModule module);

        SavingsTypeNodeComponent build();
    }

}
