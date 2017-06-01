package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MortgqageUnpaidBalanceNodeModule.class})
public interface MortgqageUnpaidBalanceNodeComponent {

    List<RuleProvider<MortgqageUnpaidBalanceNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNodeModule module);

        MortgqageUnpaidBalanceNodeComponent build();
    }

}
