package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.app.gen.LodgementNodeClassRegistry;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.examples.app.rule.DummyRuleImpl;
import zhy2002.examples.app.LodgementNodeContextImpl;
import zhy2002.examples.app.gen.di.ManifestModule;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.di.NeutronModule;

import javax.inject.Singleton;

@Module(includes = {NeutronModule.class, ManifestModule.class})
abstract class LodgementContextModule {

    @Binds
    @Singleton
    abstract LodgementNodeContext provideLodgementNodeContext(LodgementNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(LodgementNodeClassRegistry impl);

    @Binds
    abstract DummyRule provideDummyRule(DummyRuleImpl impl);

}
