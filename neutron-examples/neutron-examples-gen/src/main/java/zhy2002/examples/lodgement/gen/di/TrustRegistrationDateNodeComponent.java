package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {TrustRegistrationDateNodeModule.class})
public interface TrustRegistrationDateNodeComponent {

    List<RuleProvider<TrustRegistrationDateNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setTrustRegistrationDateNodeModule(TrustRegistrationDateNodeModule module);

        TrustRegistrationDateNodeComponent build();
    }

}
