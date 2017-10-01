package zhy2002.mortgage.manager.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.mortgage.manager.gen.di.ManifestModule;
import zhy2002.mortgage.manager.gen.rule.HandleAddOpenAppActionRule;
import zhy2002.mortgage.manager.gen.rule.UpdateSelectedTabIndexRule;
import zhy2002.mortgage.manager.rule.HandleAddOpenAppActionRuleImpl;
import zhy2002.mortgage.manager.rule.UpdateSelectedTabIndexRuleImpl;

@Module(includes = {ManifestModule.class})
abstract class DefaultProfileModule {

    @Binds
    abstract UpdateSelectedTabIndexRule provideUpdateSelectedTabIndexRule(UpdateSelectedTabIndexRuleImpl impl);

    @Binds
    abstract HandleAddOpenAppActionRule provideHandleAddOpenAppActionRule(HandleAddOpenAppActionRuleImpl impl);

}
