package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.MembersInjector;
import dagger.Module;
import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.gen.di.LodgementNodeChildComponent;
import zhy2002.examples.app.impl.LodgementNodeContextImpl;
import zhy2002.examples.app.impl.LodgementNodeImpl;
import zhy2002.examples.app.impl.LodgementNodeImplClassRegistry;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

@Module(subcomponents = {LodgementNodeChildComponent.class})
abstract class LodgementContextModule {

    @Binds
    @LodgementContextScope
    abstract LodgementNode provideLodgementNode(LodgementNodeImpl impl);

    @Binds
    @LodgementContextScope
    abstract LodgementNodeContext provideLodgementNodeContext(LodgementNodeContextImpl impl);

    @Binds
    @LodgementContextScope
    abstract ClassRegistryImpl provideClassRegistryImpl(LodgementNodeImplClassRegistry impl);

    @Binds
    @LodgementContextScope
    abstract UiNodeChangeEngine provideUiNodeChangeEngine(UiNodeChangeEngineImpl impl);

    @Binds
    @LodgementContextScope
    abstract UniqueIdGenerator provideSequentialUniqueIdGenerator(SequentialUniqueIdGenerator impl);

}
