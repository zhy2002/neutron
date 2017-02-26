package zhy2002.examples.register.di;

import dagger.MembersInjector;
import dagger.Module;
import dagger.Provides;
import zhy2002.examples.register.config.PropertyDetailsInvestmentPropertyNodeConfig;
import zhy2002.examples.register.gen.node.*;
import javax.inject.Singleton;

@Module
class CustomModule {

    @Provides
    @Singleton
    RegisterNodeChildProvider provideRegisterNodeChildProvider(MembersInjector<RegisterNodeChildProvider> injector) {
        return inject(injector, new RegisterNodeChildProvider() {
            @Override
            protected void configureInvestmentPropertyNode(PropertyDetailsNode node) {
                new PropertyDetailsInvestmentPropertyNodeConfig(node);
            }
        });
    }

    private static <T> T inject(MembersInjector<T> injector, T node) {
        injector.injectMembers(node);
        return node;
    }
}
