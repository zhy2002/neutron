package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.app.gen.di.ManifestModule;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.examples.app.rule.DummyRuleImpl;

@Module(includes = {ManifestModule.class})
public abstract class DefaultProfileModule {

    @Binds
    abstract DummyRule provideDummyRule(DummyRuleImpl impl);

}
