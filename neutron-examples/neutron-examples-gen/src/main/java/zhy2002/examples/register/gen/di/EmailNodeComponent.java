package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {EmailNodeModule.class})
public interface EmailNodeComponent {

    List<RuleProvider<EmailNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setEmailNodeModule(EmailNodeModule module);

        EmailNodeComponent build();
    }

}
