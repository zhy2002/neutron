package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.Module;
import dagger.Provides;
import zhy2002.examples.lodgement.gen.AddressListNode;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeChildProvider;
import zhy2002.examples.lodgement.impl.AddressListNodeImpl;

@Module
class CustomModule {

    @Provides
    ApplicationNodeChildProvider provideApplicationNodeChildProvider(MembersInjector<ApplicationNodeChildProvider> injector) {
        return inject(injector, new ApplicationNodeChildProvider() {
            @Override
            protected AddressListNode newAddressListNode(ApplicationNode parent, String name) {
                return new AddressListNodeImpl(parent, name);
            }
        });
    }

    private static <T> T inject(MembersInjector<T> injector, T node) {
        injector.injectMembers(node);
        return node;
    }
}
