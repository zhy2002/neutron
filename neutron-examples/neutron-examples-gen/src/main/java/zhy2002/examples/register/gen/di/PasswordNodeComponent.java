package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PasswordNodeScope
@Subcomponent(modules = {PasswordNodeModule.class})
public interface PasswordNodeComponent {

    PasswordNodeRuleProvider getPasswordNodeRuleProvider();
    Map<String, RuleProvider<PasswordNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPasswordNodeModule(PasswordNodeModule module);

        PasswordNodeComponent build();
    }
}
