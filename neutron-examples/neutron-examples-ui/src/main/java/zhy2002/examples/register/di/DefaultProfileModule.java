package zhy2002.examples.register.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.register.gen.di.ManifestModule;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.rule.*;

@Module(includes = {ManifestModule.class, CustomModule.class})
public abstract class DefaultProfileModule {

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
