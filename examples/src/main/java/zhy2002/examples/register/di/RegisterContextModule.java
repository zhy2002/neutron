package zhy2002.examples.register.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.register.gen.RegisterNodeClassRegistry;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.examples.register.gen.di.ManifestModule;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.rule.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.di.NeutronModule;

import javax.inject.Singleton;

@Module(includes = {NeutronModule.class, ManifestModule.class, CustomModule.class})
abstract class RegisterContextModule {

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(RegisterNodeClassRegistry impl);

    @Binds
    abstract DefaultEmailByUsernameRule provideDefaultEmailByUsernameRule(DefaultEmailByUsernameRuleImpl impl);

    @Binds
    abstract CreateErrorNodeRule provideCreateErrorNodeRule(CreateErrorNodeRuleImpl impl);

    @Binds
    abstract PasswordIsStrongRule providePasswordIsStrongRule(PasswordIsStrongRuleImpl impl);

    @Binds
    abstract EmailChangeReasonRule provideEmailChangeReasonRule(EmailChangeReasonRuleImpl impl);

    @Binds
    abstract EmailIsRequiredWhenReceiveOffersRule provideEmailIsRequiredWhenReceiveOffersRuleImpl(EmailIsRequiredWhenReceiveOffersRuleImpl impl);

    @Binds
    abstract LoadInvestmentPropertyRule provideLoadInvestmentPropertyRule(LoadInvestmentPropertyRuleImpl impl);

    @Binds
    abstract PhoneInfoAllOrNothingRule providePhoneInfoAllOrNothingRule(PhoneInfoAllOrNothingRuleImpl impl);

    @Binds
    abstract RepeatPasswordRule provideRepeatPasswordRule(RepeatPasswordRuleImpl impl);

    @Binds
    abstract SetHasErrorRule provideSetHasErrorRuleImpl(SetHasErrorRuleImpl impl);

    @Binds
    abstract UpdatePlanRule provideUpdatePlanRule(UpdatePlanRuleImpl impl);
}
