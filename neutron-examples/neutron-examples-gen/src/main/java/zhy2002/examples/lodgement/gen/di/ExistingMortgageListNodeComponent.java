package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ExistingMortgageListNodeModule.class})
public interface ExistingMortgageListNodeComponent {

    List<RuleProvider<ExistingMortgageListNode>> provideRuleProviders();

    ExistingMortgageNode createExistingMortgageNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageListNodeModule(ExistingMortgageListNodeModule module);

        ExistingMortgageListNodeComponent build();
    }

}
