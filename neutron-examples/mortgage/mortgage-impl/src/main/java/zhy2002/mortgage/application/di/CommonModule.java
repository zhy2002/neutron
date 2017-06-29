package zhy2002.mortgage.application.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.mortgage.application.gen.ApplicationNodeContext;
import zhy2002.mortgage.application.gen.node.AddressRefListNode;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.ApplicationNodeContextImpl;
import zhy2002.mortgage.application.LodgementValidationErrorListAdaptor;
import zhy2002.mortgage.application.gen.node.ErrorListNode;
import zhy2002.mortgage.application.node.AddressRefListNodeImpl;
import zhy2002.mortgage.application.node.ApplicationNodeImpl;
import zhy2002.mortgage.application.node.ErrorListNodeImpl;
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
    abstract ErrorListNode provideErrorListNode(ErrorListNodeImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);

    @Binds
    abstract AddressRefListNode provideApplicationNodeChildProvider(AddressRefListNodeImpl impl);

}
