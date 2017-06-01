package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RentedFlagNodeModule.class})
public interface RentedFlagNodeComponent {

    List<RuleProvider<RentedFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setRentedFlagNodeModule(RentedFlagNodeModule module);

        RentedFlagNodeComponent build();
    }

}
