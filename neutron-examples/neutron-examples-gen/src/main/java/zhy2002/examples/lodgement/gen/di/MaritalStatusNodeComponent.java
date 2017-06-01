package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MaritalStatusNodeModule.class})
public interface MaritalStatusNodeComponent {

    List<RuleProvider<MaritalStatusNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMaritalStatusNodeModule(MaritalStatusNodeModule module);

        MaritalStatusNodeComponent build();
    }

}
