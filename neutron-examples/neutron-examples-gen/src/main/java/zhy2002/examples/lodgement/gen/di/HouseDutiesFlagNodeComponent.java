package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {HouseDutiesFlagNodeModule.class})
public interface HouseDutiesFlagNodeComponent {

    List<RuleProvider<HouseDutiesFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setHouseDutiesFlagNodeModule(HouseDutiesFlagNodeModule module);

        HouseDutiesFlagNodeComponent build();
    }

}
