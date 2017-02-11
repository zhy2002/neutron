package zhy2002.examples.register.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.register.config.RegisterNodeImplClassRegistry;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.examples.register.gen.rule.EmailNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PasswordNodeRuleProvider;
import zhy2002.examples.register.gen.rule.RegisterNodeRuleProvider;
import zhy2002.examples.register.gen.rule.UsernameNodeRuleProvider;
import zhy2002.examples.register.impl.RegisterNodeContextImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.di.NeutronModule;

import javax.inject.Singleton;

@Module(includes = {NeutronModule.class})
abstract class RegisterContextModule {

    @Binds
    @Singleton
    abstract RegisterNodeContext provideApplicationNodeContext(RegisterNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(RegisterNodeImplClassRegistry impl);

    @Binds
    @Singleton
    abstract RegisterNodeRuleProvider provideRegisterNodeRuleProvider(RegisterNodeRuleProviderImpl impl);

    @Binds
    @Singleton
    abstract UsernameNodeRuleProvider provideUsernameNodeRuleProvider(UsernameNodeRuleProviderImpl impl);

    @Binds
    @Singleton
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(EmailNodeRuleProviderImpl impl);

    @Binds
    @Singleton
    abstract PasswordNodeRuleProvider providePasswordNodeRuleProvider(PasswordNodeRuleProviderImpl impl);


}
