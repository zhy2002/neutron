package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@EmailNodeScope
@Subcomponent(modules = {EmailNodeModule.class})
public interface EmailNodeComponent {

    EmailNodeRuleProvider getEmailNodeRuleProvider();
    Map<String, RuleProvider<EmailNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmailNodeModule(EmailNodeModule module);

        EmailNodeComponent build();
    }
}
