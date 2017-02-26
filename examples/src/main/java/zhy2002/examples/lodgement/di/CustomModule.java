package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.Module;
import dagger.Provides;
import zhy2002.examples.lodgement.config.CurrentAddressConfig;
import zhy2002.examples.lodgement.config.EmploymentEndedNodeConfig;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.node.AddressListNodeImpl;

import javax.inject.Singleton;

@Module
public class CustomModule {

    @Provides
    @Singleton
    ApplicationNodeChildProvider provideApplicationNodeChildProvider(MembersInjector<ApplicationNodeChildProvider> injector) {
        return inject(injector, new ApplicationNodeChildProvider() {
            @Override
            protected AddressListNode newAddressListNode(ApplicationNode parent, String name) {
                return new AddressListNodeImpl(parent, name);
            }
        });
    }

    @Provides
    @Singleton
    PersonContactNodeChildProvider providePersonContactNodeChildProvider(MembersInjector<PersonContactNodeChildProvider> injector) {
        return inject(injector, new PersonContactNodeChildProvider() {
            @Override
            protected void configureCurrentAddressNode(ContactAddressNode node) {
                new CurrentAddressConfig(node);
            }
        });
    }

    @Provides
    @Singleton
    EmployedNodeChildProvider provideEmployedNodeChildProvider(MembersInjector<EmployedNodeChildProvider> injector) {
        return inject(injector, new EmployedNodeChildProvider() {
            @Override
            protected void configureEmploymentEndedNode(EmploymentEndedNode node) {
                new EmploymentEndedNodeConfig(node);
            }
        });
    }

    private static <T> T inject(MembersInjector<T> injector, T node) {
        injector.injectMembers(node);
        return node;
    }
}
