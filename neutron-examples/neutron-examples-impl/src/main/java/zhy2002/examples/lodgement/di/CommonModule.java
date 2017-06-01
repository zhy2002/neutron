package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.AddressRefListNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNodeChildProvider;
import zhy2002.examples.lodgement.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.LodgementValidationErrorListAdaptor;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeChildProviderImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeImpl;
import zhy2002.neutron.ValidationErrorListAdaptor;

import javax.inject.Singleton;

@Module
public abstract class CommonModule {

    @Binds
    @Singleton
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ApplicationNode provideApplicationNode(ApplicationNodeImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);

    @Binds
    abstract AddressRefListNode provideApplicationNodeChildProvider(AddressRefListNodeImpl impl);

}
