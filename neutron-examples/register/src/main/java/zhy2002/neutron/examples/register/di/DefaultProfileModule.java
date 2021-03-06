package zhy2002.neutron.examples.register.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.neutron.core.ValidationErrorListAdaptor;
import zhy2002.neutron.examples.register.gen.di.ManifestModule;
import zhy2002.neutron.examples.register.gen.rule.*;
import zhy2002.neutron.examples.register.node.RegisterValidationErrorListAdaptor;
import zhy2002.neutron.examples.register.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class DefaultProfileModule {

    @Binds
    abstract DefaultEmailByUsernameRule provideDefaultEmailByUsernameRule(DefaultEmailByUsernameRuleImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(RegisterValidationErrorListAdaptor impl);

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
