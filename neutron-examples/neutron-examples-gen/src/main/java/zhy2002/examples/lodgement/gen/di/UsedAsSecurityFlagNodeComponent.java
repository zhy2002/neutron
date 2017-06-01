package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {UsedAsSecurityFlagNodeModule.class})
public interface UsedAsSecurityFlagNodeComponent {

    List<RuleProvider<UsedAsSecurityFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setUsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNodeModule module);

        UsedAsSecurityFlagNodeComponent build();
    }

}
