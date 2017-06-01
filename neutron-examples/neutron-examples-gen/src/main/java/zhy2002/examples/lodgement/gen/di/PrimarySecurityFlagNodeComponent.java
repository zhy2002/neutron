package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PrimarySecurityFlagNodeModule.class})
public interface PrimarySecurityFlagNodeComponent {

    List<RuleProvider<PrimarySecurityFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPrimarySecurityFlagNodeModule(PrimarySecurityFlagNodeModule module);

        PrimarySecurityFlagNodeComponent build();
    }

}
