package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@EmailNodeScope
@Subcomponent(modules = {EmailNodeModule.class})
public interface EmailNodeComponent {

    EmailNodeRuleProvider getEmailNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmailNodeModule(EmailNodeModule module);

        EmailNodeComponent build();
    }
}
