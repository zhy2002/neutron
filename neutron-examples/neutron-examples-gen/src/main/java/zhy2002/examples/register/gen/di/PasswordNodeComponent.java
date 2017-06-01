package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PasswordNodeModule.class})
public interface PasswordNodeComponent {

    List<RuleProvider<PasswordNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPasswordNodeModule(PasswordNodeModule module);

        PasswordNodeComponent build();
    }

}
