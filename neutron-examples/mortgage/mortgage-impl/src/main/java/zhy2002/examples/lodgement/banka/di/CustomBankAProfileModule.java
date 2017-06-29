package zhy2002.examples.lodgement.banka.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.rule.ChangeFocusErrorRuleImpl;
import zhy2002.examples.lodgement.rule.ShowErrorListRuleImpl;

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
