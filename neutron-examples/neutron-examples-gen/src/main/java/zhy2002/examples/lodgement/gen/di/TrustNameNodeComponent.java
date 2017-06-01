package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {TrustNameNodeModule.class})
public interface TrustNameNodeComponent {

    List<RuleProvider<TrustNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setTrustNameNodeModule(TrustNameNodeModule module);

        TrustNameNodeComponent build();
    }

}
