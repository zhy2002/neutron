package zhy2002.mortgage.application.banka.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.mortgage.application.gen.rule.ChangeFocusErrorRule;
import zhy2002.mortgage.application.gen.rule.ShowErrorListRule;
import zhy2002.mortgage.application.rule.ChangeFocusErrorRuleImpl;
import zhy2002.mortgage.application.rule.ShowErrorListRuleImpl;

/**
 * Provide overrides and implementations for CBA profile.
 */
@Module
abstract class CustomBankAProfileModule {

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract ShowErrorListRule provideShowErrorListRule(ShowErrorListRuleImpl impl);

}
