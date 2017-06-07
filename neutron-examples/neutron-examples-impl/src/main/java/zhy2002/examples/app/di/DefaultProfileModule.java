package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.app.gen.di.ManifestModule;
import zhy2002.examples.app.gen.rule.HandleAddOpenAppActionRule;
import zhy2002.examples.app.gen.rule.UpdateSelectedTabIndexRule;
import zhy2002.examples.app.rule.HandleAddOpenAppActionRuleImpl;
import zhy2002.examples.app.rule.UpdateSelectedTabIndexRuleImpl;

@Module(includes = {ManifestModule.class})
abstract class DefaultProfileModule {

    @Binds
    abstract UpdateSelectedTabIndexRule provideUpdateSelectedTabIndexRule(UpdateSelectedTabIndexRuleImpl impl);

    @Binds
    abstract HandleAddOpenAppActionRule provideHandleAddOpenAppActionRule(HandleAddOpenAppActionRuleImpl impl);

}
