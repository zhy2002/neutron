package zhy2002.examples.lodgement.cba.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.LodgementValidationErrorListAdaptor;
import zhy2002.examples.lodgement.cba.gen.di.CbaLegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.cba.gen.di.CbaPropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeRuleProvider;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.gen.rule.UpdateAddressRefListRule;
import zhy2002.examples.lodgement.nab.di.LegalActionNodeRuleProviderImpl;
import zhy2002.examples.lodgement.nab.gen.di.NabLegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.rule.ChangeFocusErrorRuleImpl;
import zhy2002.examples.lodgement.rule.ShowErrorListRuleImpl;
import zhy2002.examples.lodgement.rule.UpdateAddressRefListRuleImpl;
import zhy2002.neutron.ValidationErrorListAdaptor;

/**
 * Provide overrides and implementations for CBA profile.
 */
@Module
abstract class CustomCbaProfileModule {

    @Binds
    abstract UpdateAddressRefListRule provideUpdateAddressRefListRule(UpdateAddressRefListRuleImpl impl);

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract ShowErrorListRule provideShowErrorListRule(ShowErrorListRuleImpl impl);

    @Binds
    abstract CbaPropertySubTypeNodeRuleProvider provideRealEstateNodeRuleProvider(PropertySubTypeNodeRuleProviderImpl impl);

}
